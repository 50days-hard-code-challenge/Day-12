class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0;i<n; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int temp : map.keySet()){
            if(map.get(temp) > n/3){
                ans.add(temp);
            }
        }
        return ans;
    }
}
