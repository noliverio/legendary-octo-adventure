/*
    Convert weight on the Earth to weight on the Moon
    Assume a conversion factor of 1 earth pound = .17 moon pounds
*/

class EarthToMoon{
    public static void main(String args[]){
        double earth_weight, moon_weight, conversion;
        conversion = .17;
        earth_weight = 350;
        moon_weight = earth_weight * conversion;

        System.out.println("If you weigh " + earth_weight + " lbs on earth"
        + " you would weigh " + moon_weight + "lbs on the moon");
    }
}
