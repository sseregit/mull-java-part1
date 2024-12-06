import java.util.Scanner;

public class Exec104 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = sc.nextInt();
        int b = sc.nextInt();
        max = max >= b ? max : b;
        int c = sc.nextInt();
        max = max >= c ? max : c;

        System.out.println("MAX: " + max);

    }
}
