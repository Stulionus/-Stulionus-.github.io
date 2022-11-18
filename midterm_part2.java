import java.util.Scanner;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.io.*;
public class midterm_part2{
    public static void main(String[] args) {
        
    Scanner inputStream = null;
    PrintWriter outputStream = null;
    int StudentID;
    boolean keepReading = true;
    double scoreTotal = 0;
    int numOfScores = 0;
    try 
    {
        inputStream = new Scanner(new FileInputStream("quizScore.txt"));
        outputStream = new PrintWriter (new FileOutputStream("quizResults.txt"));

        StudentID = inputStream.nextInt();
        while(inputStream.hasNextDouble()){
                scoreTotal = scoreTotal + inputStream.nextDouble();
                ++ numOfScores;
            
            outputStream.print(StudentID + " ");
            outputStream.print("got a " + (scoreTotal/numOfScores));
        }
    }

    catch (FileNotFoundException e)

    {
        System.out.println(e);
        System.exit(0);
    }

    System.out.println("Scores Succsefuly calculated!");
    inputStream.close();
    outputStream.close();
}
}