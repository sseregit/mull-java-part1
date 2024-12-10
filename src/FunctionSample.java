public class FunctionSample {

    public static void main(String[] args) {
        int result = add(3, 4);
        System.out.println("result = " + result);
    }

    private static int add(int a, int b) {
        int data = 0;
        data = a + b;
        return data;
    }
}
