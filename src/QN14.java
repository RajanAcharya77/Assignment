import java.util.Scanner;
public class QN14 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = in.nextInt();
        System.out.print("Please enter another number: ");
        int num2 = in.nextInt();
        if(num==num2){
            System.out.println("Equal number");
        }
        else if(num>num2){
            System.out.println("Num is greater than Num2.");
        }
        else if(num<num2){
            System.out.println("Num is less than num2");
        }
        else{
            System.out.println("Exit");
        }

    }
}
