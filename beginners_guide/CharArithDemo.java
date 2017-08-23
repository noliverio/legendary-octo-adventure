/*
    Character variables treated like ints.
*/

class CharArithDemo{
    public static void main(String args[]){
        char character;

        character = 'X';
        System.out.println("The character contains: "+character);

        character ++; //increment character
        System.out.println("The character is now: "+character);

        character = 961; //assign a specific unicode value to the character
        System.out.println("Now the character is: "+character);
    }
}
