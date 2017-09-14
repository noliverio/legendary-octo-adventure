// Use nested loops to find factors of numbers between 2 and 100.
// improved to reduce number of times inner loop runs
// We know that no factor can be greater than half the size of the number
// so we only need to check the first half of all ints less than the number.

// Futher if we get to the square root of a number without finding a factor
// then we know that it is prime because no two number both larger than the root
// of a number that can be multiplied to get that number. 
//     ex no two number that are both larger than 10 can be multiplied to get 100
// thus we can stop looking for factors

class FindFac {
    public static void main(String args[]){
        for( int i=2; i<=100; i++){
            int hits = 0;
            System.out.print("Factors of " + i +": ");
            for(int j=2; j<=i/2; j++)
                if((i%j) == 0){
                     System.out.print(j + " ");
                     hits ++;
                }else if(hits == 0 && j > Math.sqrt(i)){
                    j = i;
                }
            System.out.println();
        }
    }
}
