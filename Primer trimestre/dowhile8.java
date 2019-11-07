import java.util.Scanner;

public class dowhile8 {
    static Scanner key = new Scanner(System.in);
    static int option;
    static int numeroUno,numeroDos;
    static int suma,resta,multi,divi;

    public static void main(String[] args) {
        System.out.println("Bienvenido a la mini calculadora. Primero de todo, introduce dos dígitos.");
        getDigits();
    }

    static void menu() {
        System.out.println("¿Qué deseas hacer?\n\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n\n5. Cambiar los dígitos\n6. Salir\n\nElige una opción");
        option = key.nextInt();
        switch (option) {
            case 1:
                System.out.println("La suma de "+numeroUno+" y "+numeroDos+" es "+suma);
                menu();
                break;
            case 2:
                System.out.println("La resta de "+numeroUno+" y "+numeroDos+" es "+resta);
                menu();
                break;
            case 3:
                System.out.println("La multiplicación de "+numeroUno+" y "+numeroDos+" es "+multi);
                menu();
                break;
            case 4:
                System.out.println("La división de "+numeroUno+" y "+numeroDos+" es "+divi);
                menu();
                break;
            case 5:
                getDigits();
                break;
            case 6:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida.");
                menu();
                break;
        }
    }

    static void getDigits(){
        System.out.println("Introduce el primer número");
        numeroUno = key.nextInt();
        key.nextLine();
        System.out.println("Introduce el segundo número");
        numeroDos = key.nextInt();
        suma = numeroUno + numeroDos;
        resta = numeroUno - numeroDos;
        multi = numeroUno * numeroDos;
        divi = numeroUno / numeroDos;
        menu();
    }
}
