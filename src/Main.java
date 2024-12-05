import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        sc.nextLine();
        System.out.println("data = " + data);

        String tmp = sc.nextLine();
        System.out.println("tmp = " + tmp);
    }
}