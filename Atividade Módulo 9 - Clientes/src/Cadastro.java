import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cadastro extends Clientes implements Autentica{

    public Cadastro(String nome, int compras, String senha) {
        super(nome, compras, senha);
    }

    ArrayList<Clientes> lista = new ArrayList<Clientes>();

    public void cadastro(String nome, int compras, String senhas) {
        Clientes usuarios = new Clientes(nome, compras, nome);
        usuarios.setNome(nome);
        usuarios.setCompras(compras);
        usuarios.setSenha(senhas);
        lista.add(usuarios);

    }

    public void lista() {
        List<Clientes> MaisComprados = lista.stream().filter(c -> c.getCompras() >= 20).collect(Collectors.toList());
        System.out.println("-----------------------------");
        MaisComprados.forEach(c -> System.out
                .println("Maiores compradores: " + c.getNome() + " | Quantidade de compras: " + c.getCompras()));

        List<Clientes> MenosComprados = lista.stream().filter(c -> c.getCompras() <= 19).collect(Collectors.toList());
        MenosComprados.forEach(c -> System.out
                .println("Menores compradores: " + c.getNome() + " | Quantidade de compras: " + c.getCompras()));

    }

    public void media() {
        double soma = lista.stream().mapToDouble(c -> c.getCompras()).sum();
        System.out.println(soma / lista.size());

    }

    public boolean autenticador(String senha, String nome) {

        for (Clientes lista : lista) {
            if (lista.getNome().equals(senha) && lista.getSenha().equals(nome)) {
                System.out.println("Logado com sucesso");

            } else {
                System.out.println("Senha inválida");

            }
        }
        return false;

    }
}
