// Define a constructor for Vehicle

class Vehicle{
    int passengers; // number of passengers
    int fuelcap;    // fuel capacity in gallons
    int mpg;        // fuel consumption in miles per gallon

    // I am  wondering if the important part is the name, not defining a return value or both
    // Adding type void seems to make it so it's not a constructor anymore.
    // Also break (differently) when method name != class name asks for type.
    xxxVehicle (int p, int f, int m){
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Return the range
    int range() {
        return mpg * fuelcap;
    }

    // Compute Fuel needed for a given distance
    double fuelneeded(int miles){
        return (double) miles / mpg;
    }
}

class VehConsDemo{
    public static void main(String args[]){
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportscar = new Vehicle(2, 14, 12);

        double gallons;
        int dist = 252;


/* 
        This code block is now taken care of by the constructor
        //assign valuse to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //assign valuse to fields in sportscar 
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;   */

        gallons = minivan.fuelneeded(dist);

        System.out.println("To go " + dist + " miles, minivan needs " + gallons 
        + " gallons of fuel." );

        gallons = sportscar.fuelneeded(dist);

        System.out.println("To go " + dist + " miles, sportscar needs " + gallons 
        + " gallons of fuel." );
    }
}
