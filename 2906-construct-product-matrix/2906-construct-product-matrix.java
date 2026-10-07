class Solution {
    public int[][] constructProductMatrix(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int [][]ans = new int [n][m];

        long prod = 1;

        // Prefix product
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                ans[i][j] = (int) prod;

                prod = (prod * grid[i][j]) % 12345;
            }
        }

        prod = 1;

        // Suffix product
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {

                ans[i][j] = (int) ((ans[i][j] * prod) % 12345);

                prod = (prod * grid[i][j]) % 12345;
            }
        }

        return ans;

    }
}

