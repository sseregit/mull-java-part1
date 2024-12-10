import java.util.Arrays;

public class Exec134 {

    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 0},
                {40, 50, 60, 0},
                {0, 0, 0, 0}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length-1; j++) {
                if (i != arr.length-1) {
                    arr[arr.length-1][j] += arr[i][j];
                }
                arr[i][arr[i].length-1] += arr[i][j];
            }
        }

        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
