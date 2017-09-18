// Using two separate statements, show how to declare an object called counter of a class called MyCounter.

class MyCounter{
    int count;

    MyCounter(int count){
        this.count = count;
    }

    public static void main(String args[]){
        MyCounter counter;
        counter = new MyCounter(1);

        while(counter.count <= 10){
            System.out.println(counter.count);
            counter.count ++;
        }
    }
}
