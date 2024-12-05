import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 0;
        try {
            a = s.nextInt();
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("ERROR");
        }
        System.out.println("End");
    }
}