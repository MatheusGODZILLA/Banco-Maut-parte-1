import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Cliente cliente1 = new Cliente("Matheus", "123.456.789-00", "21/06/2003", "Rua A, 123");
        //Cliente cliente2 = new Cliente("Pedro Henrique", "987.654.321-00", "15/05/2002", "Avenida B, 456");

        Conta conta1 = new Conta("001", "12345", 0, cliente1);
        //Conta conta2 = new Conta("002", "67890", 0, cliente2);

        //conta1.depositar(1000.0);
        //conta2.depositar(500.0);

        //conta1.sacar(200.0);

        //conta1.transferir(conta2, 300.0);

        //System.out.println("Saldo da conta de " + cliente1.getNome() + ": R$" + conta1.getSaldo());
        //System.out.println("Saldo da conta de " + cliente2.getNome() + ": R$" + conta2.getSaldo());

        System.out.println("//-- Aplicativo de Conta Bancária --//");

        menu(conta1, scanner);

        scanner.close();
    }

    public static void menu(Conta conta, Scanner scanner) {
        System.out.println("1. Informações");
        System.out.println("2. Depósito");
        System.out.println("3. Saque");
        System.out.println("4. Transferência");
        System.out.println("5. Sair do app");

        System.out.print("\nSelecione uma opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Informações do Usuário:");
                System.out.println("Email " + conta.getUsuario().getEmail());

                System.out.println("Informações do Cliente:");
                System.out.println("Nome: " + conta.getCliente().getNome());
                System.out.println("CPF: " + conta.getCliente().getCPF());
                System.out.println("Data de Nascimento: " + conta.getCliente().getDataNascimento());
                System.out.println("Endereço: " + conta.getCliente().getEndereco());

                System.out.println("\nInformações da Conta:");
                System.out.println("Saldo da conta de: R$" + conta.getSaldo());
                System.out.println("\n");
                menu(conta, scanner);
                break;

            case 2:
                System.out.print("\nInforme o valor para depósito: ");
                double valorDeposito = scanner.nextDouble();
                conta.depositar(valorDeposito);
                menu(conta, scanner);
                break;

            case 3:
                System.out.print("\nInforme o valor para saque: ");
                double valorSaque = scanner.nextDouble();
                conta.sacar(valorSaque);
                menu(conta, scanner);
                break;

            case 4:
                //System.out.print("Número da Conta de Destino: ");
                //int numeroContaDestino = scanner.nextInt();
                Cliente cliente2 = new Cliente("Pedro Henrique", "987.654.321-00", "15/05/2002", "Avenida B, 456");
                Conta conta2 = new Conta("002", "67890", 0, cliente2);
                if (conta2 != null) {
                    System.out.print("\nInforme o valor para transferência: ");
                    double valorTransferencia = scanner.nextDouble();
                    conta.transferir(conta2, valorTransferencia);
                    menu(conta, scanner);
                }
                break;

                case 5:
                    System.out.println("\nValeu!");
                    scanner.close();
                    break;

                default:
                System.out.println("\nOpção inválida. Tente novamente.");
                menu(conta, scanner);
        }
    }
}