public class Array_3 {
    public static void main(String[] args) {

 /*       ARRAY IS THE COLLECTION OF SIMILAR DATA TYPES
         access to an elemesnt is easy
         can also be used to implement other data types like linked list, stack , queue etc
         object is the super class of  the array
         memory is stored in heap
         fast speed
*/
/*
         DISADVANTAGE
         size is always fixed
         wastage ofc memory
         Store similar datatype only
         no methods present
*/

        int[] employee = new int[3];                    // size cant be given when declared  X int[3] a; X
        employee[0] = 11;
        employee[1] = 12;

        int[] a;                                // declare + creation
        a = new int[3];                         // memory allocation + size declaration

        // or
        int[] b =new int[4];                    // declaration and memory allocation

        int[] c =new int[0];                    // SIZE ZERO WILL COMPILE + RUN
//      int[] D =new int[-4];                   // EXCEPTION   NegativeArraySizeException

        //     INITIALIZATION OF THE ARRAY

        a[1] = 44;
        System.out.println(a[2]);               // 0

        int[] e = new int[]{1,23,4,56,7};












    }
}
