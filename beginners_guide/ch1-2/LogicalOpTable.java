//Try This 2-2: Java logical operator truth table
// Edited for task 6 to display output in 1's and 0's
// Use 'value' as a 1 or 0 to print
// Used Ternary operator for simplicity
class LogicalOpTable{
    public static void main(String args[]){
        boolean p, q;
        int value;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT P");

        p = true; q = true;
        System.out.print((p ? 1 : 0 )  + "\t" + (q ? 1 : 0 ) + "\t");
        System.out.print(((p&q) ? 1 : 0) + "\t" + ((p|q) ? 1 : 0) + "\t");
        System.out.println(((p^q) ? 1 : 0) + "\t" + ((!p) ? 1 : 0));

        p = true; q = false; 
        System.out.print((p ? 1 : 0 )  + "\t" + (q ? 1 : 0 ) + "\t");
        System.out.print(((p&q) ? 1 : 0) + "\t" + ((p|q) ? 1 : 0) + "\t");
        System.out.println(((p^q) ? 1 : 0) + "\t" + ((!p) ? 1 : 0));

        p = false; q = true;
        System.out.print((p ? 1 : 0 )  + "\t" + (q ? 1 : 0 ) + "\t");
        System.out.print(((p&q) ? 1 : 0) + "\t" + ((p|q) ? 1 : 0) + "\t");
        System.out.println(((p^q) ? 1 : 0) + "\t" + ((!p) ? 1 : 0));
        
        p = false; q = false;
        System.out.print((p ? 1 : 0 )  + "\t" + (q ? 1 : 0 ) + "\t");
        System.out.print(((p&q) ? 1 : 0) + "\t" + ((p|q) ? 1 : 0) + "\t");
        System.out.println(((p^q) ? 1 : 0) + "\t" + ((!p) ? 1 : 0));
    }
}
