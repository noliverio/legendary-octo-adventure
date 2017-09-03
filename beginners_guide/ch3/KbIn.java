// Read a character from the keyboard

class KbIn{
    public static void main(String args[])
        throws java.io.IOException{
            char ch;

            System.out.println("Press a key followed by Enter: ");
            ch = (char) System.in.read(); //get a char then cast to char
            System.out.println("Your key is: " +ch);

            System.out.println("Press a key followed by Enter: ");
            ch = (char) System.in.read(); //get a char then cast to char
            System.out.println("Your key is: " +ch);

            System.out.println("Press a key followed by Enter: ");
            ch = (char) System.in.read(); //get a char then cast to char
            System.out.println("Your key is: " +ch);
    }
}
