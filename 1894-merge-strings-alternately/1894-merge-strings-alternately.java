class Solution {
    public String mergeAlternately(String word1, String word2) {
        char ch[]=word1.toCharArray();
        char ch2[]=word2.toCharArray();
        int l1=word1.length();
        int l2=word2.length();
        StringBuilder res =new StringBuilder(l1+l2);
        int i=0,j=0;
        while(i<l1 && j<l2)
        {
          res.append(ch[i]);
          i++;
          res.append(ch2[j]);
          j++;
        }
        while(i<l1)
        {
            res.append(ch[i]);
            i++;
        }
        while(j<l2)
        {
            res.append(ch2[j]);
            j++;
        }
        return res.toString();
    }
}