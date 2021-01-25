import java.util.Scanner;
public class QN16 {
    public static void main (String[]args){
        Scanner in = new Scanner (System.in);
        System.out.print("Enter a number:");
        int num = in.nextInt();
        if(num%2==0){
            System.out.println("Its a even number");

        }
        else{
            System.out.println("Its a odd number");
        }
    }
}
