import java.util.Scanner;

public class estructurafor4 {
    public static void main(String[] args) {
        int base, exponente, resultado;
        Scanner key = new Scanner(System.in);
        System.out.println("Introduce la base");
        base = key.nextInt();
        System.out.println("Introduce el exponente");
        exponente = key.nextInt();
        resultado = base;
        for (int i = 1; i < exponente; i++) {
            resultado *= base;
        }
        System.out.println(base + " elevado a " + exponente + " = " + resultado);
    }
}
