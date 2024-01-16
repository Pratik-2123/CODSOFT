import java.util.*;
public class task2 {

    public static void input(String names[] , int marks[], int total_sub){
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<total_sub; i++) {
            System.out.println("Enter the name of subject : ");
            names[i] = sc.next();
        }

        for(int i=0; i<names.length; i++) {
            System.out.println("Enter the marks obtained in " + names[i]);
            marks[i] = sc.nextInt();
        }
    }

    public static char Calc_Grade(float avg) {
        char Grade;
        if(avg > 90) {
            Grade = 'A';
        } else if(avg > 80) {
            Grade = 'B';
        } else if(avg > 70) {
            Grade = 'C';
        } else if(avg > 60) {
            Grade = 'D';
        } else if(avg > 50) {
            Grade = 'E';
        } else {
            Grade = 'F';
        }

        return Grade;
    }

    public static void display(float avg, String names[], int marks[]) {
        for(int i=0; i<names.length; i++) {
            System.out.println("Marks in " + names[i] + " = " + marks[i]);
        }

        System.out.println();
        System.out.println("The average Percentage is : " + avg);
        System.out.println("The associated Grade is : " + Calc_Grade(avg));
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("-------------Student Grade Calculator-------------");
        System.out.println("Please Enter the marks of each subject out of 100");

        System.out.println("Enter the total number of subjects : ");
        int total_sub = sc.nextInt();        

        String names[] = new String[total_sub];
        int marks[] = new int[total_sub];
         
        System.out.println();
        input(names, marks, total_sub);

        int sum_of_total_marks = 0;

        for(int i=0; i<marks.length; i++) {
            sum_of_total_marks += marks[i]; 
        }

        float avg = sum_of_total_marks / names.length;

        System.out.println();
        display(avg, names, marks);
    }
}
