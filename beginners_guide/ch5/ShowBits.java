// Display the bits in a byte

class ShowBits{
    public static void main(String args[]){
        int t;
        byte val;

        val = 123;

// the loop iterates 01000000 00100000 00010000 00001000 00000100 00000010 00000001 
// each checks one value of the digits in the byte
        for(t=128; t>0; t=t/2){
            if((val & t) != 0) System.out.print("1 ");
            else System.out.print("0 ");
        }
        System.out.println();
    }
}
