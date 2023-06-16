package Exercico1_ABSTRACT;

import java.util.ArrayList;
import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Item> catalogo = new ArrayList<>();
        catalogo.add(new Cd("Infest",16.99, 13, 111111));
        catalogo.add(new Livro("Trono de Vidro", 49.99,"Sarah J Maas", 222222));
        catalogo.add(new Livro("A Vida Invisível de Addie LaRue", 39.99, "V. E. Schwab", 333333));
        catalogo.add(new Livro("Magnus Chase: A Espada do Verão", 35.99, "Rick Riordan", 444444));
        catalogo.add(new Dvd("Hush", 13.99, 87, 555555));

        System.out.println("---------- CATÁLOGO ----------");
        for (Item i : catalogo){
            i.mostrarDetalhesDoItem();
        }
        System.out.println("-------- FIM CATÁLOGO --------");

        System.out.println("\n------------ BUSCA ------------\n");

        System.out.println("Códigos de barras dos produtos:");
        for (Item i : catalogo){
            System.out.print(i.getCodigoDeBarras()+"\t");
        }

//        System.out.println("\nDigite o código de barras que deseja pesquisar:");
//        int codigo = input.nextInt();
        int codigo = 222222;
        boolean encontrado = false;
        for (Item i : catalogo){
            if (codigo == i.getCodigoDeBarras()){
                encontrado = true;
                System.out.println("\n\nO seguinte produto foi encontrado na posição "+ catalogo.indexOf(i));
                i.mostrarDetalhesDoItem();
                break;
            }
        }
        if (!encontrado){
            System.out.println("\n\nProduto não encontrado.");
        }

        System.out.println("\n---------- FIM BUSCA ----------\n");

        System.out.println("\n-------- TESTE EQUALS --------\n");
        Item l0 = new Livro("Trono de Vidro", 49.99,"Sarah J Maas", 222222);
        Item l1 = new Livro("A Lâmina da Assassina", 49.99,"Sarah J Maas", 222222);
        Item l2 = new Livro("Trono de Vidro", 49.99,"Sarah J Maas", 999999);

        l0.mostrarDetalhesDoItem();
        System.out.println("Mesmos nomes e mesmo código de barras. Resultado equals: "+ l0.equals(catalogo.get(1)));

        l1.mostrarDetalhesDoItem();
        System.out.println("Nomes diferentes, mesmo código de barras. Resultado equals: "+ l1.equals(catalogo.get(1)));

        l2.mostrarDetalhesDoItem();
        System.out.println("Mesmos dados, exceto código de barras. Resultado equals: "+l2.equals(catalogo.get(1)));

        System.out.println("\n------ FIM TESTE EQUALS ------\n");

    }
}
