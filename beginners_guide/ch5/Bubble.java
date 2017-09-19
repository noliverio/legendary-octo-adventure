// Bubble sort
// Try this 5-1

class Bubble{
    public static void main(String args[]){
       int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 278, 49};
       int a, b, t;
       int size;
       
       size = 10; // number of elements to sort
       
       // display original array
       System.out.println("Original array is");
       for(int i=0; i<size; i++)
           System.out.print(" " + nums[i]);
       System.out.println();
       
       
      // Bubble sort.
      for(a=1; a<size; a++)
        for(b=size-1; b>=a; b--){
            if(nums[b-1]>nums[b]){
                // if out of order, exchange elsements
                // Can I use something like python's tuple unpacking to do this all at once?
                t = nums[b-1];
                nums[b-1] = nums[b];
                nums[b] = t;
// this fails to compile
//                nums[b], nums[b-1] = nums[b-1], nums[b];
// this does the assignments as two sepate in sequence steps.
//                nums[b]=nums[b-1];nums[b-1]=nums[b];
            }
        }
      
      // display sorted array  
      System.out.println("Sorted array is");
      for(int i=0; i<size; i++)
          System.out.print(" " + nums[i]);
      System.out.println();
    }
}
