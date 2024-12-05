import java.util.Scanner;

public class Exec92 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int time = sc.nextInt();

        int hour = time / (60 * 60);
        int minute = time % (60 * 60) / 60;
        int second = time % 60;

        System.out.printf("%02d:%02d:%02d", hour, minute, second);


    }
}
