public class dowhile3 {
    public static void main(String[] args) {

        int random = 1;
        do {

            random = (int) (Math.random() * 100);
            System.out.println(random);
        } while (random != 0);

    }
}
