package Container_With_Most_Water;

import java.util.ArrayList;

public class containerWithMostWater {
    public static int storeWater(ArrayList<Integer> height){
        int maxWater = Integer.MIN_VALUE;
        //Brute Force - O(n^2)
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int ht = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int currWater = ht * width;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }
    public static int storeWater2(ArrayList<Integer> height){
        //2 Pointer Approach
        //Calculate Water Area
        int maxWater = Integer.MIN_VALUE;
        int i = 0;
        int j = height.size()-1;
        while(i<j){
            int ht = Math.min(height.get(i),height.get(j));
            int width = j - i;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);

            //Update Pointer
            if(i<j){
                i++;
            }
            else{
                j--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        //1, 8, 6, 2, 5, 4, 8, 3, 7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        // int ans = storeWater(height);
        int ans = storeWater2(height);
        System.out.println(ans);
    }
}
