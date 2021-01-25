import java.util.Scanner;

public class QN11{
    public static void main(String[] args) {
        int x = 20;
        int y = 15;
        x = x+y;
        y = x- y;
        x = x-y;
        System.out.println("After swaping:"
                + " x = " + x + ", y = " + y);    }
}

class swap{
    public static void main(String[] args) {
        int x = 30;
        int y = 20;
        int temp = x;
        x = y;
        y = (int)temp;

        System.out.println("After Swaping" + " x = " + x + ",y = " + y);
    }
}

