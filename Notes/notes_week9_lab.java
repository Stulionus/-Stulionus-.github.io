import java.util.Arrays;

import javax.xml.transform.Source;
public class notes_week9_lab {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        /*
            Arrays --------------------------------
            To declare:
            vatiableType[] arrayName;

            To allocate memory:
            arrayName = new int[arrayLength]

            or 
            inr arrayName = {allElements};

            To print all elemnts:
            System.out.println(Arrays.toString(arrayName));
            (need to import java.util.arrays)
            or just use a for loop
         */

         int [] numbers = {1,2,3,4,5,6,7,8,9,10,11};
         int [][] newNumbers = {};
         //System.out.println(evenOrOdd(numbers));
         //doubleArray(numbers);
         //extractColumn(numbers, 2);
        workSheet();
         System.out.println("------------------------------------------");
    }

    public static boolean evenOrOdd(int[] array){
        for (int i = 0; i < array.length; ++i){
            if (array[i] % 2 != 0){
                return true;
            }
        }
        return false;
    }
    public static void doubleArray(int[] array){
        int [] doubledArray = new int[(array.length)*2];
        for (int i = 0; i < array.length; i++){
            doubledArray[i * 2] = array[i];
            doubledArray[i * 2 + 1] = array[i];
            
        }
        System.out.println(Arrays.toString(doubledArray));
        
    }
    /* 
    public static int[] extractColumn(int[] numbers, int column){
        int[] result = new int[numbers[column].length];
        for (int i = 0; i<numbers.length; ++i){
            result[i] = numbers[i][column];
        }
        System.out.println(Arrays.toString(result));
        return result; 
    }
    */

    public static void workSheet(){
        /* 
        String[] alpha = {"abc","def","ghi"};
        char[] chars = new char[alpha.length];
        for (int i = alpha.length - 1; i >= 0; i--){
            chars[i] = alpha[i].charAt[i];
        }
        int [] adding = {0,1,2,3,4,5};
        for (int j = 0; j < adding.length -1; j++){
            adding[j]= adding[j+1] +j;
        }
        */

        int [][] nums = new int [3][];
        for (int row = 0; row < nums.length; row++){
            nums[row] = new int[row + 1];
            for (int col = 0; col < nums[row].length; col++){
                nums[row][col]  = col;
            }
        }
        System.out.println(Arrays.toString(nums[0]));
        System.out.println(Arrays.toString(nums[1]));
        System.out.println(Arrays.toString(nums[2]));
        System.out.println(nums.length);
    }
}
