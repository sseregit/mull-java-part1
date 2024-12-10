import java.util.Arrays;

public class Exec136 {

    public static void main(String[] args) {
        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++) {
            int number = array.length * i;
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == 0)
                    array[i][j] = number + j + 1;
                else
                    array[i][j] = (number + array.length) - j;
            }
        }

        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }


    }
}
