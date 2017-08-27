// Demo Increment operators
// specifically in reguards to prefix and postfix forms

class DemoIncrement{
    public static void main(String args[]){
        int x, y;

        x = 10;
        y = x++;
        System.out.println("x is: " + x);
        System.out.println("y is: " + y);

        x = 10;
        y = ++x;
        System.out.println("x is: " + x);
        System.out.println("y is: " + y);
    }
}


/*

Output

x is: 11
y is: 10
x is: 11
y is: 11


This is garbage.
*/
