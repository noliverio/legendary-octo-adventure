//A program that uses the Vehicle class

class Vehicle {
    int passengers; // number of passengers
    int fuelcap;    // max fule the vehicle can cary
    int mpg;        // fuel consumption in miles per gallon
}

class TwoVehicles{
    public static void main(String args[]){
        // instantiate a new object called minivan with class vehicle
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        int range1, range2;

        // assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;
        
        // assign values to fields in sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;


        // compute the range of minivan assuming a ful tank of gas
        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportscar.fuelcap * sportscar.mpg;
        System.out.println("Minivan can carry " + minivan.passengers + 
                           " and has a range of " + range1);

        System.out.println("Sportscar can carry " + sportscar.passengers + 
                           " and has a range of " + range2);
    }
}
