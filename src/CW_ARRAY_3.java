public class CW_ARRAY_3 {
    public static void main(String[] args) {

        //     FIND THE TOTAL NUMBER OF PAIRS IN THE ARRAY WHOSE SUM IS EQUAL TO THE GIVEN VALUE x

        int[] ark = {4,6,3,5,8,2};

        pairSum(ark,7);          // 3


        //    FIND THE Triplet WHOSE SUM IS EQUAL TO THE GIVEN VALUE x (=12)

        int[] a = {1,4,5,6,3};

//        tripletSum(a,12);         //   wrong aaa raha hai

        //    FIND THE UNIQUE NUMBER IN AN ARRAY WHERE ALL ELEMENTS ARE BEING REPEATED TWICE WITH ONE VALUE UNIQUE

        int[] b = {1,2,3,4,3,2,1};         // 4 is unique


//        System.out.println(uniqueNum(b));          //    GALAT


        //     FINDING  THE MAXIMUM VALUE INSIDE AND ARRAY (using Integer.MIN_VALUE;)

        int[] c = {1,2,3,4,3,2,1,77};

        System.out.println(findMax(b));                        // 77 (working right)



        //      FIND THE SECOND LARGEST ELEMENT IN THE ARRAY                         ARRAY MANIPULATION

        /*

        * FIND MAXIMUM
        * MARK ALL MAXIMUM AS -infinity
        * FIND MAXIMUM

        */
        int[] d = {7,33,1,8,2};

        System.out.println(secondMax(d));                 // NOW IT WORKS


        //    GIVEN AN ARRAY OF INTEGERS. RETURN THE FIRST VALUE THAT IS REPEATING IN THIS ARRAY. IF NO VALUE IS REPEATED THEN RETURN -1

        //     WHEN WE NEED TO SEARCH THE ARRAY TWICE FOR WHILE FIXING ONE POSITION USE NESTED FOR LOOPS (TELL THE FIRST ELEMENT THAT IS REPEATED)

        int[] e = {2,0,1,7,7,7,3};

        returnFirstRepeatedValue(e);
        System.out.println(returnFirstRepeatedValue(e));















    }







    static int pairSum(int[] arr, int target){
        int n = arr.length;
        int ans=0;

        for (int i=0; i<n; i++){           // first number
            for (int j =1; j<n; j++){       // second number
                if ( arr[i] + arr[j] == target ){
                    ans++;
                }
            }
        }
        System.out.println(ans);
        return ans;
    }

    static int tripletSum(int[] arr, int target){
        int n = arr.length;
        int ans=0;

        for (int i=0; i<n; i++){           // first number
            for (int j =1; j<n; j++){       // second number
                for (int k=2; k<n; k++){    // third number

                    if ( arr[i] + arr[j] + arr[k] == target ){
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
        return ans;
    }
    public static int uniqueNum(int[] arr) {
        int n = arr.length;
        int ans = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                } else {
                    arr[i] = ans;
                  // System.out.println(ans);
                }
            }
        }return ans;
    }

    public static int findMax(int[] arr){
        int mx = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            if (mx<arr[i]){
                mx = arr[i];
            }
        }
        return mx;
    }



    public static int secondMax(int[] arr){
        int max = findMax(arr);
        for (int i=0; i<arr.length; i++){
            if (arr[i]== max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMAX = findMax(arr);
        return secondMAX;
    }

    public static int returnFirstRepeatedValue(int[] arr){

        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[j]==arr[i]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
