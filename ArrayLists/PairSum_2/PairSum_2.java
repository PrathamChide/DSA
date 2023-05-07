package PairSum_2;

import java.util.ArrayList;

public class PairSum_2 {
    public static boolean pairSum(ArrayList<Integer> list,int target){
        //Find the pivot/breakpoint
        int pivot=0;
        for(int i=1;i<list.size();i++){
            if(list.get(i)<list.get(i-1)){
                pivot = i;
                break;
            }
        }
        int rp = pivot;
        int lp = pivot+1;
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if(list.get(lp)+list.get(rp)<target){
                lp = (lp+1)%list.size();
            }
            else{
                rp = (list.size()+rp-1)%list.size();
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        boolean ans = pairSum(list, target);
        System.out.println(ans);
    }
}
