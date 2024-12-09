import java.util.Scanner;

public class Classify01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        char ch = 'A';

        if (score >= 90) ch = 'A';
        else if (score >= 80) ch = 'B';
        else if (score >= 70) ch = 'C';
        else if (score >= 60) ch = 'D';
        else ch = 'F';

        System.out.println("score = " + score + " 학점: " + ch);
    }
}
