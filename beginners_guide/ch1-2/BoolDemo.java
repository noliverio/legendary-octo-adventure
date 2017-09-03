/*
    Demo Bools
*/

class BoolDemo{
    public static void main(String args[]){
        boolean bool;

        bool = false;
        System.out.println("The bool is: "+bool);

        bool = true;
        System.out.println("The bool is: "+bool);

        if(bool)
            System.out.println("This is excecuted.");
        
        bool = false;

        if (bool)
            System.out.println("This is not executed");

        // outcome of a relational operation is a bool

        System.out.println("10 > 9 is " + (10>9));
    }
}
