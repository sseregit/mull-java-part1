import java.util.Scanner;

public class FuncDesignAfter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("계승계산을 위한 값(1~10): ");
        int input = sc.nextInt();

        if (input < 1 || input > 10) {
            System.out.println("ERROR: 1 ~ 10 사이 정수를 입력하세요.");
            return;
        }

        System.out.println("factorial = " + getFactorial(input));
    }

    private static int getFactorial(int param) {
        if (param < 1 || param > 10) {
            return 0;
        }

        int result = 1;
        for (int i = 1; i <= param; i++) {
            result += i;
        }
        return result;
    }
}
