import java.util.Scanner;
public class QN24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, num = 1;
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        for (i = 1; i <= n; i++);
        {
            num = num * i;
        }
        System.out.println("Factorial of " + n + " is: " + num);
    }
}
