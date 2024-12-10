public class MemberData {

    static int testData = 10;

    public static void main(String[] args) {
        System.out.println("testData - begin = " + testData);
        MemberData.testFunc();
        System.out.println("testData - end = " + testData);
    }

    private static void testFunc() {
        int testData = 100;
        MemberData.testData = 300;
        System.out.println("MemberData.testFunc = " + testData);
    }
}
