// This program contains an error and will not work
// Creates the error:
// BreakErr.java:11: error: undefined label: one

class BreakErr {
    public static void main(String args[]){
        
        one: for(int i=0; i<3 ; i++){
            System.out.print("Pass " + i + ": ");
        }

        for(int j=0; j<100; j++){
            if(j==10) break one; // one is not defined for this block
                System.out.print(j + " ");
        }
    }
}
