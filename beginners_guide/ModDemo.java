// Demo the mod operator in Java

class ModDemo{
    public static void main(String args[]){
        int iresult, irem;
        double dresult,drem;

        iresult = 10/3;
        irem = 10 % 3;
        dresult = 10.0/3.0;
        drem = 10.0 % 3.0;

        System.out.println("Remainder and result in int: "+ irem + " " + iresult);
        System.out.println("Remainder and result in double: "+ drem + " " + dresult);

        // Looks like int division works as expected.
        // Mod works on doubles, just spits out mod as double. 
    }
}
