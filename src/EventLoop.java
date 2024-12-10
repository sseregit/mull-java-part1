import java.util.Scanner;

public class EventLoop {

    public static void main(String[] args) {
        int input = 0;

        for (printMenu(); (input = getCmdNumber()) != 0; printMenu()) {
            if (input == 1)
                System.out.println("New menu");
            else if (input == 2)
                System.out.println("Search menu");
        }
        System.out.println("Bye");

    }

    private static int getCmdNumber() {
        Scanner sc = new Scanner(System.in);
        int cmd = sc.nextInt();
        return cmd;
    }

    private static void printMenu() {
        System.out.println("[1]New\t[2]Search\t[3]Print\t[0]Exit");
        System.out.print("Command(0~3): ");
    }
}
