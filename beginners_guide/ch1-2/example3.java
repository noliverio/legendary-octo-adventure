/*
    This program to see the difference between int and double.
*/

class Example3 {
    public static void main(String args[]){
        int var; // declare an int variable
        double x; //declare a double precision floating point variable


        //assign values to the variables
        var = 10;
        x = 10.0;
        

        //Print out starting values
        System.out.println("Original value of var is: " + var);
        System.out.println("Original value of x is: " + x);
        System.out.println(); //print a blank line
    
        // divide both by 4
        var = var/4;
        x = x/4;

        //Print out final values
        System.out.println("Final value of var is: " + var);
        System.out.println("Final value of x is: " +x);
    }
}
