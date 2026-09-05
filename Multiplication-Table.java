/*
    Name Of The Program:Multiplication Table
    Author Of The Program:mahidhar
    Purpose Of The Program:multiplication table of a given number from 1 to 10.
    Date On Which The Program Is Written:05-07-2026
    Description Of The Program (In My Own Words):This program takes a number as input and prints its multiplication table from 1 to 10.
    Expected Input And Expected Outputs:
        Case 1:
              Expected Input:
              Enter Number :- 2

              Expected Output:
              2 * 1 = 2
              2 * 2 = 4
              2 * 3 = 6
              2 * 4 = 8
              2 * 5 = 10
              2 * 6 = 12
              2 * 7 = 14
              2 * 8 = 16
              2 * 9 = 18
              2 * 10 = 20


    Conclusion:The program successfully prints the multiplication table of the given number from 1 to 10.
*/






import java.util.Scanner;
class multi
{
  public static void main(String[] args)
  {
    System.out.println("Enter Number :- ");
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    for(int i = 1; i <=10; i++)
        System.out.println(n + " * " + i + " = " + (n * i));
      
     }
 }   
    