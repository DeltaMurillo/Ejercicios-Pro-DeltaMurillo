import java.util.Scanner;

public class dowhile2 {

    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 0;
        int n1mul = 0;
        int n2mul = 0;
        int multiplier = 1;
        Scanner key = new Scanner(System.in);
        do {
            System.out.println("Introduce el primer número:");
            n1 = key.nextInt();

            if (n1>100 || n1<0){
                System.out.println("El número introducido debe estar entre 0 y 100.");
            } else{}
        }while (n1 >100 || n1<0);
        if (n1 >= 0 || n1<=100){
            do {
                System.out.println("Introduce el segundo número:");
                n2 = key.nextInt();
                if (n2 > 100 || n2 < 0) {
                    System.out.println("El número introducido debe estar entre 0 y 100.");
                } else {
                }
            }while (n2 >100 || n2<0);
            do {
                n1mul = n1 * multiplier;
                multiplier += 1;
            } while (n1mul % n2 != 0);
            System.out.println("el mínimo común múltiplo es "+ n1mul);
        }

    }

}
