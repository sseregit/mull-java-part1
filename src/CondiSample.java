import java.util.Scanner;

public class CondiSample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        int result = input <= 10 ? 10 : 20;
        System.out.println("result = " + result);
    }
}
