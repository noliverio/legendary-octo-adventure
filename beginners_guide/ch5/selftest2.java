//Show two ways to declare a one-dimensional array of 12 doubles.

class SelfTest2{
    public static void main(String args[]){
        int array[] = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        double ave;
        for(int x: array)
            sum += x;
        ave = sum / array.length;
        System.out.println("ave is " + ave);
    }
}
