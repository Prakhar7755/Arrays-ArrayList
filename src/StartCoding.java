import java.sql.SQLOutput;
import java.util.*;
public class StartCoding {
    public static void main(String[] args) {

        /*
         CREATING COLLECTIONS

        1) type SAFE = same type elements are added TO THE COLLECTION



        2) UnType SAFE = DIFFERENT TYPES OF ELEMENTS ARE ADDED TO THE COLLECTION
         */

        ArrayList<String> names = new ArrayList<>();
        names.add("Prakhar");
        names.add("Ritesh");
        names.add("HEMA-REKHA-JAYA-SUSHMA");
//      names.add(33);                                    // java: incompatible types


        System.out.println(names);            // [Prakhar, Ritesh, HEMA-REKHA-JAYA-SUSHMA]
        System.out.println(names.get(2));     // HEMA-REKHA-JAYA-SUSHMA


        // un type

        LinkedList list = new LinkedList();

        list.add(4);
        list.add('a');
        list.add(true);
        list.add(5.88);
        list.add("String");

        System.out.println(list);             //  [4, a, true, 5.88, String]





        //            .remove(Object/Index);

        //            .size();                         NO. OF ELEMENT

        //            .contains();

        //            .equals();

        //            .isEmpty();

        //            .clear();

        //            .remove();

        //            .replace();

        //            .set( int Index, Object o );

        Vector<String> vector = new Vector<>();

        vector.addAll(names);                                //      .addAll();

        System.out.println(vector);                          //  [Prakhar, Ritesh, HEMA-REKHA-JAYA-SUSHMA]



    }
}
