// Demo the short-circuit ops.
// Formally called conditional-and and conditional-or


class SCops {
    public static void main(String args[]){
        int n, d;

        n = 10;
        d = 2;

        if(d != 0 && (n % d) == 0)
            System.out.println(d + " is a factor of " + n);

        d = 0; 
       
        // Will not be evaluated due to short-circuit logic
        if(d != 0 && (n % d) == 0)
            System.out.println(d + " is a factor of " + n);

        // Now we try without the short-circuit logic.
        // Should cause a divide by zero error

        if(d != 0 & (n % d) == 0)
            System.out.println(d + " is a factor of " + n);
    }
}
