// Write a program that reads characters from the keyboard until a period is received. Have the program count the number of spaces. Report the total at the end of the program.

class SelfTest1 {
    public static void main(String args[])
    throws java.io.IOException{
        char ch, junk;
        int counter = 0;

        do{
            ch = (char) System.in.read();
            do{
                junk = (char) System.in.read();
            }while(junk != '\n');
            if(ch == ' '){
                counter ++;
            }
        }while(ch != '.');

        System.out.println(counter + " spaces were entered!");
    }
}
