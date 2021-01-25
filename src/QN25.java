import java.util.Scanner;
public class QN25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int highestscore = 0;
        String highestScoreName = "";
        System.out.println("Enter the number of students:");
        int numofstudents = in.nextInt();
        for(int i =0; i<=numofstudents;i++ ){
            System.out.print(
                    "Student: " + (i + 1) +
                            "\n   Name: ");
            String name = in.next();
            System.out.print(
                    "   Score: ");
            int score = in.nextInt();


            if (score > highestscore)
            {
                highestscore = score;
                highestScoreName = name;
            }

        }

        System.out.println("Student with the highest score: " + highestScoreName);
    }



}


