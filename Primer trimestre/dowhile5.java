import java.util.Scanner;

public class dowhile5 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String option;
        Boolean isOption = true;
        do {
            System.out.println("\nElige una opción:\n\na. Opción 1.\nb. Opción 2\nc. Opción 3\nd. Opción 4\ne. Salir");
            option = key.next();
            switch (option){

                case ("a"):
                    System.out.println("La opción seleccionada es 1");
                    break;
                case ("b"):
                    System.out.println("La opción seleccionada es 2");
                     break;
                case ("c"):
                    System.out.println("La opción seleccionada es 3");
                    break;
                case ("d"):
                    System.out.println("La opción seleccionada es 4");
                    break;

                case ("e"):
                    isOption = false;
                    break;

                default:
                    System.out.println("Opción no contemplada.");
                    break;
            }
        } while (isOption);
    }
}
