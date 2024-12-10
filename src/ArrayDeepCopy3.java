import java.util.Arrays;

public class ArrayDeepCopy3 {

    public static void main(String[] args) {
        int[] aSrc = {10, 20, 30, 40, 50};
        int[] aDst = new int[aSrc.length];

        System.arraycopy(aSrc, 0, aDst, 0, aDst.length);

        aDst[2] = 100;

        System.out.println("Arrays.toString(aSrc) = " + Arrays.toString(aSrc));
        System.out.println("Arrays.toString(aDst) = " + Arrays.toString(aDst));
    }
}
