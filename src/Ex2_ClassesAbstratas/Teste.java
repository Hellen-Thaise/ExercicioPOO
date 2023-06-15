package Ex2_ClassesAbstratas;

import java.util.Random;

public class Teste {
    public static void main(String[] args) {
        Forma q[] = new Forma[5];
        Random r = new Random();

        for(int i=0; i<5; i++, r = new Random())
        {
            int codigo = r.nextInt();
            System.out.printf("Código é: %d", codigo);

            if (codigo%3 == 0)
                q[i] = new Retangulo();
            if ((codigo%3 ==1) || (codigo%3==-1))
            q[i] = new Quadrado();
            if ((codigo%3 ==2) || (codigo%3==-2))
                q[i] = new Circulo();
            q[i].setDados();
        }
        for(int i=0; i<5; i++)
        {
            System.out.printf("\nA área do %s é: %f", q[i].getNome(), q[i].calcularArea());
            System.out.printf("\nO perimetro do %s é: %f", q[i].getNome(), q[i].calcularPerimetro());
        }
    }
}
