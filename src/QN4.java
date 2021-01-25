import java.util.*;
public class QN4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the principal:");
        double P = in.nextInt();
        System.out.println("Enter the Rate:");
        double R = in.nextDouble();
        System.out.println("Enter the time:");
        double T = in.nextDouble();
        double SI = ((P*T*R)/100);
        System.out.println("The Simple Interest is:"+SI);
    }
}
