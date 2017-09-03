/*
    Simple program to see if statements in java
*/

class IfDemo{
    public static void main(String args[]){
        int a, b, c;

        a = 2;
        b = 3;

        if (a<b) System.out.println("a is less than b");

        //This won't display anything. The condition will never be true.
        if (a==b) System.out.println ("You will not see this.");

        System.out.println();

        c = a - b; //c now contains -1
        
        System.out.println("c contains -1");
        if (c >= 0) System.out.println("c is non-negaitve");
        if (c < 0) System.out.println("c is negative");

        System.out.println();

        c = b - a; //c now contains 1 

        System.out.println("c contains 1");
        if (c >= 0) System.out.println("c is non-negaitve");
        if (c < 0) System.out.println("c is negative");
    }
}
