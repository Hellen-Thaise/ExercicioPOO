package Ex2_ClassesAbstratas;

 class Retangulo extends Forma {
     public Retangulo()
     {
         System.out.println("Construtor Retângulo");
         setNome("Retângulo");
     }
     public double calcularArea()
     {
         return (getLargura()*getLargura());
     }
     public double calcularPerimetro(){
         return (2*getLargura())+(2*getAltura());
     }
}
