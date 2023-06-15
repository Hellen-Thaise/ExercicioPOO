package Ex1_ClassesAbstratas;

import java.util.ArrayList;
import java.util.Scanner;

public class Loja {
    static int cod_Barras;

    //Método MAIN
    public static void main(String[] args) {

        //Criação do Array de produtos
        ArrayList<Produto> produtos = new ArrayList<Produto>();

        //Cadastro de produtos
        CD cd0 = new CD(256987451);
        cd0.dados("RBD", 20.00, 10);


        CD cd1 = new CD(124897563);
        cd1.dados("Nickelback", 25.00, 18);

        DVD dvd0 = new DVD(123123123);
        dvd0.dados("Titanic", 30.00, "3:14");

        Livros livro0 = new Livros(123456789);
        livro0.dados("Harry Potter e o Enigma do Príncipe", 25.00, "J. K. Rowling");

        Livros livro1 = new Livros(897543126);
        livro1.dados("Código limpo: Habilidades práticas do Agile", 35.00, "Robert C. Martin");

        //Inclusão dos produtos na Arraylist
        produtos.add(cd0);
        produtos.add(cd1);
        produtos.add(dvd0);
        produtos.add(livro0);
        produtos.add(livro1);

        //Impressão dos produtos já cadastrados
        for (Produto produto : produtos){
            System.out.println(produto.mostrarDetalhesDoItem());
        }


        //Busca do produto
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nInforme o código de barras do produto: ");

        cod_Barras = entrada.nextInt();
        Loja.LocalizaProd(produtos, cod_Barras);

    }

    public static void LocalizaProd(ArrayList<Produto> produtos, int cod_Barras)
    {
        for (Produto produto : produtos){
            if (produto.GetCod_Barras() == cod_Barras){
                System.out.println(produto.mostrarDetalhesDoItem());
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }
}
