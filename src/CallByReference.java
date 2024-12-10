import java.util.Arrays;

public class CallByReference {

    public static void main(String[] args) {
        int[] array = new int[] {10, 20, 30, 40, 50};
        printArray(array);
        modifyArray(array);
        printArray(array);
    }

    private static void modifyArray(int[] array) {
        array[2] = array[2] * 5555;
    }

    private static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
