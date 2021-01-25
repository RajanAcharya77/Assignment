import java.util.Scanner;
public class QN20 {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
                double first = in.nextDouble();
                double second = in.nextDouble();
                System.out.print("Enter an operator (+, -, *, /): ");
                char operator = in.next().charAt(0);
                double results;

                switch (operator) {
                    case '+':
                        results = first + second;
                        break;

                    case '-':
                        results = first - second;
                        break;

                    case '*':
                        results = first * second;
                        break;

                    case '/':
                        results = first / second;
                        break;

                    default:
                        System.out.printf("Error! operator is not correct");
                        return;
                }

                System.out.println(first + " " + operator + " " + second + " = " + results);
            }
        }






