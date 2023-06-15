package Ex2_ClassesAbstratas;

 class Circulo  extends Forma{
     private double pi = 3.14; // usando pi como raio do circulo
     public Circulo(){
         setNome("Circulo");
     }
     public double calcularArea()
     {
         return  (pi*(getRaio()*getRaio()));
     }
     public double calcularPerimetro(){
         return (2*pi*getRaio());
     }
}
