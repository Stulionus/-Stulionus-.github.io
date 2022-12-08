import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class TicTacToeGame{
    public static void main(String[] args) {
        System.out.println("Your character is: " + getUserCharacter());
        System.out.println("You are going first " + checkFirstMove());
    }

    public static char getUserCharacter (){
        char userChar = '0';
        System.out.println("Welcome to TicTacToeGame");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please choose do you want to play as \"o\" or \"x\".");
        userChar = keyboard.next().charAt(0);


        boolean keepAsking = true;
        while (keepAsking) {
            if (userChar == 'o' || userChar == 'O') {
                keepAsking = false;
                userChar = 'o';
            }
            else if (userChar == '0') {
                userChar = 'o';
            } else if (userChar == 'x' || userChar == 'X') {
                keepAsking = false;
                userChar = 'x';
            } else {
                System.out.println("Please enter either \"o\" or \"x\".");
                userChar = keyboard.next().charAt(0);
            }
        }
        return userChar;
    }

    public static void showGrid(){
        System.out.println("   |   |   ");
        System.out.println("-----------");
        System.out.println("   |   |   ");
        System.out.println("-----------");
        System.out.println("   |   |   ");
    }

    public static boolean checkFirstMove() {
        boolean isPlayerGoingFirst = true;
        Scanner inputStream = null;
        String lastWin = "Computer";
        try {
            inputStream = new Scanner(new FileInputStream("winLog.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        if (inputStream == null) {
            return isPlayerGoingFirst;
        } else {
            while(inputStream.hasNextLine()){
                lastWin = inputStream.nextLine();
            }
            if (lastWin.equals("Computer")) {
                return isPlayerGoingFirst;
            } else if (lastWin.equals("Player")){
                isPlayerGoingFirst = false;
            }
        }
        return isPlayerGoingFirst;
    }
}