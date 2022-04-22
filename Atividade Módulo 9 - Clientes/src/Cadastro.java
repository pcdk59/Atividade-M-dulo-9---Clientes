import java.util.ArrayList;
import java.util.Comparator;
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
        Comparator<Clientes> comparatorMais = Comparator.comparing(Clientes::getCompras);
        List<Clientes> MaisComprados = lista.stream().max(comparatorMais).stream().toList();
        System.out.println(MaisComprados);

        Comparator<Clientes> comparatorMenos = Comparator.comparing(Clientes::getCompras);
        List<Clientes> MenosComprados = lista.stream().min(comparatorMenos).stream().toList();
        System.out.println(MenosComprados);

    }

    public void media() {
        double media = lista.stream().mapToDouble(Clientes::getCompras).average().getAsDouble();
        System.out.println(media);

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
