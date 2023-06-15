package Ex2_ClassesAbstratas;

import java.util.Scanner;
    abstract class Forma {
        String nome;
        protected float largura;
        protected float altura;
        protected double raio;

        public Forma() {
            System.out.println("\nConstrutor Forma");
        }

        public abstract double calcularArea();

        public abstract double calcularPerimetro();

        public void setAltura(float alt) {
            altura = alt;
        }

        public float getAltura() {
            return altura;
        }

        public void setLargura(float larg) {
            largura = larg;
        }

        public float getLargura() {
            return largura;
        }

        public double getRaio() {
            return raio;
        }

        public void setRaio(double r) {
            raio = r;
        }

        public void setNome(String n) {
            nome = n;
        }

        public String getNome() {
            return nome;
        }

        public void setDados() {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite a altura : ");
            altura = entrada.nextFloat();
            System.out.println("Digite a largura : ");
            largura = entrada.nextFloat();
            System.out.println("Digite o raio do Circulo: ");
            raio = entrada.nextDouble();
        }
}

