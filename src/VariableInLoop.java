import java.io.IOException;
import java.util.Scanner;

public class VariableInLoop {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int ch = 0;
        while ((ch = System.in.read()) != 'q') {
            int cnt = 0;
            System.out.printf("cnd: %d, %c\n", cnt, ch);
            cnt++;
        }
    }
}
