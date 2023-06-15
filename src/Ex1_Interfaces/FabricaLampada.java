package Ex1_Interfaces;


import java.util.Scanner;

public class FabricaLampada {
    Scanner in= new Scanner(System.in);
    public class Incandescente implements Lampada{
        @Override
        public boolean ligar() {
            return true;
        }
        @Override
        public boolean desligar() {
            return false;
        }
    }

    public class Fluorescente implements Lampada{
        @Override
        public boolean ligar() {
            return true;
        }
        @Override
        public boolean desligar() {
            return false;
        }
    }
    private boolean status; //ligado ou não
    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    public void construir(){

        boolean ver= false;
        do{
            System.out.println("------CONSTRUÇÃO DE LAMPADA-----");
            System.out.println("Digite qual lampada gostaria de criar");
            System.out.println("1------------------------Fluorescente");
            System.out.println("2------------------------Incandescente");
            int opcao= in.nextInt();
            if(opcao==1){
                Fluorescente nova= new Fluorescente();
                System.out.println("Lampada Fluorescente criada com sucesso");
                in.nextLine();
                System.out.println("Deseja ligar (S/N)");
                String dado= in.nextLine();
                if (dado.equalsIgnoreCase("s")){
                    nova.ligar();
                    this.setStatus(true);
                    System.out.println("Lampada ligada.");
                    System.out.println("Status:"+this.getStatus());
                }else if(dado.equalsIgnoreCase("n")){
                    nova.desligar();
                    this.setStatus(false);
                    System.out.println("Lampada desligada.");
                    System.out.println("Status:"+this.getStatus());
                }

                ver= true;
            }else if(opcao==2){
                Incandescente nova= new Incandescente();
                System.out.println("Lampada Incandescente criada com sucesso");
                in.nextLine();
                System.out.println("Deseja ligar (S/N)");
                String dado= in.nextLine();
                if (dado.equalsIgnoreCase("s")){
                    nova.ligar();
                    this.setStatus(true);
                    System.out.println("Lampada ligada.");
                    System.out.println("Status:"+this.getStatus());
                }else if(dado.equalsIgnoreCase("n")){
                    nova.desligar();
                    this.setStatus(false);
                    System.out.println("Lampada desligada.");
                    System.out.println("Status:"+this.getStatus());
                }
                ver=true;
            }else{
                System.out.println("Número inválido");
                ver= false;
            }
        }while(!ver);
    }
}
