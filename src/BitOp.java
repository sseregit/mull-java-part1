public class BitOp {
    public static void main(String[] args) {
        int data = 0x11223344;
        System.out.printf("%d\n", data);
        System.out.printf("%08x\n", data & 0xFFFF0000);
        System.out.printf("%08x\n", data | 0xFFFF0000);
        System.out.printf("%08x\n", data ^ 0xFFFF0000);
        System.out.printf("%08x\n", ~data);
    }
}
