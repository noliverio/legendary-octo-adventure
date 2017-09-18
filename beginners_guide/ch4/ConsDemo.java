// A simple constructor.
// looks like __init__() in python

class MyClass{
    int x;
    
    // name a method the same as the class to create a constructor.
    MyClass() {
        x = 10;
    }
}

class ConsDemo {
    public static void main(String args[]){
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass();

        System.out.println(t1.x + " " + t2.x);
    }
}
