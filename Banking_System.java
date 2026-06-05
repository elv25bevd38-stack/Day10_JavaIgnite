/*
Banking System (Real-world Simulation)

Create a program that:

Takes account balance
Takes withdrawal amount
Rules:
If withdrawal > balance → throw and handle exception
If invalid input → handle exception
Output:
Withdrawal successful OR Insufficient balance
*/
import java.util.Scanner;
import java.util.InputMismatchException;

public class Banking_System 
{
    public static void main(String[] args )
{ 
    Scanner sc = new Scanner(System.in);
    double balance,withdrawl;

    try
    {
            System.out.print("Enter Balance : ");
            balance = sc.nextDouble();
            System.out.print("Enter withdrawl Amount : ");
            withdrawl = sc.nextDouble();
            if(withdrawl > balance)
            {
                throw new Exception("Insufficient balance");
            }
            else
            {
                System.out.println("Withdrawal successful");
                System.out.println("Current Balance : "+(balance-withdrawl));
            }
    }
    catch(Exception e)
    {
        System.out.println("Insufficient balance");
    }
}
}
