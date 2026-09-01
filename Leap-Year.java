/*
    Name Of The Program:Leapyear.java
    Author Of The Program:mahidhar
    Purpose Of The Program:To check whether the entered year is a leap year or not using conditional statements.
    Date On Which The Program Is Written:01-09-2026
    Description Of The Program (In My Own Words):This program takes a year as input and checks whether it is a leap year or not based on leap year conditions.
    Expected Input And Expected Outputs:
        Case 1:
              Expected Input:
              Enter year : 2000

              Expected Output:
              Leap year
        Case 2:
              Expected Input:
              Enter year : 2007

              Expected Output:
              not a leapyear
    Conclusion:Thus, the program successfully checks whether the entered year is a leap year or not.
*/




import java.util.Scanner;
class Leap
{
    public static void main(String[] args)
    {
    System.out.println("Enter Year :- ");

    Scanner s = new Scanner(System.in);

    int y = s.nextInt();

    if((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0 ))
       System.out.println("Entered year is a Leap Year!!");
    else
       System.out.println("Entered year is not a Leap Year!!");
    }
}