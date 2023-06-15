package Ex2_ClassesAbstratas;

 class Quadrado extends Retangulo {
     public Quadrado(){
         System.out.println("Construtor de Quadrado");
         setNome("Quadrado");
         super.setLargura(super.getAltura());
     }
     public double calcularArea()
     {
         return (getLargura() * getLargura());
     }
     public double calcularPerimetro()
     {
         return (4*getLargura());
     }
}
