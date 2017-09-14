//Guess the letter game. 4th version

class Guess4{
    public static void main(String args[])
    throws java.io.IOException{
        char ch, ignore, answer = 'K';
        boolean first = true;

        do {
            System.out.println("I'm thinking of a letter between A and Z.");
            System.out.println("Can you guess it? ");
            
            // Adding this incase the user wants to exit without correctly guessing the number
            if(first){
                System.out.println("You can also press '~' to exit");
                first = false;
            }

            // read the char from keyboard
            ch = (char) System.in.read();

            // discard any other characters in the input buffer
            do {
                ignore = (char) System.in.read();
            }while(ignore != '\n');

            // I played around with putting this inner if statement in brackets. it looks cleaner that way, but I am leaving it like this to remind myself that it works.
            if (ch != '~')
            if (ch == answer) System.out.println("** Right **");
            else{
                 System.out.print("... Sorry, you're ");
                 if(ch< answer) System.out.println("too low");
                 else System.out.println("too high");
                 System.out.println("Try again!\n");
            }
            else ch = answer;
        }while(answer != ch);
    }
}
