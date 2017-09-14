//The iteration expression in a for loop need not always alter the loop control variable by a fixed amount. Instead, the loop control variable can change in any arbitrary way. Using this concept, write a program that uses a for loop to generate and display the progression 1, 2, 4, 8, 16, 32, and so on.

class SelfTest9 {
    public static void main(String args[]){
        for(int i=1; i<=1024 ; i *=2)
            System.out.print(i + ", ");
        System.out.println();
    }
}
