
/*
    Name Of The Program:Grade calculator 
    Author Of The Program:mahidhar
    Purpose Of The Program:To determine and display a student's grade based on the marks entered by the user.
    Date On Which The Program Is Written:02-009-2026
    Description Of The Program (In My Own Words):This Java program takes a student's marks as input and displays the corresponding grade or fail result using if-else conditions.
    Expected Input And Expected Outputs:
        Case 1:
              Expected Input:
              Enter marks :- 97

              Expected Output:
              Grade-A
        Case 2:
              Expected Input:
              Enter marks :- 33

              Expected Output:
              Fail
        Case 3:
              Expected Input:
              Enter marks :-78

              Expected Output:
              Grade-B
    Conclusion:The program successfully determines and displays the student's grade based on the entered marks.
*/



import java.util.Scanner;
class Grade
{
    public static void main(String[] args)
    {
        System.out.println("Enter marks :- ");

        Scanner s = new Scanner(System.in);

        int m = s.nextInt();

        if(m >= 90)
          System.out.println(" Grade-A");
        else if(m >= 75)
          System.out.println(" Grade-B");
        else if(m >= 35)
          System.out.println(" Grade-c");
        else
          System.out.println(" Fail!! ");
          

    }
}