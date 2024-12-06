import java.util.Scanner;

public class Exec102 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("점수를 입력하세요: ");
        int score = sc.nextInt();

        System.out.println("결과: " + (score >= 80 ? "합격" : "불합격"));
    }
}
