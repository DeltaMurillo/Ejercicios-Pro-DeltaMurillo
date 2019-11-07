import java.util.Scanner;

public class EstructuraFor {
    public static void main(String[] args) {
        int ii = 0;
        int num;
        int sumNum = 0;
        int smallNum = 99999;
        int bigNum = 0;
        double media;
        Scanner key = new Scanner(System.in);
        System.out.println("Cuantos numeros quieres introducir??");
        ii = key.nextInt();
        for(int i=1;i<=ii;i++){
            System.out.println("Dime el número "+i);
            num = key.nextInt();
            if (num<smallNum){
                smallNum = num;
            }
            if (num>bigNum){
                bigNum = num;
            }
            sumNum += num;
        }

        media = sumNum/ii;
        System.out.println("El numero máximo es "+bigNum+"\n\nEl numero mínimo es "+smallNum+"\n\nLa media es "+media);

    }
}
