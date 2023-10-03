public class Usuario{
    private String email;
    private String senha;
    private Cliente cliente;

    public Usuario(String email, String senha, Cliente cliente){
        this.email = email;
        this.senha = senha;
        this.cliente = cliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Cliente getCliente() {
        return cliente;
    }
}