public class Clientes {

    private String nome;
    private Integer compras;
    private String senha;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCompras() {
        return compras;
    }

    public int setCompras(int compras){
        return this.compras = compras;
    }

    public Clientes(String nome, int compras, String senha){
        this.nome = nome;
        this.compras = compras;
        this.senha = senha;
    }

    public String getSenha(){
        return senha;
    }
    public String setSenha(String senha){
        return this.senha = senha;
    }

    @Override
    public java.lang.String toString() {
        return "Clientes{" +
                "nome='" + nome + '\'' +
                ", compras=" + compras +
                ", senha='" + senha + '\'' +
                '}';
    }
}
