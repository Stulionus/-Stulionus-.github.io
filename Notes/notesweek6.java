import java.util.Scanner;
import java.io.*;
/**
 * Write a description of class noteweek6 here.
 * Iput from file and arrays
 * 
 */
public class notesweek6
{
    public static void main(String[]args)
    {
        /*
         Syntax:
         Scanner Stream_object(name) = new Scanner(new FileInputstream(FileName));
         .nextInt();
         .nextLine(); work in the same way
          
         
         if value is oncorect type, the exception will be thrown!
         
         if value is not and Int then NoSuchElementException will be thrown.
         
         
         to determine if the end of the file is reached use:
         
         hasNextInt, has NextLine ...  
         */
        
        //------------Example:
        
        Scanner inputStream = null;
        PrintWriter outputStream = null;
        
        try 
        {
            inputStream = 
                    new Scanner(new FileInputStream("stuff.txt"));
            outputStream = new PrintWriter (
                    new FileOutputStream("newStuff.txt"));
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Problem opening files.");
            System.exit(0);
        }
        
        String line = null;
        int count = 0;
        while(inputStream.hasNextLine())
        {
            line = inputStream.nextLine();
            count++;
            outputStream.println(count + " " + line);
        }
        inputStream.close();
        outputStream.close();
    }

    public static void arraysLecture(){
        /*
        1 dimensional arrays
        
        Declaring and array:
        
        double []arrayName = new double[50];
        
        50 - memmory allocation, 50 places 
        
        can put values when declaring
        
        int[] arrayName = {1,2,3,4};
         */
    }
}
