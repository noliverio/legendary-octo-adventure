// Lowecases letters.

class LowCase{
    public static void main(String args[]){
        char ch;

        for(int i=0; i<10; i++){
            ch = (char) ('A' + i);
            System.out.print(ch);

            // Turn on the 6th bit. 
            // 0010 0000
            ch = (char) ((int) ch | 32);
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}
