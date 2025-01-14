# 🎵 Projeto - Melhorar a Interface de Dados retornados pela API do Spotify em Java com Spring OpenFeign  

🚀 Este projeto demonstra como integrar a API do Spotify com Spring OpenFeign para retornar dados organizados e exibir informações de forma mais legível e útil para os usuários.

---

## 📚 O que você aprenderá

- Como configurar um cliente API usando Spring OpenFeign.
- Organizar e exibir as informações retornadas pela API do Spotify de forma mais clara e estruturada.
- Criar endpoints no backend para formatar os dados retornados de forma mais legível.

### Funcionalidades

- **Nome do Álbum**: Exibição do nome do álbum.
- **Artista Principal**: Nome do artista ou banda principal do álbum.
- **Imagem do Álbum**: URL da imagem de capa do álbum.
- **Data de Lançamento**: Data oficial de lançamento do álbum.
- **Número de Faixas**: Contagem total de faixas no álbum.

## 📋 Etapas do Projeto  

### 1. Tarefas

- **Configurar o Endpoint para Retornar Dados Mais Completos**:
  - Identificar o endpoint responsável por buscar os dados da API do Spotify.
  - Criar métodos para buscar os dados necessários como nome do álbum, artista principal, imagem, data de lançamento e número de faixas.

- **Formatar os Dados para Facilitar a Leitura**:
  - Criar DTOs para organizar e mapear os dados retornados pela API.
  - Melhorar a apresentação das informações para exibição no frontend.

- **Testar no Backend para Garantir que o Retorno Está Funcionando Corretamente**:
  - Testar a integração do cliente API com o Spotify.
  - Verificar se os dados estão sendo retornados no formato correto.

### 2. Configuração do OpenFeign

Configure o cliente OpenFeign no backend para se comunicar com a API do Spotify. Isso inclui configurar a autenticação necessária (via token) e definir os métodos para consumir a API corretamente.

### 3. Estrutura do Projeto  

Organize o projeto como abaixo:

```plaintext
src/main/java  
└── com  
    └── hildo  
        └── costa  
            └── spotify_api  
                ├── SpotifyApiApplication.java         # Classe principal para execução do Spring Boot  
                ├── controller  
                │   └── AlbumController.java           # Controlador que gerencia as requisições da API  
                ├── client  
                │   ├── Album.java                    # Modelo para representar o álbum  
                │   ├── AlbumResponse.java            # Resposta da API do Spotify com os dados do álbum  
                │   ├── AlbumSpotifyClient.java       # Cliente Feign para consumir a API do Spotify  
                │   ├── AlbumWrapper.java             # Wrapper para encapsular dados do álbum  
                │   ├── AuthSpotifyClient.java        # Cliente para autenticação via token  
                │   ├── GoogleClient.java             # Cliente para integrar com Google API (caso necessário)  
                │   ├── LoginRequest.java             # DTO para login via API  
                │   └── LoginResponse.java            # Resposta da API para login  
                ├── dto  
                    ├── AlbumDTO.java                # DTO para retornar informações formatadas sobre o álbum

---

## 🚀 Execução  

1. Configure suas credenciais do Spotify no `AlbumController`.
2. Inicie a aplicação com o comando:  

```bash
mvn spring-boot:run
```

3. Acesse o endpoint:  
```
GET http://localhost:8080/spotify/api/albums
```

---

## 📦 Dependências  

As dependências principais utilizadas neste projeto são:  

- **Spring Boot 3.4.1**  
- **Spring Web**  
- **Spring OpenFeign**  
- **Jackson** (para manipulação de JSON)

---

## 📝 Observações  

Certifique-se de substituir `CLIENT_ID` e `CLIENT_SECRET` pelas suas credenciais do Spotify. Não exponha essas informações publicamente.  

---

## 📜 Licença  

Este projeto é de uso livre para fins educacionais.
```
