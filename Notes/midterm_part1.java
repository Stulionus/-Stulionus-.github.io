import java.util.Scanner;
import java.lang.Math;
import java.io.*;

public class midterm_part1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;
        PrintWriter outputStream = null;
        double[][] newArray = new double [3][3];
        for (i = 0; i < newArray.length; ++i){
            newArray[i][0] = scan.nextDouble();
            newArray[i][1] = newArray[i][0] * 3.0;
            newArray[i][2] = Math.pow(newArray[i][0],2);
        }
        
        try 
        {
            outputStream = new PrintWriter (
                    new FileOutputStream("Midterm_text1.txt"));
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Problem opening files.");
            System.exit(0);
        }
        
        for (i = 0; i < newArray.length; ++i){
            outputStream.print(newArray[i][0] + " ");
            outputStream.print(newArray[i][1] + " ");
            outputStream.print(newArray[i][2] + " ");
            outputStream.println();
        }

        outputStream.close();
    }
}
