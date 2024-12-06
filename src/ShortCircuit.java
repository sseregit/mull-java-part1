import java.util.Scanner;

public class ShortCircuit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이: ");
        int age = sc.nextInt();
        System.out.print("키: ");
        int height = sc.nextInt();

        System.out.printf("결과: %b\n", age >= 20 && age <= 30 && height >= 150 ||
                age >= 100 ||
                height >= 200);
    }
}
