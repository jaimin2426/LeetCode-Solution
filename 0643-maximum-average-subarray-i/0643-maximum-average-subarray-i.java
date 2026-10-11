class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int right = k;
        double sum  = 0;

        for(int i=0;i<k;i++){
            sum += nums[i];
        }

        double ans = sum;


        while(right < nums.length){
            sum -= nums[left];
            sum += nums[right];
            ans = Math.max(ans,sum);
            left++;
            right++;

            
        }

        return ans / k;

    }

}