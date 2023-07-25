import java.util.*;

public class Generics {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();              // GENERIC
        list.add("ps annant");
//      list.add(646);     ERROR



        List anotherList = new ArrayList();                 // NON GENERIC
        anotherList.add(9);
        anotherList.add(14.5666);
        anotherList.add("GAMA");

        System.out.println(list);               //  [ps annant]
        System.out.println(anotherList);        //  [9, 14.5666, GAMA]





    }
}
