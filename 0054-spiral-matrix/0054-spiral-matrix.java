class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res =new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        int rowBegin = 0,colBegin = 0;
        int rowEnd = row-1,colEnd = col-1;

        while(rowBegin <= rowEnd && colBegin <= colEnd)
        {
            //traverse right
            for(int i=colBegin;i<=colEnd;i++)
            {
                res.add(matrix[rowBegin][i]);
            }
            rowBegin++;
            
            //traverse down
            for(int i=rowBegin;i<=rowEnd;i++)
            {
                res.add(matrix[i][colEnd]);
            }
            colEnd--;

            //traverse left
            if(rowBegin<=rowEnd){
            for(int i=colEnd;i>=colBegin;i--)
            {
                res.add(matrix[rowEnd][i]);
            }
            }
            rowEnd--;

            //traverse up
            if(colBegin<=colEnd){
            for(int i=rowEnd;i>=rowBegin;i--)
            {
                res.add(matrix[i][colBegin]);
            }
            }
            colBegin++;
        }
        return res;
    }
}