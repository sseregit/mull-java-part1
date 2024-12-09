import java.util.Scanner;

public class WhilePrintStar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        int input = sc.nextInt();

        if (input < 0) input = 1;
        else if (input > 9) input = 9;

        int cnt = 0;
        while (cnt < input) {
            System.out.print("*\t");
            cnt++;
        }
    }
}
