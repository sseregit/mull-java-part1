public class ArraySample {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int idx = 0;
        System.out.println("array.length = " + array.length);
        for (int data : array) {
            System.out.println("array[idx] = " + data);
            idx++;
        }
    }
}
