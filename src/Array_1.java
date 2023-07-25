import java.util.*;
import static java.util.Arrays.*;

public class Array_1 {
    public static void main(String[] args) {
//        int[] marks = new int[4];
//        int[] numbers = {1,2,3,4};
//        String[] name = {"Green ", "orange"};
//
//        Scanner sc = new Scanner(System.in);
//
//        marks[0] = 55;
//        marks[1] = sc.nextInt();
//        marks[2] = sc.nextInt();
//        marks[3] = sc.nextInt();
//      //marks[4]  = 66;                                                  ArrayIndexOutOfBoundsException
//
//        System.out.println(Arrays.toString(marks));                     // [55, 3, 52, 66]
//        System.out.println(marks[2]);                                   //   66




        //               .length();

        //               .


        System.out.println(power(5,4));
        

    }
    static int power(int p, int q){
        int pow = 1;
        while (q>0){
            pow = pow*p;
            q--;
        }
        return pow;
    }
}
