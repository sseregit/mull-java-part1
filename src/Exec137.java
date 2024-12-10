import java.util.Arrays;

public class Exec137 {

    public static void main(String[] args) {
        int[][] array = new int[5][5];

        int x = -1, y = 0, cnt = 0, direction = 1;
        int arrLen = array.length;

        for (int length = arrLen * 2 - 1; length > 0; length-=2) {
            for (int i = 0; i < length; i++) {
                if (i < length / 2 + 1)
                    x += direction;
                else
                    y += direction;
                array[y][x] = ++cnt;
            }
            direction = -direction;
        }

        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }

    }
}
