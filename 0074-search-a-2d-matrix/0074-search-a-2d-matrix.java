class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {   
    if(matrix.length==0 || matrix==null)
    return false;

    for(int i=0;i<matrix.length;i++)
    {
        if(binarySearch(matrix[i],target))return true;
    }
    return false;
    }
    private boolean binarySearch(int []arr,int tar)
    {
        if(arr.length==0 || arr==null)
        return false;

        int left=0;
        int right=arr.length-1;

        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]==tar)return true;
            else if(arr[mid]<tar)left=mid+1;
            else right=mid-1;
        }
        return false;
    }
}