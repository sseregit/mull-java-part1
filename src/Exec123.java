public class Exec123 {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j >= 0; j--) {
                if (i >= j) System.out.print("*");
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
