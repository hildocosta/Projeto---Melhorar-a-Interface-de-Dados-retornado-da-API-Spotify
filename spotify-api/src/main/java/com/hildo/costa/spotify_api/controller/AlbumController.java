package com.hildo.costa.spotify_api.controller;

import com.hildo.costa.spotify_api.client.AlbumSpotifyClient;
import com.hildo.costa.spotify_api.client.AuthSpotifyClient;
import com.hildo.costa.spotify_api.client.LoginRequest;
import com.hildo.costa.spotify_api.dto.AlbumDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/spotify/api")
public class AlbumController {

    private final AuthSpotifyClient authSpotifyClient;
    private final AlbumSpotifyClient albumSpotifyClient;

    public AlbumController(AuthSpotifyClient authSpotifyClient,
                           AlbumSpotifyClient albumSpotifyClient) {
        this.authSpotifyClient = authSpotifyClient;
        this.albumSpotifyClient = albumSpotifyClient;
    }

    @GetMapping("/albums")
    public ResponseEntity<List<AlbumDTO>> getAlbums() {

        // 1. Realizar login para obter o token
        var request = new LoginRequest(
                "client_credentials",
                "1be0acc716a2429388d0db76f548f933",
                "0ea7b00085ac4e43908365c8ad6860df"
        );
        var token = authSpotifyClient.login(request).getAccessToken();

        // 2. Buscar álbuns da API do Spotify
        var response = albumSpotifyClient.getReleases("Bearer " + token);

        // 3. Mapear os álbuns para o DTO
        List<AlbumDTO> albums = response.getAlbums().getItems().stream().map(album -> new AlbumDTO(
                album.getName(),
                album.getArtists().stream()
                        .findFirst()
                        .map(artist -> artist.getName())
                        .orElse("Unknown Artist"),
                album.getImages().stream()
                        .findFirst()
                        .map(image -> image.getUrl())
                        .orElse(""),
                album.getReleaseDate(),
                album.getTotalTracks()
        )).toList();

        // 4. Retornar a lista formatada
        return ResponseEntity.ok(albums);
    }
}
