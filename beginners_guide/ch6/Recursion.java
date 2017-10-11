// A simple example of recursion in Java

class Factorial{
    
    // the factorial recursively
    int factR(int n){
       int result;
       if(n==1) return 1;
       result = factR(n-1) * n;
       return result ;
    }

    // same factorial computation iteratively
    int factI(int n){
        int result = 1;
        for( int i=1; i<=n; i++)
            result *= n;
        return result;
    }
}

class Recursion{
    public static void main(String args[]){
        Factorial f = new Factorial();

        System.out.println("Factorials using the recursive method.");
        System.out.println("Factorial of 3 is " + f.factR(3));
        System.out.println("Factorial of 4 is " + f.factR(4));
        System.out.println("Factorial of 5 is " + f.factR(5));

        System.out.println("Factorials using the iterative method.");
        System.out.println("Factorial of 3 is " + f.factI(3));
        System.out.println("Factorial of 4 is " + f.factI(4));
        System.out.println("Factorial of 5 is " + f.factI(5));
    }
}
