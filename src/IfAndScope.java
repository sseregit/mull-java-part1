import java.util.Scanner;

public class IfAndScope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요.: ");
        int age = sc.nextInt();

        if (age >= 20) {
            System.out.printf("처리전, 당신의 나이는 %d세 입니다.\n", age);
            age = 20;
        }

        System.out.println("최종 당신의 나이는 " + age + " 세 입니다.");
    }
}
