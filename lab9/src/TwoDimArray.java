public class TwoDimArray {

    boolean isSymmetric(int[][] matrix) {
        int N = matrix[0].length;
        int M = matrix[1].length;
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}


// 3.1 Big O

//