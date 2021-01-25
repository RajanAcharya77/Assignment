public class QN43 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            System.out.println("Division of a and b is:" + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Divisible is not possible");
        }
    }
}