import java.util.ArrayList;
import java.util.Collections;

public class CW_ARRAYLIST_1 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list); // [1, 2, 3, 4, 5]

        // REVERSING AN ARRAYLIST
        reverseList(list); // [5, 4, 3, 2, 1]

        // ANOTHER WAY USING COLLECTIONS.REVERSE();

        Collections.reverse(list);
        Collections.sort(list);
        Collections.addAll(list);
        // Collections.copy(list);
        // Collections.rotate(list);
        Collections.max(list);
        Collections.min(list);
        Collections.swap(list, 1, 4);

        // SORTING A LIST
        Collections.sort(list, Collections.reverseOrder()); // HERE WE PASSED A COMPARATOR ALSO
        System.out.println(list); // [5, 4, 3, 2, 1]

        // SORTING A list USING ABOVE METHOD USING ABOVE METHOD

    }

    static void reverseList(ArrayList<Integer> list) {
        int i = 0, j = list.size() - 1;
        while (i < j) {

            Integer c = Integer.valueOf(list.get(i)); // c = a
            list.set(i, list.get(j)); // a = b
            list.set(j, c); // b = c
            i++;
            j--;
            /*
             * int c = a;
             * a = b;
             * b = c;
             */
        }
        System.out.println(list);

    }
}
