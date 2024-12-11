public class Exec142 {

    public static void main(String[] args) {
        String hello = "Hello";
        System.out.println(hello);
        recursive(hello, hello.length() - 1);
    }

    private static void recursive(String hello, int length) {
        if (length < 0) return;
        else {
            System.out.print(hello.charAt(length));
            recursive(hello, length - 1);
        }
    }
}
