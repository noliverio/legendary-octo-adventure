/*
    Improved version of earlier GaltoLit program.

    This program to print gallon to litre conversion table.
*/

class GalToLitTable{
    public static void main(String args[]){
            //initialize variables

        double gallons, litres, conversion; 
        conversion = 3.7854;

        int counter;
        counter = 0;

        for(gallons = 1; gallons <= 100; gallons ++){
            litres = gallons * conversion;
            System.out.println(gallons + " Gallons is: " + litres + " Litres");
            counter ++;
            if (counter == 10){
                System.out.println();
                counter = 0;
            }
        }
    }
}
