public class Exec121 {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum += i;
        }
        System.out.println("for = " + sum);
        sum = 0;
        int i = 0;
        while (11 > i) {
            sum += i++;
        }
        System.out.println("while = " + sum);
    }
}
