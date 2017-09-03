/*
    Compute the number of inches in 1 cubic mile
*/

class Inches{
    public static void main(String args[]){
        int cubic_inches;
        int inches_per_mile;

        inches_per_mile = 5280 * 12;

        cubic_inches = inches_per_mile * inches_per_mile * inches_per_mile; 

        System.out.println("There are " + cubic_inches + " cubic inches" +
                            " in one cubic mile");
        }
}
