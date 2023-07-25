import java.util.Arrays;

public class CW_ARRAY_2 {
    public static void main(String[] args) {

        // Q                    COUNT THE NUMBER OF OCCURRENCES OF A PARTICULAR ELEMENT X
        int[] ark = {5,1,2,3,5,2,6,6,3,5,5,5};
//
//        int count =0;
//        for (int i=0; i< ark.length; i++){
//            if (ark[i]==5){
//                count +=1;                                               //   WE CAN CREATE A WHOLE METHOD ALSO TO EASE OUR PROBLEM
//            } else if (i == ark.length) {
//                break;
//            }
//        }
//        System.out.println(count);

        // Q          FIND THE LAST OCCURRENCE OF AN ELEMENT x in A GIVEN ARRAY (tells the index)

        int num = 5;

        for(int i =0; i<ark.length; i++){
            if ( ark[i] == num ){
                System.out.println(i);
            }
        }
                                        //      FOR LAST INDEX ONLY

        int lastIndex=-1;  // INITIALIZE WITH -1

        for (int i=0; i<ark.length; i++){
            if (ark[i]==5){
                lastIndex = i;
            }
        }
        System.out.println(lastIndex);


        // Q              COUNT THE NUMBER OF ELEMENTS STRICTLY GREATER THAN VALUE x

        int[] test = {91,92,89,95,99,94,97,91};

        int numb =0;
        for (int i =0; i< test.length; i++){
            if (test[i]>94){         // check for 94 and greater
                numb+=1;
            }
        }
        System.out.println(numb);       // 3

        // Q                     CHECK IF THE GIVEN ARRAY IS SORTED OR NOT (we will use a method typed below)

        System.out.println("THE ELEMENT IS SORTED "+isSorted(ark));         // false         for ascending order


        // Q                   SORT THE ARRAY AND RETURN THE SMALLEST AND THE LARGEST VALUE INFORM OF AN ARRAY
        int[] a = {1,3,2,6,5,7,};
        smallestAndLargest(a);                         // [1, 2, 3, 5, 6, 7]
    }




    //                                  METHOD TO PRINT THE ARRAY
    public static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

    //                                  TELLS THE NUMBER OF ELEMENT
    public static int numberOfElement(int[] arr, int x) {
        int count = 0;
/*
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count += 1;
            } else if (i == arr.length-1) {
                break;
            }
        }
        System.out.println(count);

*/
        for (int i=0; i< arr.length; i++){
            if (arr[i] == x){
                count++;
            }
        }
        return count;
    }

    //                                CHECK IF THE ARRAY IS SORTED OR NOT
    static boolean isSorted(int[] arr){
        boolean check =true;
        for (int i =1 ; i<arr.length; i++){     // START THE ARRAY WITH i = 1
            if (arr[i]<arr[i-1]){
                // not sorted
                check = false;
                break;
            }
        }return check;
    }

    //
    public static void smallestAndLargest(int[] arr){
        Arrays.sort(arr);             // fuction to sort
        System.out.println(Arrays.toString(arr));

        //return arr;
    }

}
