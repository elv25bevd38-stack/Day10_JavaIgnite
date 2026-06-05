/*
Student Marks System (Safe Input)

Create a program that:

Stores 5 student marks in an array
Takes index input from user
Displays mark
Add Exception Handling:
Handle invalid index
Handle invalid input (if user enters text instead of number)
*/
import java.util.Scanner;
import java.util.InputMismatchException;
public class Student_Marks 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String marks[] = new String[5];
        System.out.println("Enter the marks of 5 Students ");
        for(int i=0 ; i<5 ; i++)
        {
            System.out.print("Enter The Mark of "+(i+1)+" Student :");
            marks[i] = sc.nextLine();

        }
        System.out.print("Enter The Index Of Student to Display Marks : ");
        int index = sc.nextInt();
        try
        {
            if(index > 5)
            {
                throw new IndexOutOfBoundsException("Invalid Input !!!");

            }
            
            
            else
            {
                
                System.out.println("Mark of "+index+" Student is "+marks[index-1]);
            }
        } 
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("Invalid Input !!!");
        }

    }
    
}
