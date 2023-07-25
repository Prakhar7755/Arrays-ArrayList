//   import java.util.Scanner;

public class Array_2 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        Scanner sc = new Scanner(System.in);

       int[] arrak;

       arrak = new int[5];

       arrak[0] = 10;
       arrak[1] = 20;
       arrak[2] = 30;
       arrak[3] = 40;
       arrak[4] = 50;

        System.out.println(arrak.clone());

        int[][] arr = { { 2, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 } };

        for (int i =0; i < arr.length; i++){
            for (int j =0; j < arr.length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
//        2 7 9
//        3 6 1                                               OUTPUT OF ABOVE ONE
//        7 4 2







    }
}
