import java.util.Scanner;
public class QN30 {
    public static void main(String[] args) {
        int count = 9, num1 = 1, num2 = 1;
        System.out.println("Fibonacci series of" + count + "numbers:");
        int i = 1;
        while (i < count) {
            System.out.println(num1 + "");
            int sumofprev = num1 + num2;
            num1 = num2;
            num2 = sumofprev;
            i++;
        }
    }
}