class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;

        int ans[][] = new int [m][n];

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){

                if(matrix[i][j] != -1){
                    ans[i][j] = matrix[i][j];
                }
                else{

                    int max = Integer.MIN_VALUE;

                    for(int k = 0 ; k < m ; k++){

                        int ele = matrix[k][j];

                        max = Math.max(max,ele);
                    }

                    ans[i][j] = max;

                }
            }
        }

        return ans;

    }
}