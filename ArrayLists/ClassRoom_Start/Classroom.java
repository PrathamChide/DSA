package ClassRoom_Start;
import java.util.ArrayList;
// import java.util.*;

public class Classroom{
    public static void main(String[] args) {
        //String | Boolean | Integer | Char | Float
        // Java Collection Framework
        // ClassName objectName = new Classroom();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
 
        //Add Operation O(1) -> Constant time
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list.size());

        //Print The arraylist
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

        // list.add(1, 9); // O(n) -->Linear time

        // System.out.println(list);

        // //Get Operation O(1)
        // int element = list.get(2);
        // System.out.println(element);

        // //Remove or Delete Operation O(n)
        // list.remove(2);
        // System.out.println(list);

        // //Set Element at index operation O(n)
        // list.set(2, 10);
        // System.out.println(list);

        // //Contains Element O(n)
        // System.out.println(list.contains(1)); //true
        // System.out.println(list.contains(11)); //false


    }
}