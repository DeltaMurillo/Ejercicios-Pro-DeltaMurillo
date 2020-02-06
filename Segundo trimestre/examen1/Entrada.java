import java.util.Scanner;
public class Entrada {
     static Coleccion Do = new Coleccion();
    static int valor;
    public static Boolean algo;
    public static void main(String[] args) {
        while (algo==true) {
            menu();
        }
    }
    static void menu(){
        Scanner key = new Scanner(System.in);
        System.out.println("Haz aqui el menu");
        valor = key.nextInt();
        switch(valor){
            case 1:
                Do.addMedia();
                break;
            case 2:
                Do.deleteMedia();
                break;
            case 3:
                Do.showMedia();
                break;
            case 4:
                s = false;
                break;
        }
    }
}
