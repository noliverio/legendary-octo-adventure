// Demo an array overrun.
// compiles to, but fails at runtime
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10

class ArrayErr {
    public static void main(String args[]){
        int sample[] = new int[10];
        int i;

        // Generate an array overrun
        for(i=0; i<100; i++)
            sample[i]=i;
    }
}
