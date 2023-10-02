public class App2 {
    Cliente cliente1 = new Cliente("João Silva", "123.456.789-00", "01/01/1990", "Rua A, 123");
    Cliente cliente2 = new Cliente("Maria Souza", "987.654.321-00", "15/05/1985", "Avenida B, 456");

        Conta conta1 = new Conta("001", "12345", 0, cliente1);
        Conta conta2 = new Conta("002", "67890", 0, cliente2);

        conta1.depositar(1000.0);
        conta2.depositar(500.0);

        conta1.sacar(200.0);

        conta1.transferir(conta2, 300.0);

        System.out.println("Saldo da conta de " + cliente1.getNome() + ": R$" + conta1.getSaldo());
        System.out.println("Saldo da conta de " + cliente2.getNome() + ": R$" + conta2.getSaldo());
    }
}
