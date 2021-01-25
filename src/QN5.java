import java.util.*;
public class QN5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double pi = 3.14;
        System.out.println("Enter the radius of the circle:");
        double radius = in.nextDouble();
        System.out.println("Enter the length of rectangle: ");
        double length = in.nextDouble();
        System.out.println("Enter the breadth of the rectangle: ");
        double breadth = in.nextDouble();
        System.out.println("Enter the breadth of triangle: ");
        double brd = in.nextDouble();
        System.out.println("Enter the height of triangle: ");
        double height = in.nextDouble();
        double areaC = pi* radius*radius;
        double areaR = length * breadth;
        double areaT = (1/2)*brd*height;
        System.out.println("Area of circle is:"+areaC);
        System.out.println("Area of rectangle is: "+areaR);
        System.out.println("Area of triangle is: "+areaT);


    }
}
