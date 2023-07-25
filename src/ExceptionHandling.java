import java.util.*;

//public class Main{
//    public static void main(String[] args){
//        System.out.println("STARTED");
//        Scanner sc = new Scanner(System.in);
//
//        int n1 = sc.nextInt();
//        int n2 = sc.nextInt();
//        double result = n1/n2;
//        System.out.println("Division Result "+result);
//        System.out.println("ENDED");
//    }
//}
public class ExceptionHandling {
    public static void main(String[] args){
        System.out.println("STARTED");
        Scanner sc = new Scanner(System.in);

        //  WAY OF HANDLING TRY AND CATCH FOR EXCEPTION

        try {                                      // Use this TRY for error prone statements
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            System.out.println("WE HAVE GOT 2 NUMBER");
            double result = (double) n1 /n2;
            System.out.println("Division Result "+result);

            System.out.println("ENDED");

        }
//        catch (ArithmeticException e){
//            System.out.println("n2 CAN NOT BE 0 !!");
//            System.out.println(e.getMessage());                // Division Result Infinity
// //         System.out.println(e);                       // java.lang.ArithmeticException: / by zero
//        }
//        catch (NumberFormatException e){
//            System.out.println("Invalid number!!");
//            System.out.println(e.getMessage());
//        }
//        catch (InputMismatchException e){
//            System.out.println("INVALID INPUT");
//            System.out.println(e.getMessage());             // null
//            System.out.println(e);                        //java.util.InputMismatchException
//        }




        //                       ONE BLOCK FOR ALL EXCEPTION


        catch (Exception e){
            System.out.println("ERROR!!");
            System.out.println(e.getMessage());              //         ##BEST
        }



        finally                    // FINALLY BLOCK
        {
            // always get executed Irrespective of TRY-CATCH

            System.out.println("I AM IN FINALLY BLOCK");
        }

    }
}
// HOW TO CREATE CUSTOM EXCEPTION
class AgeInvalidException extends Exception {
    AgeInvalidException() {
        super(
                "AGE IS INVALID"
        );
    }

    AgeInvalidException(String message) {
        super(message);
    }


}