import java.util.Scanner;

public class Exec141 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("MAX: " + getMax(a, b, c));
    }

    private static int getMax(int... ints) {

        if (3 > ints.length) return -1;

        int max = ints[0];

        for (int i = 1; i < ints.length; i++)
            if (ints[i] > max) max = ints[i];

        return max;
    }
}
