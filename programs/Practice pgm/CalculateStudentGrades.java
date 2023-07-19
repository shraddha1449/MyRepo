import java.util.Scanner;
public class CalculateStudentGrades {
   public static void main(String args[])
   {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter average of your marks (less than 100)::");
      int marks = sc.nextInt();
      char grade;

      if(marks>=80)
      {
         grade = 'A';
      }
      else if(marks>=60 && marks<80)
      {
         grade = 'B';
      }
      else if(marks>=50 && marks<60)
      {
         grade = 'C';
      }
      else if(marks>=45 && marks<50)
      {
         grade = 'D';
      }
      else if(marks>=25 && marks<45)
      {
         grade = 'E';
      }
      else 
      {
          grade='F';
      }
      System.out.println("Your grade is " + grade);
   }
}