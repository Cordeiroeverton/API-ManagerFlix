# ManagerFlix

O projeto ManagerFlix , O ManagerFlix é um controle de séries e filmes, sendo cadastrados os titulos desejado e acompanhar o status se o titulo foi concluido ou ainda está em andamento.

## Diagramas
#### Modelo Conceitual
<img src="https://ik.imagekit.io/mqcofkwbshx/BecaDesafio_87JOvaZ8w.jpeg?ik-sdk-version=javascript-1.4.3&updatedAt=1642700597356">


#### Instância
<img src="https://ik.imagekit.io/mqcofkwbshx/BecaModeloInstancia___wVp3rBGZ.jpg?ik-sdk-version=javascript-1.4.3&updatedAt=1642716647130">


# Endpoints
Para realziar testes da API é necessário que uma aplicação cliente que faça requisições aos endpoints usando ferramenta Postman  ou Insomnia por meio do envio de requisições HTTP e obter retorno.


| Requisições                                  | Descrição                                                    |
| -------------------------------------------- | ------------------------------------------------------------ |
| POST `/titulos/cadastrar`                      | Cadastra Titulos novos.|
| GET `/titulos/obter`    | Retorna uma titulo desejado. |
| PATCH `/titulos/atualizar` | Retorna titulo atualizado.        |
| DELETE `/titulos/deletar/`                     |Retorna titulo deletado atráves do id.                   |
| GET `/titulos`                          | Retorna uma lista com todos os titulos criados.           |
| POST `/categoria/cadastrar`                        | Retorna para cadastro de uma categoria.    |
| GET `/categoria/obter/23`        | Retorna lista de uma categoria através do id. |
| PATCH `/categoria/atualizar/89'`     | Retorna uma categoria atualizada através do id.        |
| GET `/categoria`    | Retorna uma lista com todas as categorias. |
| DELETE `/categoria/deletar/233`    | Retorna uma categoria deletada através do id. |
| POST `/usuarios/cadastrarUsuarios`    | Retorna para cadastro de um usuario. |
| GET `/usuarios/obterUsuarios/2`    | Retorna uma lista com usuário pelo id. |
| PATCH `/usuarios/atualizarUsuarios/39`    | Retorna  um usuário atualiado pelo id. |
| DELETE `/usuarios/deletarUsuarios/231`    | Retorna usuario deletado atraves do id. |
| GET `/assistidos/obterTtituloAssistido/2`    | Retorna uma lista titulo  já assistido atraves do id. |
| PATCH `/assistidos/atualizarTitulosAssistido/8`    | Retorna  titulo atualizado   atraves do id. |
| GET `/assistidos`    | Retorna uma lista com todos os titulos já assistidos. |
| DELETE `/assistidos/deletar/2`    | Retorna uma titulo já assistido deletado atrás do id. |
| GET `/assistindo/obter/2`    | Retorna uma titulo que está em andamento pelo id. |
| PATCH `/assistindo/mudarStatus/89`    | Retorna titulo pelo id e seu status concluido ou em andamento. |
| GET `/assistindo`    | Retorna uma lista com todos os titulos que estão sendo assistidos no momento. |
| DELETE `/assistindo/deletar/23`    | Retorna titulo deletado pelo id. |

## 🛠️ Construído com

* [Java](http://www.dropwizard.io/1.0.2/docs/) - Linguagem usada
* [Springbot](https://maven.apache.org/) - Framework usado

* [DTO](https://maven.apache.org/) - Objeto de Transferência de Dados (do inglês, Data transfer object, ou simplesmente DTO

* [BANCO DE DADOS H2](https://maven.apache.org/) - H2 é um sistema de gerenciamento de banco de dados relacional escrito em Java. Ele pode ser incorporado em aplicativos Java ou executado no modo cliente-servidor.

## ✒️ Autor

* **Everton Fernando Cordeiro**  - [Everton Fernando Cordeiro](https://github.com/Cordeiroeverton)


