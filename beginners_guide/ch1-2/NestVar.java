/*
    Demo what happens when I try to declare a variable in an inner scope
    with the same name as one defined in an outer scope.

    **** This program will not compile. ****
*/

class NestVar{
    public static void main(String args[]){
        int count; //count being declared in outer scope

        for (count = 0; count < 10; count++){
            System.out.println("The count is: " + count);

            int count; // try to declare count in an inner scope. Should fail to compile
            //fails with error: variable count is already defined in method main(String[]
            for (count = 0; count < 10; count ++){
                System.out.println("This should not compile");
            }
        }
    }
}
