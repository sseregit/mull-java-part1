import java.util.Scanner;

public class LogicalSample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        boolean result = input < 5 || isABoolean(input);
        System.out.println("result = " + result);
    }

    private static boolean isABoolean(int input) {
        System.out.println("LogicalSample.isABoolean");
        return input > 10;
    }
}
