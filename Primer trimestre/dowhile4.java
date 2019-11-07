import java.util.Scanner;

public class dowhile4 {
    static int num,option;
    static String numBin,numOct,numHex;
    static Scanner key = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Bienvenido al convertor de sistemas de numeración.");
        newNumber();
    }

        static void newNumber(){
        System.out.println("introduce un numero");
        num = key.nextInt();
        key.nextLine();
        numOct = Integer.toOctalString(num);
        numBin = Integer.toBinaryString(num);
        numHex = Integer.toHexString(num);
        System.out.println("Has introducido el número "+ num);
        menu();
    }

    static void menu(){
        System.out.println("¿Qué desea realizar?\n\n1. Pasar a binario\n2. Pasar a octal\n3. Pasar a hexadecimal\n4. Pasar a los 3 sistemas\n\n5.Elegir otro numero\n6. Salir");
        option = key.nextInt();
        switch(option){
            case 1:
                System.out.println(num+" en binario es "+numBin+"\n");
                menu();
                break;
            case 2:
                System.out.println(num+" en octal es "+numOct+"\n");
                menu();
                break;
            case 3:
                System.out.println(num+" en Hexadecimal es "+numHex+"\n");
                menu();
                break;
            case 4:
                System.out.println(num+" en binario es "+numBin+"\n"+num+" en octal es "+numOct+"\n"+num+" en Hexadecimal es "+numHex+"\n");
                menu();
                break;
            case 5:
                newNumber();
                menu();
                break;
            case 6:
                break;

            default:
                menu();
                break;
        }

    }
}
