public class RecursiveCall {

    public static void main(String[] args) {
        System.out.println(getFactorialLoop(5));
        System.out.println(getFactorial(5));
    }

    private static int getFactorial(int param) {
        if (param == 1) return 1;
        return getFactorial(param - 1) * param;
    }

    private static int getFactorialLoop(int param) {
        int total = 1;
        for (int i = 1; i <= param; i++)
            total *= i;
        return total;
    }
}
