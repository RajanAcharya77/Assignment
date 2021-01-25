import java.util.Scanner;
public class QN26 {
    public static void main(String[] args) {
        int i = 123;
        int rev_num = 0;
        while (i != 0) {
            rev_num = rev_num * 10;
            rev_num = rev_num + i % 10;
            i = i / 10;
        }

        System.out.println("Reverse of specified number is: " + rev_num);
    }

}