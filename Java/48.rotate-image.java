/*
 * [48] Rotate Image
 */

class Solution {
    public void rotate(int[][] matrix) {
        int r = matrix.length, c = r;
        int[][] rotMatrix = new int[r][c];
        for (int i = 0; i < c; i++) {
            for (int j = r-1, k = 0; j >= 0; j--) {
                rotMatrix[i][k] = matrix[j][i];
                k++;
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j]=rotMatrix[i][j];
            }
        }
    }
}