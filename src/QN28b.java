import java.util.Scanner;
public class QN28b {
    public static void main(String[] args) {
        System.out.println("Enter a number:  ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {

            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
