//A program that uses the Vehicle class

class Vehicle {
    int passengers; // number of passengers
    int fuelcap;    // max fule the vehicle can cary
    int mpg;        // fuel consumption in miles per gallon
}

class VehicleDemo{
    public static void main(String args[]){
        // instantiate a new object called minivan with class vehicle
        Vehicle minivan = new Vehicle();
        int range;

        // assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // compute the range of minivan assuming a ful tank of gas
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Minivan can carry " + minivan.passengers + 
                           " and has a range of " + range);

    }
}
