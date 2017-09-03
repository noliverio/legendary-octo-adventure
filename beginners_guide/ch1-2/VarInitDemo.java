/*
    Demo lifetime of a variable
*/

class VarInitDemo{
    public static void main(String args[]){
        int x;
        for (x = 0; x < 3; x++){
            int y = -1; //y is initialized each time the block is entered
            System.out.println("y is: " +y) ;
            y = 100;
            System.out.println("y is now: " + y );

            //
            // This makes intuitive sense, thinking along the line of each time you kit line 9 you re-create var y. 
            //
        }
    }
}
