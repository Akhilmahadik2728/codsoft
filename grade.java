import java.util.*;
public class grade {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of subjects");
        int totsubjects = sc.nextInt();

        if(totsubjects <=0){
            System.out.println("enter a valid number of subjects");
        return;
        }

        int totalmarks = 0;
        int maxmarkspersubject = 100;
        for(int i = 1; i<=totsubjects; i++){
        System.out.print("enter the marks obtained in subject"+ i +"(out of 100)");
        int mark = sc.nextInt();
        if (mark < 0 || mark > maxmarkspersubject){
            System.out.println("please enter the valid marks");
            i--;
        }
        else{
            totalmarks += mark;
        }
    }
        double averagepercentage = (double) totalmarks / (totsubjects * maxmarkspersubject)*100;
        System.out.println("total marks = " + totalmarks);
        System.out.println("average percentage = " + averagepercentage + "%");

        String grade;

        if(averagepercentage >= 90){
            grade = "A+";
        }
        else if (averagepercentage >= 80){
             grade = "A";
        }
         else if (averagepercentage >= 70){
             grade = "B";
        }
         else if (averagepercentage >= 60){
             grade = "C";
        }
         else if (averagepercentage >= 50){
             grade = "D";
        }
        else{
            grade ="F";
        }
        System.out.println("Grade" + grade);

    }

    
}
