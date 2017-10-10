//Implement and demo a soft fail array

class SoftFailArray{
    private int a[]; // refrence to array
    private int errval; // value to return if get() fails
    public int length;

    public SoftFailArray(int size, int errv){
        a = new int[size];
        errval = errv;
        length = size;
    }

    // Return value at given index.
    public int get(int index){
        if(indexOK(index))return a[index];
        return errval;
    }

    // Put a value at an index. Return false on failure.
    public boolean put(int index, int val){
        if(indexOK(index)){
            a[index] = val;
            return true;
        }
        return false;
    }

    // Return true if index is within bouds.
    private boolean indexOK(int index){
        if(index >= 0 & index < length) return true;
        return false;
    }
}

class FSDemo {
    public static void main(String args[]){
        SoftFailArray sf = new SoftFailArray(5,-1);
        int x;

        // show quiet failures
        System.out.println("Fail quitely.");
        for(int i=0; i<(sf.length*2); i++)
            sf.put(i, i*10);

        for(int i=0; i<(sf.length*2); i++){
            x = sf.get(i);
            if (x!=-1)System.out.print(x + " ");
        }
        System.out.println("");

        // now handle failures

        System.out.println("\nFail with error reports");
        for(int i=0; i<(sf.length*2); i++)
            if(!sf.put(i, i*10))
                System.out.println("Index " + i + " is out of range");

        for(int i=0; i<(sf.length*2); i++){
            x = sf.get(i);
            if(x!=-1) System.out.print(x + " ");
            else System.out.println("Index " + i + " is out of range");
        }
    }
}
