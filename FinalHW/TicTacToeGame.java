import java.io.*;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TicTacToeGame{
    // Array of characters to show what character is in what place
    private static char[] arrayOfCells = {'1','2','3','4','5','6','7','8','9'};

    // Array of place s that are taken to not allow user or computer to overwrite taken places
    private static int[] arrayOfTakenIndeces = {0,0,0,0,0,0,0,0,0};

    // Defaults for user and computer characters
    private static char userChar = '0';
    private static char compChar = 'X';

    public static void main(String[] args) {
        System.out.println("Welcome to Tic-Tac-Toe!");
        System.out.println("Enter \"1\" to start playing.");
        System.out.println("Enter \"2\" to to read the rules.");
        System.out.println("Enter \"0\" to exit.");
        Scanner keyboard = new Scanner(System.in);
        int userChoice = 1;


        boolean keepAsking = true;
        do {
            try {
                userChoice = keyboard.nextInt();
                keepAsking = false;
            }catch (InputMismatchException e){
                System.out.println("Please enter an integer that is 1, 2 or 0.");
                keyboard.nextLine();
            }
        }while (keepAsking);



        while (userChoice != 0){
            switch (userChoice) {
                case 1:
                    char userChar = getUserCharacter();
                    System.out.println("Your character is: " + userChar);
                    System.out.println("You are going first " + checkFirstMove());
                    roundOfAGame();
                    break;
                case 2:
                    System.out.println("Rules:");
                    System.out.println("First you choose to play as \"0\" or \"X\".");
                    System.out.println("Then the game begins, whoever lost in the last game goes first.");
                    System.out.println("To choose a cell simply type in the number that is in that cell.");
                    System.out.println("Whoever is first to place three characters in a row wins.");
                    break;
            }
            userChoice = keyboard.nextInt();
        }
        System.exit(0);

    }

    // Method to get character that player wants to play as. Computer gets another character
    public static char getUserCharacter (){
        System.out.println("Welcome to TicTacToeGame");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please choose do you want to play as \"o\" or \"x\".");
        userChar = keyboard.next().charAt(0);


        boolean keepAsking = true;
        while (keepAsking) {
            if (userChar == 'o' || userChar == 'O') {
                keepAsking = false;
                userChar = 'O';
                compChar = 'X';
            }
            else if (userChar == '0') {
                userChar = 'O';
                compChar = 'X';
            } else if (userChar == 'x' || userChar == 'X') {
                keepAsking = false;
                userChar = 'X';
                compChar = 'O';
            } else {
                System.out.println("Please enter either \"o\" or \"x\".");
                userChar = keyboard.next().charAt(0);
            }
        }
        return userChar;
    }


    // Method that sets up the grid and array of cells
    public static void makeAndPrintGrid(){
        System.out.printf( " %-2c| %-2c|%2c   \n", arrayOfCells[0],arrayOfCells[1],arrayOfCells[2]);
        System.out.println("-----------");
        System.out.printf( " %-2c| %-2c|%2c   \n", arrayOfCells[3],arrayOfCells[4],arrayOfCells[5]);
        System.out.println("-----------");
        System.out.printf( " %-2c| %-2c|%2c   \n", arrayOfCells[6],arrayOfCells[7],arrayOfCells[8]);
    }

    //Method to check who was the last winner, and determine who goes first now
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

    public static String roundOfAGame(){
        boolean playerWon = false;
        boolean computerWon = false;
        String winner = null;
        do {
            makeAndPrintGrid();
            playersMove();
            computersMove();
            playerWon = checkWinConditions(userChar);
            computerWon = checkWinConditions(compChar);
        } while (!playerWon || !computerWon);

        if (playerWon){
            winner = "Player";
        }else{
            winner = "Computer";
        }
        return winner;
    }

    public static void playersMove() {
        System.out.println("Chose what cell you want to place you character in.");
        Scanner keyboard = new Scanner(System.in);
        boolean keepAsking = true;
        int userChoice = 0;
        do {
            userChoice = keyboard.nextInt() - 1;
            if(arrayOfTakenIndeces[userChoice] == 0) {
                arrayOfCells[userChoice] = userChar;
                arrayOfTakenIndeces[userChoice] = 1;
                keepAsking = false;
            } else {
                System.out.println("Please choose a cell that is not taken.");
                userChoice = keyboard.nextInt() - 1;
            }
        }while (keepAsking);

    }

    public static void computersMove(){
        int min = 8;
        int max = 0;
        int compChoice = (int) (Math.random()*(max-min+1)+min);
        System.out.println("Computer choice is:" + compChoice);
        arrayOfCells[compChoice-1] = compChar;
        arrayOfTakenIndeces[compChoice-1] = 1;
    }

    public static boolean checkWinConditions(char checkedChar){
        if (arrayOfCells[0] == checkedChar && arrayOfCells[1] == checkedChar && arrayOfCells[2] == checkedChar){
            return true;
        }else if (arrayOfCells[3] == checkedChar && arrayOfCells[4] == checkedChar && arrayOfCells[5] == checkedChar){
            return true;
        }else if (arrayOfCells[6] == checkedChar && arrayOfCells[7] == checkedChar && arrayOfCells[8] == checkedChar){
            return true;
        }else if (arrayOfCells[0] == checkedChar && arrayOfCells[3] == checkedChar && arrayOfCells[6] == checkedChar){
            return true;
        }else if (arrayOfCells[1] == checkedChar && arrayOfCells[4] == checkedChar && arrayOfCells[7] == checkedChar){
            return true;
        }else if (arrayOfCells[2] == checkedChar && arrayOfCells[5] == checkedChar && arrayOfCells[8] == checkedChar){
            return true;
        }else if (arrayOfCells[0] == checkedChar && arrayOfCells[4] == checkedChar && arrayOfCells[8] == checkedChar){
            return true;
        }else if (arrayOfCells[2] == checkedChar && arrayOfCells[4] == checkedChar && arrayOfCells[6] == checkedChar){
            return true;
        }
        return false;
    }
}