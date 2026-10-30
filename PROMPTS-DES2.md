# PROMPTS: Grupo ____

**Integrantes:**

1.Pedro
2.Matheus
3.Caua

**Prova:** API em MVC

**Usamos IA?** (x) Sim  ( ) Não

**Qual ferramenta e modelo (se usaram):**

> Quem não usou IA: troque "prompt" por "passo". Em cada bloco abaixo, descreva o que vocês fizeram naquele passo, na ordem em que aconteceu, e preencha os outros campos do mesmo jeito.

## Registro, na ordem

Copie o bloco abaixo para cada prompt. Escreva o prompt exatamente como foi enviado.

### Prompt 1
Enviei o que foi pedido no PROVA-MVC e pedi para o chatgpt explicar o que deveria ser feito em passo a passo
**O prompt (cópia exata):**
Crie uma API REST de reserva de salas usando Java Spring Boot, aproveitando o projeto Escola-base.
> 

**O que a IA devolveu (uma ou duas linhas):**
- **Model:** criar a classe Sala com id, código, nome, capacidade e status de reserva, incluindo validações.
- **Repository:** fazer a comunicação com o banco H2, permitindo salvar, buscar, listar e excluir salas.
- **Service:** implementar as regras, como impedir códigos duplicados, reservas repetidas e exclusão de salas reservadas.
- **Controller:** criar as rotas HTTP para cadastrar, listar, buscar, reservar, liberar e excluir salas.

Utilize os status HTTP corretos (200, 201, 204, 400, 404 e 409). Organize cada camada em seu pacote e mantenha o código simples, funcional e fácil de entender.
**O que fizemos com a resposta:** (x) usamos como veio  ( ) alteramos  ( ) descartamos

**Por quê (o que conferimos, o que mudamos):**
Porque foi apenas uma mensagem explicativa
### Prompt 2
Service
**O prompt (cópia exata):**
Me explique o que deve ser feito no Service
> 

**O que a IA devolveu (uma ou duas linhas):**
A Service é responsável pelas regras de negócio da API.
- @Service: identifica a classe como um serviço.
- cadastrar(): valida os dados, verifica se o código já existe e salva a sala como livre.
- listar(): retorna todas as salas cadastradas.
- buscar(): procura uma sala pelo ID.
- reservar(): verifica se está livre e realiza a reserva.
- liberar(): verifica se está reservada e a libera.
- excluir(): exclui a sala somente se estiver livre.
**O que fizemos com a resposta:** (x) usamos como veio  (x) alteramos  ( ) descartamos

**Por quê (o que conferimos, o que mudamos):**
Ele explicou o que deve conter no service, eu pedi para ele explicar quais codigos deveriam ter e a funçao deles

## Como conferimos

Descrevam como vocês testaram o que ficou pronto. Colem aqui a saída do programa (POO) ou o resultado do roteiro (API) e digam se bateu com a tabela da prova. Se não bateu, digam o que fizeram.

## Onde a IA errou, ou onde nós erramos

Contem pelo menos um erro que apareceu durante a prova: o que era, como perceberam e como resolveram. Se não apareceu nenhum, expliquem como vocês têm certeza disso.

## Respostas finais, sem consultar a IA

Respondam com as suas palavras, nos últimos 5 minutos. Não copiem de lugar nenhum.

**Pergunta 1:**

**Pergunta 2:**

**Pergunta 3:**
