
/*
    Name Of The Program:Finding largest of three numbers
    Author Of The Program:mahidhar
    Purpose Of The Program:To find and display the largest among three given numbers using Java.
    Date On Which The Program Is Written:27-08-2026
    Description Of The Program (In My Own Words):This program takes three numbers as input and compares them to find the largest number.
    Expected Input And Expected Outputs:
        Case 1:
              Expected Input:
              Enter Number :-
              3993 9292 2992

              Expected Output:
              9292 is largest
        Case 2:
              Expected Input:
              Enter Number :-
              54543 56464 69664

              Expected Output:
              69664 is largest
        
    Conclusion:The program successfully finds the largest of three numbers using conditional statements.
*/





import java.util.Scanner;
class Largest
{
 public static void main(String[] args)
 {
  System.out.println("Enter Number :- ");
  Scanner s = new Scanner(System.in);

  int a = s.nextInt();

  int b = s.nextInt();
  
  int c = s.nextInt();

  if(a>b && a>c)
    System.out.println(a + " is largest");
  else if(b>a && b>c)
    System.out.println(b + " is largest");
  else
    System.out.println(c + " is largest");
  }
  
}