import java.util.Scanner;

public class chat {

    // Initialize a 2D array representing the game board
    private static char[][] gameBoard = new char[3][3];

    // Initialize players with their respective characters
    private static char player1 = 'X';
    private static char player2 = 'O';

    // Initialize a scanner to read user input
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Initialize the game board with empty spaces
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                gameBoard[i][j] = ' ';
            }
        }

        // Start the game
        playGame();
    }

    // Method to play the game
    private static void playGame() {
        // Display the initial game board
        printGameBoard();

        // Loop until the game is over
        while (true) {
            // Get the row and column where player 1 wants to place their character
            System.out.println("Player 1: Enter the row and column where you want to place your character (separated by a space):");
            int row1 = scanner.nextInt();
            int col1 = scanner.nextInt();

            // Validate the input
            if (row1 < 0 || row1 > 2 || col1 < 0 || col1 > 2) {
                System.out.println("Invalid input. Please enter a valid row and column (between 0 and 2).");
                continue;
            }

            // Check if the selected position is already occupied
            if (gameBoard[row1][col1] != ' ') {
                System.out.println("The selected position is already occupied. Please choose another position.");
                continue;
            }

            // Place player 1's character on the game board
            gameBoard[row1][col1] = player1;

            // Check if player 1 has won the game
            if (checkWin(player1)) {
                System.out.println("Player 1 wins!");
                break;
            }

            // Check if the game is a draw
            if (isDraw()) {
                System.out.println("Draw!");
                break;
            }

            // Get the row and column where player 2 wants to place their character
            System.out.println("Player 2: Enter the row and column where you want to place your character (separated by a space):");
            int row2 = scanner.nextInt();
            int col2 = scanner.nextInt();

            // Validate the input
            if (row2 < 0 || row2 > 2 || col2 < 0 || col2 > 2) {
                System.out.println("Invalid input. Please enter a valid row and column (between 0 and 2).");
                continue;
            }

            // Check if the selected position is already occupied
            if (gameBoard[row2][col2] != ' ') {
                System.out.println(" The selected position is already occupied. Please choose another position.");
                continue;
            }

// Place player 2's character on the game board
            gameBoard[row2][col2] = player2;

// Check if player 2 has won the game
            if (checkWin(player2)) {
                System.out.println("Player 2 wins!");
                break;
            }

// Check if the game is a draw
            if (isDraw()) {
                System.out.println("Draw!");
                break;
            }

// Display the game board after each turn
            printGameBoard();
        }
    }

    // Method to check if a player has won the game
    private static boolean checkWin(char player) {
// Check all the rows
        for (int i = 0; i < gameBoard.length; i++) {
            if (gameBoard[i][0] == player && gameBoard[i][1] == player && gameBoard[i][2] == player) {
                return true;
            }
        }

// Check all the columns
        for (int i = 0; i < gameBoard.length; i++) {
            if (gameBoard[0][i] == player && gameBoard[1][i] == player && gameBoard[2][i] == player) {
                return true;
            }
        }

// Check the diagonal starting from the top left corner
        if (gameBoard[0][0] == player && gameBoard[1][1] == player && gameBoard[2][2] == player) {
            return true;
        }

// Check the diagonal starting from the top right corner
        if (gameBoard[0][2] == player && gameBoard[1][1] == player && gameBoard[2][0] == player) {
            return true;
        }

        return false;
    }

    // Method to check if the game is a draw
    private static boolean isDraw() {
// Loop through all the cells on the game board
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                // If any cell is empty, the game is not a draw
                if (gameBoard[i][j] == ' ') {
                    return false;
                }
            }
        }

// If all the cells are filled and nobody has won, the game is a draw
        return true;
    }

    // Method to print the game board
    private static void printGameBoard() {
        System.out.println("-------------");

        for (int i = 0; i < gameBoard.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < gameBoard[i].length; j++) {
                System.out.print(gameBoard[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
}
