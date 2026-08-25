/*
    Name Of The Program:EvenOdd checker
    Author Of The Program:mahidhar
    Purpose Of The Program:To check whether a given number is even or odd.
    Date On Which The Program Is Written:25-08-2026
    Description Of The Program (In My Own Words):A simple Java program that checks whether the entered number is even or odd.
    Expected Input And Expected Outputs:
        Case 1:
              Expected Input:
              Enter number:
              7373

              Expected Output:
              Odd Number
        Case 2:
              Expected Input:
              Enter Nunber:
              83832

              Expected Output:
              Even Number
    Conclusion:
    The program successfully determines whether a given number is even or odd.
*/





import java.util.Scanner;
class EvenOdd
{
  public static void main(String[] args)
  {
    System.out.println("Enter number : ");
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
   if(n%2==0)
     System.out.println("Even Number");
   else
      System.out.println("Odd Number");
    }
  }