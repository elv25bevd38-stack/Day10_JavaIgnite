/*
ATM Multi-Level Exception System

Create a program that simulates ATM withdrawal.

Requirements:
Take balance and withdrawal amount
If withdrawal > balance → handle exception
If withdrawal amount is negative → handle exception
If input is invalid (text instead of number) → handle exception
Expected Output:
Transaction Successful / Insufficient Balance / Invalid Input
*/

import java.util.Scanner;
import java.util.InputMismatchException;
public class ATM_Multi_Level_Exception
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double balance , withdrawl;
        try
        {
            System.out.print("Enter Balance : ");
            balance = sc.nextDouble();
            System.out.print("Enter withdrawl Amount : ");
            withdrawl = sc.nextDouble();
            if(withdrawl > balance)
            {
                throw new Exception("Insufficient Balance");
            }
            else if(withdrawl < 0)
            {
                throw new InputMismatchException("Invalid Input");
            }
            else
            {
                System.out.println("Transaction Successful ");
                System.out.println("Current Balance : "+(balance-withdrawl));
            }


        }
        catch(InputMismatchException e)
        {
            System.out.println("Invalid Input");
        }
        catch(Exception e)
        {
            System.out.println("Insufficient Balance");
        }
    }
}
