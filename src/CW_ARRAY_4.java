public class CW_ARRAY_4 {
    public static void main(String[] args) {

        //      SWAP TWO INTEGERS a & b

        swap(3,69);                                                                      // WORKED

        //       GIVEN TWO INTEGERS a & b. Swap the 2 given integers using sum and difference

        swap2(3,7);                                                                      // WORKED

        //       REVERSING AN ARRAY CONSISTING INTEGER VALUE

        int[] a = {1,2,3,4,5};
        reverse(a);                                                                            // WORKED

        //        ROTATE THE GIVEN ARRAY by k STEPS WHERE K IS NON-NEGATIVE (K IS GREATER THAN N also)                               IMPORTANT RE-LEARN




        //        CHECK IF THE GIVEN NUMBER IS PRESENT IN THE ARRAY OR NOT (yes or no)                                               FREQUENCY ARRAY RE-LEARN


      //  875rEjvm-aVA:!N






    }
    static void swap (int a, int b){
        System.out.println("ORGINAL VALUES OF ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        int c=0;
        c=a;
        a=b;
        b=c;
        System.out.println("SWAPPED a = "+a);
        System.out.println("SWAPPED b = "+b);
    }
    static void swap2(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("SWAPPED a = "+a);
        System.out.println("SWAPPED b = "+b);
    }
    protected static void reverse(int[] arr){
        for (int i = arr.length-1; i>=0; i--){
            System.out.print(" "+arr[i]);
        }
    }
}
