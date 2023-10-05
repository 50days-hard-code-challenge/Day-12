class Solution {
    public int longestOnes(int[] arr, int k) {
        int max = 0;
        for(int i = 0; i < arr.length; i ++){
            int count = 0;
            int count1 = 0;
            for(int j = i; j < arr.length; j ++){
                if(arr[j] == 1){
                    count ++;
                }
                else if(arr[j] == 0 && count1 < k){
                    count1 ++;
                }
                else{
                    break;
                }
                
            }
            if(count + count1 > max){
                max = count + count1;
            }
        }
        return max;
    }
}
