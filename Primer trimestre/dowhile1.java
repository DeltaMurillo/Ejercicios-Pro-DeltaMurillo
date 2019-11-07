import java.util.Scanner;

public class dowhile1 {

    public static void main(String[] args) {
        double tVal = 0;
        double sumVal = 0;
        Scanner key = new Scanner(System.in);
        do{
            System.out.println("Introduce un número:");
            sumVal = key.nextDouble();
            tVal += sumVal;
        }while(sumVal != 0);
        System.out.println("La suma total es "+tVal);
    }

}
