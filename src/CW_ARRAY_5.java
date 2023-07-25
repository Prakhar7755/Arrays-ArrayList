//                                         TWO POINTER APPROACH
import java.util.*;
public class CW_ARRAY_5 {
    public static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
    static void swap2(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
    }
//    static void sortZeroAndOnes(int[] arr){
//        int n = arr.length;
//        int zeroes =0;
//
//        //  COUNT NUMBER OF ZEROES
//        for (int i=0; i<n; i++){
//            if (arr[i]==0){
//                zeroes+=1;
//            }
//        }
//        // 0 TO ZEROES-1:0,  ZEROES TO n-1:1
//        for (int i=0; i<n; i++){
//            if (i<zeroes){
//                arr[i] = 0;
//            }
//            else {
//                arr[i] = 1;
//            }
//        }
//
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER ARRAY SIZE ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("ENTER " +n +" ELEMENTS");
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        printArray(arr);         //  [1, 0, 1, 0, 1, 0]



//       sortZeroAndOnes(arr);
//        printArray(arr);         //  [0, 0, 0, 1, 1, 1]
//


        //                                   BETTER APPROACH            (  BY SWAPPING FROM LEFT AND RIGHT )                        ALTERNATE METHOD TO SORT

sortZeroAndOnes(arr);






    }
    static void sortZeroAndOnes(int[] arr){
        int n= arr.length;
        int left=0, right =n-1;

        while (left<right){
            if (arr[left]== 1 && arr[right]==0){
                swap2( arr[left], arr[right] );
                left++;
                right--;
            }
            if ( arr[left] == 0 ){
                left++;
            }
            if (arr[right]==1) {
                right--;
            }
        }
        printArray(arr);
    }

}
