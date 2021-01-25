import java.util.Scanner;
public class QN23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = in.nextInt();
        num = (num * (num + 1) / 2);
        System.out.println("Sum of natural number is " + num);
    }
}