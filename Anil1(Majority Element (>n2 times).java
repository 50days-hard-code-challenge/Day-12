import java.util.*;
import java.util.HashMap;
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        // for(int i = 0; i<n; i++){
        //     int count = 0; 
        //      for(int j = 0; j<n; j++){
        //          if(nums[i] == nums[j]){
        //              count++;
        //          }
        //      }
        //      if(count>n/2){
        //          return nums[i];
        //      }

        // }
        // return -1;

        // Using HashMap
        //storing the elements with its occurnce
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i]+1));
            }
        }

        // Searching the majority element
       
    int majorityElement = 0;

    for (Map.Entry<Integer, Integer> temp : map.entrySet()) {
        Integer value = temp.getValue();
        if (value > (n/2)) {
            majorityElement = temp.getKey();
        }
    }

    return majorityElement;
    }
}
