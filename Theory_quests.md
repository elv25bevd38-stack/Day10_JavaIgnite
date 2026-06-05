1)Explain Java Exception hierarchy:

Throwable
Exception
Error

Give one example for each.
ANS -->  Java exception handling is based on the class hierarchy:
         a) Throwable
                Parent class of all errors and exceptions.
                Only objects derived from Throwable can be thrown.

                Example: throw new Throwable("Problem Occurred");
            b) Exception
                Used for conditions that a program can handle.
                Occurs during program execution.

                Example:  int a = 10 / 0;
            c) Error
                Serious problems that are generally not handled by programs.
                Related to JVM or system failure.

                Example: int arr[] = new int[999999999];






2)Can we have multiple catch blocks?
Explain with example when it is useful.
ANS -->
        Yes, Java allows multiple catch blocks.
       * Different messages for different errors.
       * Easier debugging.
       * Better user experience.

3)A program crashes when user enters text instead of number.


What exception occurs?
ANS--> InputMismatchException

How will you handle it?
ANS--> Using try-catch.


Where should try-catch be placed?
ANS -->try-catch should be placed around the risky code where exception may occur.



4)try {
    int a = 10 / 0;
    
    System.out.println("Hello");

}

catch(Exception e) {

    System.out.println("Error handled");

}

System.out.println("End");

Predict the output - 

What prints first?
ANS -->Error handled

Does program stop?
ANS --> NO




