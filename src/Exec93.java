import java.util.Scanner;

public class Exec93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int tmp = a;
        a = b;
        b = tmp;

        System.out.println("a = " + a + ", b = " + b);
    }
}
