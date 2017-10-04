//Use bitwise operations to make letter upercase

class UpCase{
    public static void main(String args[]){
        char ch;

        for(int i=0; i<10; i++){
            ch = (char) ('a' + i);
            System.out.print(ch);

            // 65503  = 1111 1111 1101 1111 will turn off 6th bit
            ch  = (char) ((int) ch & 65503); 

            System.out.print(ch + " ");
        }
    }
}
