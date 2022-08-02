class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int l = matrix.length;
        int arr[] = new int[l*l];
        int p=0;
        
        for(int i=0 ; i<matrix.length ; i++)
        {
            int min=matrix[i][0];
            for(int j=0 ; j<matrix[0].length ; j++){
                arr[p++]=matrix[i][j];
            }
            
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
}