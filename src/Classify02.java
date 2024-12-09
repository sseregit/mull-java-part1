import java.util.Scanner;

public class Classify02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        char ch = 'A';

        if (score >= 80) {
            if (score >= 90) ch = 'A';
            else ch = 'B';
        } else {
            if (score >= 70) ch = 'C';
            else {
                ch = 'D';
                if (score < 60) ch = 'F';
            }
        }

        System.out.println("score = " + score + " 학점: " + ch);
    }
}
