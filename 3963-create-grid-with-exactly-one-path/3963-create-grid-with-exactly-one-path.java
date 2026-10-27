class Solution {
    public String[] createGrid(int m, int n) {

        String ans[] = new String [m];

        String grid[][] = new String [m][n];

        for(int i = 0 ; i < m-1 ; i++){

            for(int j = 1; j < n ; j++){

                grid[i][j] = "#";


            }
        }

        for(int i = 0 ; i < m ; i++){

            for(int j = 0; j < n ; j++){

                if (grid[i][j] == null) {
                    grid[i][j] = ".";
                }


            }
        }

        for(int i = 0 ; i < m ; i++){

            StringBuilder sb = new StringBuilder();

            for(int j = 0; j < n ; j++){

                sb.append(grid[i][j]);

            }

            ans[i] = sb.toString();

            sb.setLength(0);

        }

        return ans;
        
    }
}