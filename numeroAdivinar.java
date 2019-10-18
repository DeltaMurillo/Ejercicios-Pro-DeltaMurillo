import java.util.Scanner;

public class numeroAdivinar {


    public static void main(String[] args) {
        System.out.println("Bienvenido a las adivinanzas. ¡Empecemos!\n\n");
        menu();
    }


    static void juego() {
        int random, nSaid;
        int tries = 0;
        int record = 21;
        random = (int) (Math.random() * 20) + 0;
        Scanner key = new Scanner(System.in);
        do {
            System.out.println("Dime un número:\n");
            nSaid = key.nextInt();
            tries++;
        } while (nSaid != random);
        System.out.println("\n\n¡ENHORABUENA! Has adivinado el número. Has tardado " + tries + " Intentos");
        if (tries < record) {
            record = tries;
            System.out.println("Has superado el anterior record! Tu record actual es " + record);
            menu();
        } else {
        }
        menu();
    }


    static void menu() {
        int opcion;
        Scanner key = new Scanner(System.in);
        System.out.println("¿Qué desea hacer?\n\n1. Jugar\n2. Salir");
        opcion = key.nextInt();
        switch (opcion) {
            case 1:
                juego();
                break;
            case 2:
                break;
            default:
                System.out.println("Por favor introduce una opción válida\n\n");
                menu();
                break;
        }


    }
}

