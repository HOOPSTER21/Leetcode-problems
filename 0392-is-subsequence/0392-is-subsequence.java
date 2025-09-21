class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty())
        return true;
        if(t.isEmpty())
        return false;
        int l1=s.length(),l2=t.length();
        char c1[]=s.toCharArray();
        char c2[]=t.toCharArray();
        int i=0,j=0;
        while(i<l1 && j<l2)
        {
            if(c1[i]==c2[j]){ 
            i++;
            }
            j++;

            if(i==l1)
            return true;

        }
        return false;
    }
}