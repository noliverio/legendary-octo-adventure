// The ASCII lowercase letters are separated from the uppercase letters by 32. Thus, to convert a lowercase letter to uppercase, subtract 32 from it. Use this information to write a program that reads characters from the keyboard. Have it convert all lowercase letters to uppercase, and all uppercase letters to lowercase, displaying the result. Make no changes to any other character. Have the program stop when the user enters a period. At the end, have the program display the number of case changes that have taken place.

class SelfTest10 {
    public static void main(String args[])
    throws java.io.IOException{
        int counter = 0;
        char ch, junk;
        do{
            ch = (char) System.in.read();
            if(ch >= 65 && ch <= 90){
                ch += 32;
                counter ++;
            }else if (ch >= 97 && ch <= 122 ){
                ch -= 32;
                counter ++;
            }
            System.out.println(ch);
            do{
                junk = (char) System.in.read();
            }while(junk != '\n');
        }while(ch != '.');
        System.out.println(counter + " letters converted");
    }
}
