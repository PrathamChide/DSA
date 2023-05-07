package Find_Maximum_In_An_ArrayList;

import java.util.ArrayList;

public class findMax {
    //list = 2,5,9,3,6
    //max = -infinity Integer.MIN_VALUE
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            // if(list.get(i)>max){  //O(n)
            //     max = list.get(i);
            // }
            max = Math.max(max, list.get(i));
        }
        System.out.println(max);
    }
}
