package HW4;
import java.io.*;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class homework4 {
    public static void main(String[] args) {
        Scanner inputStream = null;
        PrintWriter outputStream = null;
        double programWeight;
        double midtermWeight;
        double finalWeight;
        int courseID;
        int studentID; 
        int programScore; 
        int midtermScore;
        int finalScore;
        try 
        {
            inputStream = new Scanner(new FileInputStream("/Users/maxim/Documents/CSS142/GitHub/Stulionus.github.io/HW4/courseData.txt"));
            outputStream = new PrintWriter(new FileOutputStream("/Users/maxim/Documents/CSS142/GitHub/Stulionus.github.io/HW4/courseDataCalculated.txt"));
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
            System.exit(0);
        }
        programWeight = inputStream.nextDouble();
        midtermWeight = inputStream.nextDouble();
        finalWeight = inputStream.nextDouble();
        
        for (int j = 0; j < 3; j++){
        courseID = inputStream.nextInt();
        
        outputStream.println("Grade Data For Class " + courseID);
        outputStream.println("ID      Programs   Midterm Final   Weighted   Average   Overall   Grade");
       
        // for (int i = 0; i < 3; ++i){
        while (inputStream.nextInt() != 0){
            studentID = inputStream.nextInt();
            outputStream.print(studentID+ "    ");
            programScore = inputStream.nextInt();
            outputStream.print(programScore + "         ");
            midtermScore = inputStream.nextInt();
            outputStream.print(midtermScore + "      ");
            finalScore = inputStream.nextInt();
            outputStream.print(finalScore + "   ");
            outputStream.println(); 
            
            }
            
        }

        System.out.println("Succsefuly saved!");
        inputStream.close();
        outputStream.close();
    }
}
