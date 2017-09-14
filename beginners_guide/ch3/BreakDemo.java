//Using break to exit a loop.

class BreakDemo{
    public static void main(String args[]){
        int num;

        num = 100;

        // loop while i^2 is less than num
        for (int i=0; i<num; i++){
            if (i*i >= num ) break; //terminate loop it i^2 is >= 100
            System.out.print(i + " ");
        }
    }
}
