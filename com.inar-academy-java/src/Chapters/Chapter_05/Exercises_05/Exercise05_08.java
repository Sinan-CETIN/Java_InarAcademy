import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.Scanner;

public class Exercise05_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of student :");
        int number = input.nextInt();
        int count = 1;
        double maxScore =0 ;
        String maxName = "";
        String table = "";

        while(count <= number){
            System.out.print("Enter student's name :");
            String name = input.next();
            System.out.print("Enter student's score :");
            double score = input.nextDouble();
            if(score > maxScore){
                maxScore = score;
                maxName = name;
            }
            table +=name + "   " + score + "\n";
            count++;
        }
        System.out.println("\n" + table + "\n\n" + "The name" +
                " of the student with the highest score :" + maxName+ "   "  + maxScore);
    }
}
