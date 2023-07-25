import java.util.*;

public class CW_ARRAY_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//                           FIND THE TRIPLET IN THE ARRAY WHOSE SUM IS ZERO/FIVE

        int[] arr = {2,4,-1,3,0,-4,3};
        System.out.println(Arrays.toString(arr));                                           // [-4, -1, 0, 2, 3, 3, 4]
        int num;
        for (int i=0; i<arr.length; i++) {
            for (int j=1; j<arr.length; j++) {
                for (int k=2; k<arr.length; k++) {
                    if (arr[i]+arr[j]+arr[k]==5 && arr[i]!=arr[j] && arr[j]!=arr[k] && arr[i]!=arr[k]){
                        System.out.println(arr[i]+" " +arr[j]+" "+arr[k]);

                        break;
                    }
                }
            }
        }

//        FINDING THE TWO NUMBERS WHOSE SUM IS X
        Arrays.sort(arr);
     //   int[] ark = Arrays.copyOf(arr[]);



    }
    public static boolean twoSum(int[] a , int x){
       // boolean ans = false;
        int i=0, j= a.length-1;

        while (i<j){
            if (a[i]+a[j]>x){
                j--;
            }
                else if (a[i]+a[j]<x) {
                i++;
            }
                else {
                    return true;
                }
        }
        return false;
    }
}
