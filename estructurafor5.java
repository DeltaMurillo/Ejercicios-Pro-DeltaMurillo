import java.util.Scanner;

public class estructurafor5 {
    public static void main(String[] args) {
        int n = 0, positivos = 0, negativos = 0, ceros = 0, nPositivos = 0, nNegativos = 0, mediaPositivos = 0, mediaNegativos = 0;
        Scanner key = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Dime un número:");
            n = key.nextInt();
            if (n < 0) {
                nNegativos += 1;
                negativos += n;
            } else if (n == 0) {
                ceros += 1;
            } else {
                positivos += n;
                nPositivos += 1;
            }
        }
        if (nPositivos > 0) {
            mediaPositivos = positivos / nPositivos;
        }
        if (nNegativos > 0) {
            mediaNegativos = negativos / nNegativos;}
            System.out.println("La media de los numeros positivos es " + mediaPositivos + "\nLa media de los numeros negativos es " + mediaNegativos + "\nSe han introducido " + ceros + " ceros");

        }
    }