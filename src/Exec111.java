import java.util.Scanner;

public class Exec111 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = sc.nextInt();
        int input = sc.nextInt();
        if (input > max) {
            max = input;
        }
        input = sc.nextInt();
        if (input > max) {
            max = input;
        }
        System.out.println("MAX: " + max);
    }
}
