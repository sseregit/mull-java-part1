import java.util.Arrays;

public class Exec135 {

    public static void main(String[] args) {

        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (array.length * i) + j + 1;
            }
        }

        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
