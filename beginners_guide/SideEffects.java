// Demo side effects.

class SideEffects{
    public static void main(String args[]){
        int i;

        i = 0;

        /*
         * Here, i is still incremented
         * even though the if statement fails
         */
        
        if (false & (i++ < 100))
            System.out.println("this line will not run");
        System.out.println("if statement executed: " + i);

        /*
         * In this case, i is not incremented
         * because the short-curcuit operator skips right side
         */

        if (false && (i++ < 100))
            System.out.println("this line will not run");
        System.out.println("if statement executed: " + i);
    }
}

// Moral of this demo seems to be if you want a quick comparison
// use short-circuit logic use normal and/or if you want to do things
