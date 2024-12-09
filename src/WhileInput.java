import java.io.IOException;

public class WhileInput {

    public static void main(String[] args) throws IOException {
        int input = 0;

        while ((input = System.in.read()) != 'q') {
            System.out.println("input = " + input);
        }

        System.out.print("Exit");
    }
}
