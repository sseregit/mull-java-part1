import java.util.Scanner;

public class Exec112 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int fee = 1000;

        int age = sc.nextInt();

        if (20 > age) {
            System.out.println("나이: " + age + ", 최종요금: " + (fee - (int)(fee * 0.25)) + "원");
        } else {
            System.out.println("나이: 20, 최종요금: " + fee + "원");
        }
    }
}
