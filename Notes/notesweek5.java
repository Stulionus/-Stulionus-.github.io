// Import all stuff
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class notesweek5
{
    public static void main(String[] args) {
        /*
      
        PrintWriter is a steam class 
        To  use impotrt java.io

        to appent to file that already exist 

        PrintWriter OutputStreamName = null;
        
        OutputStreamName = new PrintWriter(new FileOutputStream(File_name,true));
        
        if file does not exist it creates new, if it does it adds text  to the file 
        
        ------------Exceptions -----------
        
        Exception is not a syntax error! 
        
        semantic error (meaning/ logic error)
        ex: System.out.println(1/0);
        
        when semantic error occurs, java throws an exception
        
        Syntax to handle exceptions: 
        
        Use try/catch block:
        
        try {
            System.out.println(1/0); // code that could result in an exception 
        }
        catch (Arithmetic exception e) {
            // does something in case an exception happend
        }
        
        -------------  File  IO (input/output)------------
        
        Will readi input from a file and output to the file 
        
        Takes 3 steps:

        1 open a file 
        2 read/output from a file
        3 close a file 
        
        -----------To open and read a file use scanner:-------------------
        
        try {
            Scanner scannerName = new Scanner(new FileInputStream("fileName.txt"));
        }
        catch (FileNotFoundExcpetion e){
            System.out.println(e); // prints out an exception
        }
        
        ------------To close the file use try-with-resources statement:---------------
    
        try (Scanner scannerName = new Scanner(new FileInputStream("fileName.txt"))){
        //read from file
        }
        catch (FileNotFoundExcpetion e){
            System.out.println(e); // prints out an exception
        }
        
        -----------Another Example:------
        
        try (Scanner scannerName = new Scanner(new FileInputStream("fileName.txt"))){
            //read from file
            while(scannerName.hasNext()){
            
            }
        }
        catch (FileNotFoundExcpetion e){
            System.out.println(e); // prints out an exception
        }
        
        
        ----------To write to file: 
        
        try (PrintWriter fileWriter = new PrintWriter(new FileOutputStream("fileOut.txt"))){
            //Write to file
            Syste.out.println("Something");
        }
        catch (FileNotFoundExcpetion e){
            System.out.println(e); // prints out an exception
        }
        
        ----------To add text to the file: 
        
        
        Add , true after the file name: 
        (PrintWriter fileWriter = new PrintWriter(new FileOutputStream("fileOut.txt", true)))
        
        
        */
        
        
        
        
        
        PrintWriter outputStream = null;// create and object, (null) to make it emty for now
        int lineNum;
        String poem; 
        boolean done = false; 
        String errorValue;
        try 
        {
            outputStream =
                new PrintWriter(new FileOutputStream("stuff.txt")); // outStream is conecting to file stuff.txt  
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error");
            System.exit(0);
        }
        
        System.out.println("Writing to file");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the poem");
        poem = scan.nextLine();
        System.out.println("Please enter the number of lines");
        lineNum = scan.nextInt();
        for (int  i = 0; i < lineNum; i++ ){
            outputStream.println(poem); 
        }
        outputStream.close();// always must be here to close the stream
        System.out.println("End of Program");
    }
}
