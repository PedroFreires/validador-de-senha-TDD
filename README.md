# validador-de-senha-TDD
Aplicação Android simples de Teste de Senha de usuário para treinar TDD (Test-Driven Development) usando JUnit em Java.
Esses testes foram feitos antes da aplicação na estrutura principal, usando as pastas de teste disponibilizados pela IDE (Android Studio) no momento da criação do projeto.

Os métodos Principais do JUnit usados para testes foram assertFalse e assertTrue da Classe Assert.java

## Pasta de Testes (local do teste)
Na estrutura Android:

validaSenhaTDD/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   └── java/
│   │   │       └── com/example/validasenhatdd/ ⬅️ Código de Produção (ValidadorDeSenha.java)
│   │   ├── test/
│   │   │   └── java/
│   │   │       └── com/example/validasenhatdd/ ⬅️ Testes Unitários Locais (ValidadorSenhaTeste.java)
│   │   └── androidTest/
│   │       └── java/
│   │           └── com/example/validasenhatdd/ ⬅️ Testes de Instrumentação (Android)
│   └── manifests/ ⬅️ AndroidManifest.xml
└── build.gradle
