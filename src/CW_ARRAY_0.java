import java.util.Scanner;

public class CW_ARRAY_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[4];
        ages[0] = 3;

        int[] games = {1,2,3,4};

                                                             // PRINTING THE SUM OF AN ARRAY

        int a=0;
        for (int i=0; i <games.length; i++){
            a = a + games[i];
        }
        System.out.println(a);       // 10

                                                              // MAXIMUM VALUE OF AN ARRAY

        int[] gama = {1,2,3, 55, 882, 33};

        int b =0;
//        for (int i =0; i< gama.length; i++){
//            if (b < gama[i]) {
//                b = gama[i];
//            }
//        }
                                  //  OR
        for (int j : gama) {
            if (b < j) {
                b = j;
            }
        }
        System.out.println(b);       // 882


        int[] arr= {1,2,5,3, 55, 882, 33};

        int c = sc.nextInt();

       for (int i =0 ; i<arr.length; i++){
           if (c==arr[i]){
               System.out.println("THIS IS PRESEMT AND the index is "+i);
               break;
           } else if (i ==arr.length-1) {
               System.out.println("-1");
               break;
           }
       }




    }
}
