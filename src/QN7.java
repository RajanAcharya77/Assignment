import java.util.*;
public class QN7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double pi= 3.14;
        System.out.println("Enter the radius:");
        double r = in.nextDouble();
        System.out.println("Enter the height: ");
        double height= in.nextDouble();
        double volume = pi*r*r*height;
        System.out.println(volume);
    }
}
