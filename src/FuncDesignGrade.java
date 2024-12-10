import java.util.Scanner;

public class FuncDesignGrade {

    public static void main(String[] args) {
        int score = getScore();
        if (score < 0) return;

        char ch = getGrade(score);
        System.out.println("학점: " + ch);
    }

    private static char getGrade(int score) {
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else if (score >= 60) return 'D';
        return 'F';
    }

    private static int getScore() {
        System.out.println("점수: ");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score < 0 || score > 100) {
            System.out.println("ERROR: 점수범위가 부적절합니다.");
            return -1;
        }
        return score;
    }
}
