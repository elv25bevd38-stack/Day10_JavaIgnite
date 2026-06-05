/*
String Processor with Exception Safety

Create a program that:

Takes a string input

Performs:

substring operation
charAt operation
Requirements:

Handle:

StringIndexOutOfBoundsException
Example:
Invalid index handled safely
*/
import java.util.Scanner;
public class String_Processor 
{
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str ;
        System.out.print("Enter A String : ");
        str = sc.nextLine();
        int index;
        System.out.print("Enter The Index You Want To Get Its Character :");
        index = sc.nextInt();
        try
        {
            if( index > str.length())
            {
                throw new StringIndexOutOfBoundsException("Invalid index !!!");
            }
            else
            {
                System.out.println("Character at "+index+" is "+str.charAt(index));
                System.out.println(str.charAt(index));

            }

        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println("Invalid index !!!");
        }
    }
}
