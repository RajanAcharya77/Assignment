import java.util.Scanner;
public class QN27 {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = in.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = in.nextInt();
        int sum = (num1+num2+num3);
        int product = (num1*num2*num3);
        System.out.println("The sum is:"+sum);
        System.out.println("The product is: "+product);


    }
}
