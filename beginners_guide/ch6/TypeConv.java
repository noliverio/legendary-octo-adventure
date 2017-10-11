// Automatic type conversions affecting overloaded method resolution

class Overload2{
    void f(int x){
        System.out.println("Inside f(int): " + x);
    }

    void f(double x){
        System.out.println("Inside f(double): " + x);
    }
}

class TypeConv{
    public static void main(String args[]){
        Overload2 ob  = new Overload2();

        int i = 10;
        double d = 10.1;

        byte b = 99;
        short s = 10;
        float f = 11.5F;
    
        // Call expected methods
        ob.f(i);
        ob.f(d);

        // Call f with type conversion
        ob.f(b);
        ob.f(s);
        ob.f(f);
    }
}
