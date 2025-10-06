class Solution {
    public boolean search(int[] nums, int target) {
        HashSet<Integer> hs =new HashSet<>();
        for(int val:nums)
        {
            hs.add(val);
        }

        for(int num:hs)
        {
            if(num==target)
            return true;
        }
        return false;
        
    }
}