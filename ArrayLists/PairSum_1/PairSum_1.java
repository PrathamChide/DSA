package PairSum_1;

import java.util.ArrayList;

public class PairSum_1 {
    public static void possiblePairs(ArrayList<Integer> list, int target){
        //Brute Force
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    System.out.println(list.get(i)+" "+list.get(j) );
                }               
            }
        }
    }
    public static void pairSum(ArrayList<Integer> list, int target){
        //2 Pointer Approach
        int i = 0;
        int j = list.size() - 1;
        while(i<j){
            if(list.get(i)+list.get(j)==target){
                System.out.println(list.get(i)+" "+list.get(j));
            }
            if(list.get(i)+list.get(j)<target){
                i++;
            }
            else{
                j--;
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        // possiblePairs(list, target);
        pairSum(list, target);
    }
}
