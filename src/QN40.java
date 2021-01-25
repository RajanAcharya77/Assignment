import java.util.Scanner;
public class QN40 {
    public static void main(String[] args) {
        String str, rev = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        str = in.nextLine();
        int length = str.length();
        for (int i = length - 1; i >= 0; i--)
            rev = rev + str.charAt(i);
        System.out.println("Reverse string is:" + rev);
    }
}