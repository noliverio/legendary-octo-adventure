/*
 *Demo auto conversion from long to double
 * /

class LtoD{
    public static void main(String args[]){
        long L;
        double D;

        L = 100123285L;
        D = L;

        System.out.println("L and D: " + L + " " + D);
    }
}
*/

// This version should not compile.
// Lossy conversion error.

class LtoD{
    public static void main(String args[]){
        long L;
        double D;

        D = 100123285.0;
        L = D;

        System.out.println("L and D: " + L + " " + D);
    }
}
