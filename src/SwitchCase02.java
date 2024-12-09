import java.util.Scanner;

public class SwitchCase02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();
        char ch = 'A';

        switch (score / 10) {
            case 10:
            case 9:
                ch = 'A';
                break;
            case 8:
                ch = 'B';
                break;
            default:
                ch = 'F';
        }

        System.out.println("ch = " + ch);
    }
}
