import java.util.Scanner;

public class IfElseSample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int result = 0;
        if (input <= 10) {
            result = 10;
        } else
            result = 20;

        System.out.println("result = " + result);
    }
}