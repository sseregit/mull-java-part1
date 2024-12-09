import java.util.Scanner;

public class DoWhileSample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        do {
            input = sc.nextInt();
            System.out.println("input = " + input);
        } while (input != 0);
    }
}
