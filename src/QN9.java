import java.util.Scanner;
public class QN9 {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        final double KILOGRAMS_PER_POUND = 0.454;

        System.out.print("Enter a number in pounds: ");
        double pounds = in.nextDouble();
        double kilograms = pounds * KILOGRAMS_PER_POUND;
        System.out.println(pounds + " pounds is " + kilograms + " kilograms");
    }
}
