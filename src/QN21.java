import java.util.Scanner;
public class QN21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = in.nextInt();
        System.out.println(getDayname(num));
    }
    public static String getDayname(int num) {
        String dayname = "";
        switch (num) {
            case 1: dayname = "Sunday"; break;
            case 2: dayname = "Monday"; break;
            case 3: dayname = "Tuesday"; break;
            case 4: dayname = "Wednesday"; break;
            case 5: dayname = "Thursday"; break;
            case 6: dayname = "Friday"; break;
            case 7: dayname = "saturday"; break;
            default:dayname = "Invalid day range";
        }

        return dayname;
    }
}

