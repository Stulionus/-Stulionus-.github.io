public class notesweek9 {
    
      /*
      Constructor----------------------------------
      Used to create an instance of an abject 
      Has to have the same name as the class
      
      */


    // Example 
    int puppyAge; 
    public notesweek9(String name)
    {
        //This constructor has one parametr, name. 
        System.out.println("Passed Name is: " + name);
        
    }

    // class method 
    public void setAge(int age)
    {
        puppyAge = age;
    }

    // Another class method
    public int getAge()
    {
        System.out.println("Puppy age is:" + puppyAge);
        return puppyAge; 
    }

    public static void main(String[] args) {
        // Object creation
        notesweek9 myPuppy = new notesweek9("Tommy");

        // Call class method to set puppy's age
        myPuppy.setAge(3);

        //Call another calss method to get puppy's age
        myPuppy.getAge();

        //Access instance variable 
        System.out.println("Variable Value: " + myPuppy.puppyAge);
    }
}

