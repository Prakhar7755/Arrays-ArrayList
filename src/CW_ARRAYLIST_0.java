import java.util.ArrayList;

public class CW_ARRAYLIST_0 {
    public static void main(String[] args) {
        // Integer i = new Integer(9);
        
        Integer i = Integer.valueOf(8);

        Float f = Float.valueOf(8);

        // ARRAYS WITH VARIABLE SIZE

        ArrayList<Integer> list = new ArrayList<>();

        // list.add(int index, obj o)

        // list.size();

        // list.get(); RETURNS THE ELEMENT YOU WANT

        // .add ( Integer e )
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list); // [1, 2, 3, 4]
        System.out.println(list.toString()); // [1, 2, 3, 4]

        // .get ( int index)

        System.out.println(list.get(3)); // 4

        // .remove ( index/obj )

        list.remove(2);
        list.remove(1);
        System.out.println(list); // [1, 4]

        // .set ( int index, Integer element)

        list.set(0, 5);
        System.out.println(list); // [5, 4]

        // .contains ( Object o )

        // .size ()
        System.out.println(list.size()); // 2

        System.out.println(list.toString()); // [5, 4]
        System.out.println(list); // [5, 4]
        System.out.println("END");
    }
}
