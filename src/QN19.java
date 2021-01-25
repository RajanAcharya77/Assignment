import java.util.Scanner;
public class QN19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a side:");
        int side1 = in.nextInt();
        System.out.println("Enter another side: ");
        int side2 = in.nextInt();
        System.out.println("Enter third side:");
        int side3 = in.nextInt();

        if ((side1 == side2) && (side1 == side3)) {
            System.out.println("Equilateral Triangle");
        } else if ((side1 > side2) || (side1 < side2)) {
            System.out.println("Scalene Triangle");
        } else if ((side1 == side2) || (side2 == side3) || (side1 == side3)) {
            System.out.println("Isosceles Triangle");
        }
    }
}