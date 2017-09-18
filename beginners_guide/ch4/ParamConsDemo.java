// A parameterized constructor.

class MyClass{
    int x;
    
    // name a method the same as the class to create a constructor.
    MyClass(int i) {
        x = i;
    }
}

class ParamConsDemo {
    public static void main(String args[]){
        MyClass t1 = new MyClass(10);
        MyClass t2 = new MyClass(88);

        System.out.println(t1.x + " " + t2.x);
    }
}
