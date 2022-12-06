import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class homework4 {
    public static void main(String[] args) {
        Scanner inputStream = null;
        PrintWriter outputStream = null;
        double programWeight;
        double midtermWeight;
        double finalWeight;
        int [] IDandScores = new int[4];
        boolean keepReading = true;
        try 
        {
            inputStream = new Scanner(new FileInputStream("courseData.txt"));
            outputStream = new PrintWriter(new FileOutputStream("courseDataCalculated.txt"));
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
            System.exit(0);
        }
        programWeight = inputStream.nextDouble();
        midtermWeight = inputStream.nextDouble();
        finalWeight = inputStream.nextDouble();
        
        Pattern p = Pattern.compile("\\d+");
        while (inputStream.hasNext(p)){
            int courseID;
            courseID = inputStream.nextInt();
            a: while(inputStream.hasNext()){
                int studentID = inputStream.nextInt();
                if (studentID == 0 ) break a;
                int programScore = inputStream.nextInt(); 
                int midtermScore = inputStream.nextInt();
                int finalScore = inputStream.nextInt(); 
                System.out.println(studentID + " " + programScore  + " " + midtermScore + " " + finalScore);
                // Calculation.....
            }
            outputStream.println("Grade Data For Class " + courseID);
        }
        outputStream.println("ID      Programs   Midterm Final   Weighted   Average   Overall   Grade");
        System.out.println("Succsefuly saved!");
        inputStream.close();
        outputStream.close();
    }
}
/* 
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
        */  