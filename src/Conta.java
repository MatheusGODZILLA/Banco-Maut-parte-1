public class Conta {
    private String numeroAgencia;
    private String numeroConta;
    private double saldo;
    private Cliente cliente;

    public Conta(String numeroAgencia, String numeroConta, double saldo, Cliente cliente){
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void depositar(double valor){
        saldo += valor;
        System.out.println("Depósito concluído com êxito");
    }

    public void sacar(double valor){
        if (valor <= saldo){
            saldo -= valor;
            System.out.println("Saque concluído com êxito");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void transferir(Conta destino, double valor){
        if (valor <= saldo){
            saldo -= valor;
            System.out.println("Transferência concluída com êxito");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
