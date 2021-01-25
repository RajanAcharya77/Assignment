import java.sql.SQLOutput;
import java.util.Scanner;
public class QN18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter 1st number: ");
        int num1 = in.nextInt();
        System.out.print("Please enter 2nd number: ");
        int num2 = in.nextInt();
        System.out.print("Please enter 3rd number: ");
        int num3 = in.nextInt();
        if ((num1 > num2) && (num2 > num3)) {
            System.out.println("Num1 is largest");
        } else if ((num2 > num1) && (num2 > num3)) {
            System.out.println("Num2 is largest");
        } else if ((num3 > num1) && (num3 > num2)) {
            System.out.println("Num3 is largest");


        }
    }
}