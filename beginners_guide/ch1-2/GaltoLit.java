/*
    Convert Gallons to Litres
    note: this is bad, does not consider significant figures. Could be a fun thing to go back and add later on.
*/

class GaltoLit{
    public static void main(String args[]){
        double gallons; //hold the number of gallons
        double litres; //hold the number of litres

        gallons = 10; //assign 10 as a starting value for gallons
        litres = gallons * 3.7854; //use a conversion factor of 3.7854

        //print out the converted number of litres

        System.out.println(gallons + " Gallons is " + litres + "litres");

    }
}
