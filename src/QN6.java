import java.util.*;
public class QN6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double pi = 3.14;
        System.out.println("Enter the radius of the circle:");
        double radius = in.nextDouble();
        System.out.println("Enter the length of rectangle: ");
        double length = in.nextDouble();
        System.out.println("Enter the breadth of the rectangle: ");
        double breadth = in.nextDouble();
        System.out.println("Enter the 1st side of triangle: ");
        double first = in.nextDouble();
        System.out.println("Enter the 2nd side of triangle: ");
        double second = in.nextDouble();
        System.out.println("Enter the 3rd side of triangle: ");
        double third= in.nextDouble();
        double perimeterC = 2 * pi * radius;
        double perimeterT = first+second+third;
        double  perimeterR= 2*(length+breadth);
        System.out.println(perimeterC);
        System.out.println(perimeterR);
        System.out.println(perimeterT);

    }
}
