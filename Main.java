import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CentralAtendimento central = new CentralAtendimento();
        int opcao = -1;

        do {
            System.out.println("\n===================================");
            System.out.println("      CENTRAL DE ATENDIMENTO       ");
            System.out.println("===================================");
            System.out.println("1 - Cadastrar nova solicitação");
            System.out.println("2 - Consultar próxima solicitação");
            System.out.println("3 - Atender próxima solicitação");
            System.out.println("4 - Exibir fila de solicitações");
            System.out.println("5 - Exibir quantidade de solicitações");
            System.out.println("6 - Consultar última operação realizada");
            System.out.println("7 - Exibir histórico de operações");
            System.out.println("8 - Desfazer última operação");
            System.out.println("0 - Encerrar");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do teclado

            switch (opcao) {
                case 1:
                    System.out.print("Código: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Solicitante: ");
                    String solicitante = scanner.nextLine();
                    
                    System.out.print("Descrição: ");
                    String descricao = scanner.nextLine();
                    
                    System.out.print("Categoria: ");
                    String categoria = scanner.nextLine();
                    
                    System.out.print("Prioridade (Número): ");
                    int prioridade = scanner.nextInt();
                    scanner.nextLine();
                    
                    Solicitacao nova = new Solicitacao(codigo, solicitante, descricao, categoria, prioridade, "AGUARDANDO");
                    central.cadastrarSolicitacao(nova);
                    break;
                case 2:
                    central.consultarProxima();
                    break;
                case 3:
                    central.atenderProxima();
                    break;
                case 4:
                    central.exibirFila();
                    break;
                case 5:
                    central.exibirQuantidade();
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Funcionalidade da Pilha em desenvolvimento...");
                    break;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}