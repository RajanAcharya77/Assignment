import java.util.Scanner;
public class QN13 {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = in.nextInt();
        if(num<0){
            System.out.println("Print the number: "+num);
        }
        else{
            System.out.println("Exit");

        }
    }
}
