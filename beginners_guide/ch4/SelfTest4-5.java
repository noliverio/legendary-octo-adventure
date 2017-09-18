// Show how a method called myMeth( ) is declared if it has a return type of double and has two int parameters called a and b.

class MyClass{
    double myMeth(int a, int b){
        return (double) a/b;
    }
}

class MyTest{
    public static void main(String args[]){
       MyClass cls = new MyClass();
       
       System.out.println(cls.myMeth(2,3)); 
    }
}
