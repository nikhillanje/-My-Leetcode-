class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int m = grid.length;
		int n = grid[0].length;

        while(k != 0){

          int last = grid[m-1][n-1];
		  int prev = grid[0][0];

		  for (int i = 0; i < m; i++) {
			  for (int j = 0; j <n; j++) {

				  if (i == 0 && j == 0){
				     continue;
				   }
				int temp = grid[i][j];
				grid[i][j] = prev;
				prev = temp;
			  }
		    }
		
		   grid[0][0] = last;

           k--;

        }

    List<List<Integer>> list = new ArrayList<>();

    for (int i = 0; i < grid.length; i++) {
        List<Integer> row = new ArrayList<>();

        for (int j = 0; j < grid[i].length; j++) {
          row.add(grid[i][j]);
        }

       list.add(row);
    }

    return list;
        
    }
}