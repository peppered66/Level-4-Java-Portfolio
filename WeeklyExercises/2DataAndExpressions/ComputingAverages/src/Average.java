// *******************************************************************
//   Average.java
//
//   Read three integers from the user and print their average
// *******************************************************************


import java.util.Scanner;
public class Average
{
    public static void main(String[] args)
    {
       int val1, val2, val3;
       double average;
       Scanner scan = new Scanner(System.in) ;
       System.out.println("Please enter three integers and " + "I will compute their average.");
       
       System.out.print("Please enter the first value: ");
       val1 = scan.nextInt();
       System.out.print("Please enter the second value: ");
       val2 = scan.nextInt();
       System.out.print("Please enter the third value: ");
       val3 = scan.nextInt();
       average = ((val1 + val2 +val3) /3);

       System.out.print("The average is " + average);

    }
}