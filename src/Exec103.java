import java.util.Scanner;

public class Exec103 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;

        int input = sc.nextInt();
        max = (max >= input) ? max : input;

        input = sc.nextInt();
        max = (max >= input) ? max : input;

        input = sc.nextInt();
        max = (max >= input) ? max : input;
        System.out.println("MAX: " + max);
    }
}
