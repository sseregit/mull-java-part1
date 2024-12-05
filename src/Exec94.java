import java.util.Scanner;

public class Exec94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;

        int input = sc.nextInt();
        sc.nextLine();
        total += input;
        input = sc.nextInt();
        sc.nextLine();
        total += input;
        input = sc.nextInt();
        sc.nextLine();
        total += input;
        System.out.println("total = " + total);
    }
}
