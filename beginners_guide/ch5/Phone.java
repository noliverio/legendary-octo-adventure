// Very simple telephone directory

class Phone {
    public static void main(String args[]){
        String numbers[][] = {
            {"Tom", "555-1234"},
            {"Mary", "555-5432"},
            {"Jon", "555-6789"},
            {"Rachel", "555-5555"}
        };
        int i;

        if (args.length != 1)
            System.out.println("Usage: java Phone <name>");
        else{
            for(i=0; i<numbers.length; i++){
                if(numbers[i][0].equals(args[0])){
                    System.out.println(numbers[i][0] + ": " + numbers[i][1]);
                    break;
                }
            }
            if(i == numbers.length)
                System.out.println("Name not found.");
        }
    }
}
