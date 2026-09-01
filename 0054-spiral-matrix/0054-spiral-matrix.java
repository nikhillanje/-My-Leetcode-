class Solution {
    public List<Integer> spiralOrder(int[][] mat) {

        List<Integer> ar = new ArrayList<>();

        int sr = 0;
        int sc = 0;
        
        int er = mat.length-1;
        int ec = mat[0].length-1;
        
        while(sr <= er && sc <= ec){
            
            //top
            for(int j = sc ; j <=ec ; j++){
                ar.add(mat[sr][j]);
            }
            
            //right
            for(int i = sr+1 ; i <= er ; i++){
                ar.add(mat[i][ec]);
            }
            
            //down
            for(int j = ec-1 ; j >= sc ; j--){
                
                if(sr == er){
                    break;
                }
                ar.add(mat[er][j]);
            }
            
            for(int i = er-1 ; i > sr ; i--){
                
                if(sc == ec){
                    break;
                }
                
                ar.add(mat[i][sc]);
            }
            
            sc++;
            sr++;
            
            ec--;
            er--;

        }

        return ar;
        
    }
}