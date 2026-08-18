class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {

        int m = mat.length;
        int n = mat[0].length;

        int[][] ans = new int[m][n];

        // 2D Prefix Sum
        int[][] prefix = new int[m + 1][n + 1];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                prefix[i + 1][j + 1] =
                    mat[i][j]
                    + prefix[i][j + 1]
                    + prefix[i + 1][j]
                    - prefix[i][j];
            }
        }

        // Find block sum for every cell
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int r1 = Math.max(0, i - k);
                int c1 = Math.max(0, j - k);

                int r2 = Math.min(m - 1, i + k);
                int c2 = Math.min(n - 1, j + k);

                ans[i][j] =
                    prefix[r2 + 1][c2 + 1]
                    - prefix[r1][c2 + 1]
                    - prefix[r2 + 1][c1]
                    + prefix[r1][c1];
            }
        }

        return ans;
    }
}