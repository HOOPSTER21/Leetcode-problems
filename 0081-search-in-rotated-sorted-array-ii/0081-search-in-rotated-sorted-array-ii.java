class Solution {
    public boolean search(int[] nums, int target) {
        HashSet<Integer> hs =new HashSet<>();
        for(int val:nums)
        {
            hs.add(val);
        }

        return hs.contains(target);
        
    }
}