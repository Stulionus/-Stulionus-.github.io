import java.util.Scanner;
import java.io.*;
public class midterm_part2{
    private static int j;

    public static void main(String[] args) {
        
    Scanner inputStream = null;
    PrintWriter outputStream = null;
    int StudentID;
    int i;
    boolean keepReading = true;
    int scoreTotal = 0;
    int numOfScores = 0;
    try 
    {
        inputStream = 
                new Scanner(new FileInputStream("quizScore.txt"));
        outputStream = new PrintWriter (
                new FileOutputStream("quizResults.txt"));
    }

    catch (FileNotFoundException e)

    {
        System.out.println(e);
        System.exit(0);
    }

    while(inputStream.hasNextInt()){
        StudentID = inputStream.nextInt();
        while (keepReading){
            if (inputStream.nextInt() == 0){
                keepReading = false;
                System.exit(0);
            }
            scoreTotal = scoreTotal + inputStream.nextInt();
            ++ numOfScores;
        }
        outputStream.print(StudentID + " ");
        outputStream.print("got a " + (scoreTotal/numOfScores));
    }
    System.out.println("Scores Succsefuly calculated!");
    inputStream.close();
    outputStream.close();
}
}