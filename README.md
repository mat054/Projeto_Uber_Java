# Descrição - Projeto Uber

Este projeto tem como objetivo criar um modelo simplificado do sistema de gerenciamento de viagens, similar ao Uber, utilizando os princípios de Orientação a Objetos (OO). A aplicação gerencia dados de usuários, motoristas e viagens, permitindo o cadastro, listagem e busca de informações relacionadas.

### Estrutura do Projeto

O projeto é composto por três principais entidades:
- **Usuário**
- **Motorista**
- **Viagem**

Essas entidades são gerenciadas pela classe `Dados`, que contém listas de usuários, motoristas e viagens, além de métodos para manipulação desses dados.

### Classes e Métodos

#### Classe `Dados`

A classe `Dados` é responsável por armazenar e gerenciar as listas de usuários, motoristas e viagens. Abaixo estão os principais métodos e suas descrições:

- **Construtor**
  - `public Dados()`: Inicializa as listas e preenche com dados de exemplo através do método `preencherDados()`.

- **Getters e Setters**
  - `public ArrayList<Usuario> getListaUsuario()`
  - `public void setListaUsuario(ArrayList<Usuario> listaUsuario)`
  - `public ArrayList<Motorista> getListaMotorista()`
  - `public void setListaMotorista(ArrayList<Motorista> listaMotorista)`

- **Métodos de Cadastro**
  - `public void cadastrarUsuario(Usuario usuario)`: Adiciona um usuário à lista de usuários.
  - `public void cadastrarMotorista(Motorista motorista)`: Adiciona um motorista à lista de motoristas.
  - `public void cadastrarViagem(Viagem viagem)`: Adiciona uma viagem à lista de viagens.

- **Métodos de Adição**
  - `public void adicionarViagensMotoristas(ArrayList<Motorista> motoristas)`: Adiciona todas as viagens dos motoristas à lista central de viagens.
  - `public void adicionarViagensUsuarios(ArrayList<Usuario> usuarios)`: Adiciona todas as viagens dos usuários à lista central de viagens.

- **Métodos de Listagem**
  - `public void listarUsuarios()`: Exibe a lista de usuários.
  - `public void listarMotoristas()`: Exibe a lista de motoristas.
  - `public void listarViagens()`: Exibe a lista de viagens.

- **Métodos de Busca**
  - `public Usuario buscarUsuarioPorNome(String nomeUsuario)`: Busca um usuário pelo nome.
  - `public Usuario buscarUsuarioPorEmail(String email)`: Busca um usuário pelo email.
  - `public Motorista buscarMotoristaPorNome(String nome)`: Busca um motorista pelo nome.
  - `public Motorista buscarMotoristaPorPlaca(String placa)`: Busca um motorista pela placa.
  - `public Viagem buscarViagemPorId(String id)`: Busca uma viagem pelo ID.
  - `public Viagem buscarViagemPorData(String data)`: Busca uma viagem pela data.

- **Método de Preenchimento de Dados**
  - `public void preencherDados()`: Preenche as listas com dados de exemplo.

#### Classe `Usuario`

Representa os usuários do sistema. Possui atributos como nome, telefone, email e senha. Além disso, métodos para manipulação e recuperação desses dados.

#### Classe `Motorista`

Representa os motoristas do sistema. Além dos atributos básicos de um usuário, possui informações adicionais como modelo, placa, cor do carro e bairro.

#### Classe `Viagem`

Representa as viagens no sistema. Possui atributos como origem, destino, horário, data, valor e ID.

### Como Utilizar

#### Instalação

1. **Clonar o repositório:**
   ```sh
   git clone <url-do-repositorio>
   cd <nome-do-repositorio>
   ```

2. **Compilar e executar o projeto:**
   - Utilize uma IDE como IntelliJ IDEA ou Eclipse.
   - Importe o projeto como um projeto Java.
   - Compile e execute o arquivo principal.

#### Funcionalidades

- **Cadastro de Usuários e Motoristas:**
  ```java
  dados.cadastrarUsuario(new Usuario("nome", "telefone", "email", "senha"));
  dados.cadastrarMotorista(new Motorista("nome", "telefone", "email", "senha", "modelo", "placa", "cor", "bairro"));
  ```

- **Listagem de Usuários, Motoristas e Viagens:**
  ```java
  dados.listarUsuarios();
  dados.listarMotoristas();
  dados.listarViagens();
  ```

- **Busca de Usuários, Motoristas e Viagens:**
  ```java
  Usuario usuario = dados.buscarUsuarioPorNome("nome");
  Motorista motorista = dados.buscarMotoristaPorNome("nome");
  Viagem viagem = dados.buscarViagemPorId("id");
  ```

- **Adicionar Viagens:**
  ```java
  dados.cadastrarViagem(new Viagem("origem", "destino", "horario", "data", 100.0, "id"));
  ```

### Contribuição

Para contribuir com o projeto, siga os passos abaixo:

1. **Fork o repositório**
2. **Crie uma nova branch para sua feature:**
   ```sh
   git checkout -b minha-feature
   ```
3. **Commit suas mudanças:**
   ```sh
   git commit -m "Descrição das minhas mudanças"
   ```
4. **Push para a branch:**
   ```sh
   git push origin minha-feature
   ```
5. **Abra um Pull Request**


---

### Contato

Para mais informações, entre em contato com Mateus através do email [mateus.castro3@gmail.com](mailto:mateus.castro3@gmail.com).

---

