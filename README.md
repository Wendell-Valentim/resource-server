Resource Server - OAuth2 & JWT Validation
Este projeto foi desenvolvido como um laboratório prático para demonstrar a implementação de um Resource Server utilizando Spring Security 6 e OAuth2.

O que este projeto faz?
A principal função desta API é atuar como um servidor de recursos protegido. Embora ela não possua banco de dados de usuários ou lógica de login própria, ela é capaz de:

Validar Tokens JWT: A API confia em um Authorization Server externo (minha libraryapi) para validar a autenticidade dos tokens recebidos via Header Authorization.

Comunicação Desacoplada: Utiliza a diretriz issuer-uri no application.yml para baixar automaticamente as chaves públicas do servidor de identidade e validar as requisições na porta 8081.

Reconhecimento de Authorities: Implementa um JwtAuthenticationConverter customizado para extrair as permissões (roles) do usuário diretamente do payload do token, permitindo controle de acesso granular.

Tecnologias Utilizadas:
Java 21

Spring Boot 3.3.4

Spring Security OAuth2 Resource Server
