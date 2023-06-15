package Ex1_ClassesAbstratas;

public class Livros extends Produto {

    private String autor;

    public Livros(int cod_Barras) {
        super(cod_Barras);
    }

    public void dados (String nome, double preco, String autor){
        super.dados(nome, preco);
        this.autor = autor;
    }


    public String mostrarDetalhesDoItem(){
        return super.mostrarDetalhesDoItem() + "\nAutor: " + this.autor;
    }


}
