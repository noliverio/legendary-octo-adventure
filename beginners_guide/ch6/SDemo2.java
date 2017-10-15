// Use a static method.
// Call it w/o an object. Directly from class name

class StaticMethod{
    static int val = 1024;

    static int valDiv2(){
        return val/2;
    }
}

class SDemo2{
    public static void main(String args[]){
        System.out.println("val is " + StaticMethod.val);
        System.out.println("StaticMethod.valDiv2(): " + StaticMethod.valDiv2());

        StaticMethod.val = 4;
        System.out.println("val is " + StaticMethod.val);
        System.out.println("StaticMethod.valDiv2(): " + StaticMethod.valDiv2());

    }
}
