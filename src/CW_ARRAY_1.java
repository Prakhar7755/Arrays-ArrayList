import java.util.Arrays;
import java.util.Scanner;
public class CW_ARRAY_1 {
    //                         METHOD TO PRINT THE ARRAY AGAIN AND AGAIN
    public static void printArray(int[] arr){
      /*  for (int i=0; i< arr.length; i++){
            System.out.print(" "+ arr[i]);
        }*/
        System.out.println(Arrays.toString(arr));
    }

    //                                   CHANGE ARRAY METHOD
    public static void changeArrayToZero(int [] arr){
        for (int i =0; i<arr.length; i++){
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1,2,3,4,5};


        //                                  TAKING INPUT

//        int[] arr = new int[5];
//
//        System.out.println("ENTER ARRAY ELEMENT");
//
//                // INPUTTING
//
//        for (int i =0; i<arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
////      System.out.println(arr.toString());
//
//
//                // OUTPUTTING
//
//        for (int i =0; i<arr.length; i++){
//            System.out.print(" ");
//            System.out.print(arr[i]);
//        }




        //                             ARRAY REFERENCE IN JAVA

        int[] arr2 = arr;
/*
        for (int i = 0; i < arr2.length; i++){

            System.out.print(" "+arr2[i]);
        }
*/
        printArray(arr2);                                        // calling the printArray Method



        changeArrayToZero(arr);                                 // Nulling the Aray
        System.out.println(Arrays.toString(arr));


        //                      FUNCTION TO COPY THE ARRAY    ( Arrays.copyOf(arr, range) )

        int[] arr_2 = Arrays.copyOf(arr, arr.length);

        int[] arr_3 = Arrays.copyOfRange(arr, 1,3);


    }
}
