package day24_CustomMethod_Return;

public class ReturnMethodPractice {
    public static void main(String[] args) {

        findMaxNumber(100, 200);

        int multiplyMax = 2 * findMaxNumber(100, 200);
        System.out.println("multiplyMax = " + multiplyMax);
    }

    public static int findMaxNumber(int n1, int n2) {
        int maxNumber = 0;

        for (int i = n1; i < n2; i++) {
            if (i > maxNumber) {
                maxNumber = i;
            }
        }
        System.out.println("maxNumber = " + maxNumber);
        return maxNumber;
    }
}
