
/**
 * Write a description of class notesweek7 here.
 *
 * @author Max Capcanari
 * @version 11/07
 */
public class notesweek7
{
    public static void main(String[] args)
    {
            int[] cards = {10, 4, 6, 7, 5, 9, 3, 2, 8};
            for (int i = 0; i < cards.length - 1; i++)
            {
                for (int j = i++; j < cards.length ; j++)
                {
                    if (cards[j] < cards[i])
                    {
                        int temp = cards[i];
                        cards[i] = cards[j];
                        cards[j] = temp;
                    }
                }

            }
        for (int i = 0; i < cards.length; i++){
            System.out.print(cards[i] + " ");
        }
        }

    public static void notes() {
        double[] arrayExample = new double[10];
        double[] arrayExampleB = new double[10];

        // this code does not copy the values from one array to another
        arrayExampleB = arrayExample;
        // ------- WRONG!!!!


        // use this code to create a new array with the same values
        int i;
        for (i = 0; i < arrayExample.length && i < arrayExampleB.length; i++) {
            arrayExampleB[i] = arrayExample[i];
        }

            /*
            to use an array as an argument

             methodName.zeroAll(arrayName); ----- with int

             */

        // to go through each element on array

        for (double tempVaraibleName : arrayExample) {
            //statements....
        }

        //-------Sorting-------------
        // Bubble sort (continuously comparing adjacent elements )
        // Exchange sort (comparing first one to every event from the array, then move on to the next one)
        // Selection sort (find the smallest, moves to the begging, then does it again)
        // Insertion sort (takes each number and compares it to what is already sorted)
    }
    }

