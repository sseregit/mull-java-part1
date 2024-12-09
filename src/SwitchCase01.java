import java.util.Scanner;

public class SwitchCase01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int left = sc.nextInt();
        char operator = sc.next().charAt(0);
        int right = sc.nextInt();
        int result = 0;

        switch (operator) {
            case '+':
                result = left + right;
                break;
            case '-':
                result = left - right;
                break;
            case '*':
                result = left * right;
                break;
            case '/':
                result = left / right;
                break;
        }

        System.out.println("result = " + result);
    }
}
