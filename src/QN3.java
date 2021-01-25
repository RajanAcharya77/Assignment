import java.util.*;
public class QN3 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int first = in.nextInt();
        System.out.println("Enter the second number:");
        int second = in.nextInt();
        int sum = (first+second);
        int average = (sum/2);
        System.out.println("The sum of two numbers is:"+sum);
        System.out.println("The average of two numbers is:"+average);
    }
}
