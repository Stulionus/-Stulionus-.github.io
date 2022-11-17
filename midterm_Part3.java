public class midterm_Part3 { 
    public static void main(String[] args) {
        int [] numArray = {84, 69, 76, 86, 94, 91}; 
                   dataSort(numArray); 
    }
    public static void dataSort( int [ ] num){ //  Sort Method for Descending Order{ 
         int j, key, i;                      
     
         for (j = 1; j < num.length - 2 ; j++)    // Start with 1 (not 0) 
        { 
               key = num[ j ];
               System.out.println("Key" + key); 
               for(i = j - 1; (i >= 0) && (num[ i ] < key); i--)    
              { 
                     num[ i+1 ] = num[ i ]; 
                     
              } 
              System.out.println("I is " + i);
             num[ i+1 ] = key;     
         } 
         
         for (i = 0; i < num.length; ++i){
             System.out.println(num[i]);
         }
         System.out.println();
     } 
    } 

