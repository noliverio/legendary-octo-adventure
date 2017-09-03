/*
    Demonstrate code blocks in java
*/

class BlockDemo {
    public static void main(String args[]){
        double i, j, d;

        i = 0;
        j = 10;

        //avoid dividing by zero 
        if(i != 0){
            System.out.println("i does not equal zero");
            d = j / i;
            System.out.println("j / i is: " + d);
        }
    }
}
