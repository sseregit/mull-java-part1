import java.util.Scanner;

public class Exec113 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        int fee = 1000;

        if (4 > age) {
            fee = fee * 0;
        } else {
            if (14 > age) {
                fee = (int) (fee * 0.5);
            } else {
                if (20 > age) {
                    fee = (int) (fee * 0.75);
                }
            }
        }

        System.out.println("fee = " + fee);
    }
}
