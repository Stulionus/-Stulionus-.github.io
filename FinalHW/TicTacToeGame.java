import java.util.InputMismatchException;
import java.util.Scanner;
public class TicTacToeGame{
    public static void main(String[] args) {
        char userChar = '0'; 
        System.out.println("Weloce to TicTacToeGame");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please choose do you want to play as \"o\" or \"x\".");
        boolean keepAsking = true;
        while (keepAsking){
        if (keyboard.next().charAt(0) == 'o' || keyboard.next().charAt(0) == 'O'){
            keepAsking = false;
            userChar = 'o';
        } else if (keyboard.nextInt() == 0){
            userChar = 'o';
        }else if (keyboard.next().charAt(0) == 'x' || keyboard.next().charAt(0) == 'X'){ 
            keepAsking = false;
            userChar = 'x';
        }else {
            System.out.println("Please enter either \"o\" or \"x\".");
        }
        }
        System.out.println("Your character is: " + userChar);
    }

    public static void showGrid(){
        System.out.println("   |   |   ");
        System.out.println("-----------");
        System.out.println("   |   |   ");
        System.out.println("-----------");
        System.out.println("   |   |   ");
    }
}