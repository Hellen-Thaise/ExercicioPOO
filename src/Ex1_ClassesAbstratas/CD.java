package Ex1_ClassesAbstratas;

public class CD extends Produto{

    private int num_Faixas = 0;
    //Metodo construtor
    public CD(int cod_Barras) {
        super(cod_Barras);
    }

    //Método criado para coletar as caracteristicas do objeto
    public void dados (String nome, double preco, int num_Faixas){
        super.dados(nome, preco);
        this.num_Faixas = num_Faixas;
    }

    //Sobrescrita do metodo mostrarDetalhesDoItem

    public String mostrarDetalhesDoItem(){
        return super.mostrarDetalhesDoItem() + "\nNúmero de faixas: " + this.num_Faixas;
    }
}



