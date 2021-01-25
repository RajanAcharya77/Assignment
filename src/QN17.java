import java.util.Scanner;
public class QN17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a year:  ");
        int year = in.nextInt();
        if (year % 4 == 0)
            System.out.println("Year is Leap year");
        else {
            System.out.println("Year is not leap year");
        }
    }
}