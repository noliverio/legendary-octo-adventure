//Demo block scope

class ScopeDemo{
    public static void main(String args[]){
        int x; // visible to all code within main

        x = 10;
        if (x == 10){ //start a new scope
            int y = 20; //only visible within this code block

            // x and y are both visible here
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        // y = 100; //"Error can not find sysmbol" y not known here

        //x is still visible
        System.out.println("x is: " + x);
    }
}
