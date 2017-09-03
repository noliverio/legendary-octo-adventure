// Demo unexpected promotion behavior
class PromDemo{
    public static void main(String args[]){
        byte b;
        int i;

        b = 10;
        i = b * b; //automatically evaluated to in so no cast needed

        b = 10;
        b = (byte) (b*b); // cast needed to assign int to a byte
//        b = (b*b); results in following error  
//  error: incompatible types: possible lossy conversion from int to byte


        System.out.println("i and b: " + i + " " + b);
    }
}
