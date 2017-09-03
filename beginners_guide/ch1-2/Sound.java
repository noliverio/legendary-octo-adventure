/*
    TryThis 2-1 How Far Away Is the Lightning

    assume that the speed of sound in air is 1100 ft/s
    detemine the distance away lightning is if it take 7.2 seconds to hear thunder after seeing lightning

class Sound{
    public static void main(String args[]){
        double distance, speed_of_sound, time_to_hear_thunder;

        speed_of_sound = 1100;
        time_to_hear_thunder = 7.2;
        distance = time_to_hear_thunder * speed_of_sound;

        System.out.println("The lightning is " + distance + " feet away"); 
    }
}

*/

/*
Make the same calculation, but assume that instead of listening to thunder we are listening for the echo of a clap against a large object.

The sound needs to go from you to the object then back.
*/

class Sound{
    public static void main(String args[]){
        double distance, speed_of_sound, time_to_hear_echo;

        speed_of_sound = 1100;
        time_to_hear_echo= 7.2;
        distance = time_to_hear_echo * speed_of_sound / 2;

        System.out.println("The object is " + distance + " feet away"); 
    }
}
