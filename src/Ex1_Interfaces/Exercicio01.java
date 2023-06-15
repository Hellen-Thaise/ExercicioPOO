package Ex1_Interfaces;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        construcao();
    }
    public static void construcao(){
        Scanner in= new Scanner(System.in);
        FabricaLampada lampada = new FabricaLampada();
        FabricaLampada.Incandescente lamp1 = lampada.new Incandescente();
        FabricaLampada.Fluorescente lamp2 = lampada.new Fluorescente();

        lampada.construir();


    }
}
