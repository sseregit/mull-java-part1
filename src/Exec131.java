public class Exec131 {

    public static void main(String[] args) {
        int[] arr = {50, 40, 30, 10, 20};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }

        System.out.println("MAX: " + max);
    }
}
