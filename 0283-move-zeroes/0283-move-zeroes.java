class Solution {
    public void moveZeroes(int[] nums) {
        int NonZeroIndex=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
               nums[NonZeroIndex]= nums[i];
               NonZeroIndex++;
            }
        }
        for(int i=NonZeroIndex;i<nums.length;i++)
        {
            nums[i]=0;
        }
    }
}