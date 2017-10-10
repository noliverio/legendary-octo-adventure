// Demo Public vs private access.

class MyClass {
    private int alpha;
    public int beta;
    int gamma;

    /* Setter and Getter for alpha */

    void setAlpha(int a){
        alpha = a;
    }

    int getAlpha(){
        return alpha;
    }
}

class AccessDemo{
    public static void main(String args[]){
        MyClass ob = new MyClass();

        ob.setAlpha(-99);
        System.out.println("ob.alpha is " + ob.getAlpha());

        // cannnot access alpha directly from another class
//      ob.alpha = 10;
// Fails with error: alpha has private access in MyClass:wq

        ob.beta = 88;
        ob.gamma = 99;
    }
}
