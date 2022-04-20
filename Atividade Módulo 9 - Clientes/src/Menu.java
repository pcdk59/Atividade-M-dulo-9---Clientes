import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Cadastro cadastrados = new Cadastro("", 0, "");
        int opcao = 0;

        do{
            System.out.println("---------------------------------------");
            System.out.println("          Opção 1: Entrar           ");
            System.out.println("         Opção 2: Cadastrar         ");
            System.out.println("      Opção 3: Ver média de compras ");
            System.out.println("Opção 4: Mais vendidos e Menos vendidos");
            System.out.println("      Opção 5: Sair do programa     ");
            System.out.println("---------------------------------------");

            Scanner menu = new Scanner(System.in);
            System.out.print("Digite uma opção: ");
            opcao = menu.nextInt();

            switch (opcao){
                case 1:
                    Scanner login = new Scanner(System.in);
                    System.out.print("Digite seu nome cadastrado: ");
                    String nome1 = login.nextLine();


                    System.out.print("Digite a sua senha cadastrada: ");
                    String senha1 = login.nextLine();
                    cadastrados.autenticador(nome1, senha1);

                    break;

                case 2:
                    Scanner cliente = new Scanner(System.in);
                    System.out.print("Digite o seu nome: ");
                    String nomes = cliente.nextLine();

                    System.out.print("Digite a sua senha: ");
                    String senhas = cliente.nextLine();

                    System.out.print("Quantas compras feita: ");
                    int compras = cliente.nextInt();
                    cadastrados.cadastro(nomes, compras, senhas);
                    break;

                case 3:
                    cadastrados.media();
                    break;

                case 4:
                    cadastrados.lista();
                    break;

                case 5:
                    System.out.println("O programa será encerrado com sucesso.");
                    break;

            }
        }while(opcao<5);
    }
}
