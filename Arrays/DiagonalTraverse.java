/*
Given an m x n matrix mat, return an array of all the elements of the array in a diagonal order.
Input: mat = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,4,7,5,3,6,8,9]

Example 2:

Input: mat = [[1,2],[3,4]]
Output: [1,2,3,4]

 

Constraints:

    m == mat.length
    n == mat[i].length
    1 <= m, n <= 104
    1 <= m * n <= 104
    -105 <= mat[i][j] <= 105


public int[] findDiagonalOrder(int[][] matrix) {
if (matrix == null || matrix.length == 0) return new int[0];

int row = 0, col = 0, pos = 0, m = matrix.length, n=matrix[0].length, output [] = new int[m * n];

for (pos = 0; pos < m * n; pos++) {
    output[pos] = matrix[row][col];

    if ((row + col) % 2 == 0) {
        // The direction is always up when the sum of row & col is even
        
        // For last column, go down
        if (col == n-1) { row++; }                
        
        // For first row & non-last columns, go right
        else if (row == 0) { col++; }
        
        // For not first row & non-last columns, go up and to the right
        else { row--; col++; }

    } else {
        // The direction is always down when the sum of row & col is odd

        // For last row, go right
        if (row == m-1) { col++; } 
        
        //  For non-last row & first column, go down
        else if (col == 0) { row++; }
        
        // For non-last row & non-first column, go down and to the left
        else { row++; col--; }
    }
}

*/
