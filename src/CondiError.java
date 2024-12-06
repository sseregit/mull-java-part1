import java.util.Scanner;

public class CondiError {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        int result = 0, result2;
        result2 = (input <= 10) ? (result = 10) : (result = 20);
        System.out.println("result = " + result);
    }
}
