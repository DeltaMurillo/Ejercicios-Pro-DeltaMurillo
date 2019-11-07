import java.util.Scanner;

public class estructurafor2 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int num,res;
        System.out.println("Introduce un número:");
        num = key.nextInt();
        for(int i=0;i<=10;i++){
            res = num*i;
            System.out.println(num+" x "+i+" = "+res);
        }

    }
}
