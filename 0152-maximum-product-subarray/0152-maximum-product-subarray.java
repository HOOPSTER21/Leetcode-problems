class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        if(n==0)return 0;
        
        int min=nums[0];
        int max=nums[0];
        int res=nums[0];
        
        for(int i=1;i<n;i++)
        { int temp=max;
            max=Math.max(nums[i],Math.max(temp*nums[i],min*nums[i]));
            min=Math.min(nums[i],Math.min(temp*nums[i],min*nums[i]));
            
            res=Math.max(res,max);
        }
        return res;
    }
}