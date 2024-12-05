public class Main {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int result = ++x + --x + x++;
        System.out.println("result = " + result);
    }
}