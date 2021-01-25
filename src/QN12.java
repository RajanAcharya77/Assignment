import java.util.Scanner;
public class QN12 {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your roll: ");
        int roll = in.nextInt();
        System.out.println("Enter your name: ");
        String name = in.next();
        System.out.println("Enter your nationality: ");
        String nation = in.next();
        System.out.println("Roll number is: " + roll + " Nationality is: " + nation + " And the name is: "+ name);

    }
}
