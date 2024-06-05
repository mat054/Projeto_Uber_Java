package trabalho;

import java.util.Scanner;
import java.util.UUID;

public class Main {

    private static Dados dados = new Dados();
    private static Scanner scanner = new Scanner(System.in);
    
    

    public static void main(String[] args) {

        int opcao = -1;

        while (opcao != 0) {
            exibirMenu();
            opcao = scanner.nextInt();
            realizarOperacao(opcao);
        }

        scanner.close();
    }

    public static void exibirMenu() {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Cadastrar novo usuário");
        System.out.println("2 - Cadastrar novo motorista");
        System.out.println("3 - Cadastrar nova viagem");
        System.out.println("4 - Listar usuários");
        System.out.println("5 - Listar motoristas");
        System.out.println("6 - Listar viagens");
        System.out.println("0 - Sair");
    }

    public static void realizarOperacao(int opcao) {
        switch (opcao) {
            case 1:
                cadastrarNovoUsuario();
                break;
            case 2:
                cadastrarNovoMotorista();
                break;
            case 3:
                cadastrarNovaViagem();
                break;
            case 4:
                dados.listarUsuarios();
                break;
            case 5:
                dados.listarMotoristas();
                break;
            case 6:
                dados.listarViagens();
                break;
            case 0:
                System.out.println("Saindo do sistema. Até mais!");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

    public static void cadastrarNovoUsuario() {
        System.out.println("Cadastro de novo usuário:");
        scanner.nextLine(); // Limpar o buffer

        System.out.println("Digite o nome do usuário:");
        String nome = scanner.nextLine();
        System.out.println("Digite o número de telefone:");
        String telefone = scanner.nextLine();
        System.out.println("Digite o e-mail:");
        String email = scanner.nextLine();
        System.out.println("Digite a senha:");
        String senha = scanner.nextLine();

        Usuario novoUsuario = new Usuario(nome, telefone, email, senha);
        dados.cadastrarUsuario(novoUsuario);
        System.out.println("Usuário cadastrado com sucesso!");
    }

    public static void cadastrarNovoMotorista() {
        scanner.nextLine(); // Limpa o buffer

        System.out.println("Cadastro de novo motorista:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("E-mail: ");
        String email = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();
        System.out.print("Modelo do carro: ");
        String modeloCarro = scanner.nextLine();
        System.out.print("Placa do carro: ");
        String placa = scanner.nextLine();
        System.out.print("Cor do carro: ");
        String corVeiculo = scanner.nextLine();
        System.out.print("Bairro: ");
        String bairro = scanner.nextLine();

        Motorista novoMotorista = new Motorista(nome, telefone, email, senha, modeloCarro, placa, corVeiculo, bairro);
        dados.cadastrarMotorista(novoMotorista);
        System.out.println("Motorista cadastrado com sucesso!\n");
    }

    public static void cadastrarNovaViagem() {
        System.out.println("Cadastro de nova viagem:");

        // Solicitar os dados da viagem ao usuário
        System.out.println("Origem da viagem:");
        String origem = scanner.next();

        System.out.println("Destino da viagem:");
        String destino = scanner.next();

        System.out.println("Data da viagem:");
        String data = scanner.next();

        System.out.println("Horário da viagem:");
        String horario = scanner.next();

        // Verifica se o motorista existe, se não existir, cria um novo
        Motorista motorista = dados.buscarMotoristaPorNome("MotoristaExemplo");
        if (motorista == null) {
            // Se o motorista não existir, pode criar um novo ou implementar a lógica desejada
            motorista = new Motorista("Novo Motorista", "Novo Telefone", "novoemail@example.com", "novasenha",
                    "Novo Modelo", "Nova Placa", "Nova Cor", "Novo Bairro");
            dados.cadastrarMotorista(motorista);
        }

        // Verifica se o usuário existe, se não existir, cria um novo
        Usuario usuario = dados.buscarUsuarioPorNome("UsuarioExemplo");
        if (usuario == null) {
            // Se o usuário não existir, pode criar um novo ou implementar a lógica desejada
            usuario = new Usuario("Novo Usuário", "Novo Telefone", "novoemail@example.com", "novasenha");
            dados.cadastrarUsuario(usuario);
        }

        // Criar uma nova viagem
        Viagem novaViagem = new Viagem(origem, destino, horario, data, 0.0, UUID.randomUUID().toString());

        // Adicionar a viagem ao sistema usando a classe Dados
        dados.cadastrarViagem(motorista, usuario, novaViagem);
        System.out.println("Viagem cadastrada com sucesso!");
    }


    
    
    
    
}
