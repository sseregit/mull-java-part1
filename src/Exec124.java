public class Exec124 {

    public static void main(String[] args) {
//
//        for (int i = 0; i < 5; i++) {
//            int left = 9 / 2 - i;
//            int right = 9 / 2 + i;
//
//            for (int j = 0; j < 9; j++) {
//                if (right >= j && j >= left) System.out.print("*\t");
//                else System.out.print("\t");
//
//
//            }
//            System.out.println();
//        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 + i; j++) {
                if (j >= 4 - i) System.out.print("*\t");
                else System.out.print("\t");
            }
            System.out.println();
        }
    }
}
