// Improved Queue data structure
// This strictly enforces the fifo structure
// Try this 6-1

class Queue{
    private char q[]; // this array holds the queue
    private int putloc, getloc; // the put and get indices
    
    Queue(int size){
        q = new char[size]; // allocate memory for queue
        putloc = getloc = 0;
    }

    //put a character into the queue
    void put(char ch) {
        if(putloc==q.length){
            System.out.println(" - Queue is full.");
            return;
        }
        q[putloc++] = ch;
    }

    // get a character from the queue
    // return 0 if there is nothing in the queue
    char get(){
        if(getloc == putloc){
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }

        return q[getloc++];
    }

}

