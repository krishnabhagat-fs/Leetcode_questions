// We are using binary search to solve this problem
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int i = 0, j = matrix[0].length - 1;
            while (i < matrix.length && j >= 0) {
                    if (matrix[i][j] == target) {  //we are compairing the target with last column of row
                        return true;
                    } else if (matrix[i][j] > target) {//if found the number is less than target then must be lie this row
                        j--;
                    } else {//if the last elment is grater then the target change the row 
                        i++;
                    }
                }
            
            return false;
    }
}