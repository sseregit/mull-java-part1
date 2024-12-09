public class EndlessLoop {

    public static void main(String[] args) {

        int cnt = 0;
        while (cnt >= 0) {
            cnt = cnt + 1 - 1;
        }
        System.out.println("cnt = " + cnt);
    }
}
