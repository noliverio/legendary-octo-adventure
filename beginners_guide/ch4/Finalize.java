// Try to demo garbage collection with finalize 
// Try this 4-2

class FDemo{
    int x;
    
    FDemo(int i){
        x = i;
    }
    // called when object is recycled
    protected void finalize(){
        System.out.println("Finalizing " + x);
    }

    // generates an FDemo object that is immediately destroyed
    void generator(int i){
        FDemo o = new FDemo(i);
    }
}

class Finalize {
    public static void main(String args[]){
        int count;
        FDemo ob = new FDemo(0);

        /*
            Now generate a large number of objects that immediately fall out of use.
            At some point in the process, garbage collection will occur. 
        */

        for (count=1; count < 10000000; count ++)
            ob.generator(count);

        // I get finalizing messages after this line.
        // Should I think that this is being printed while garbage collection is running?
        // Or is one last object being killed off after this print statement?
        System.out.println("Done with this run");
    }
}
