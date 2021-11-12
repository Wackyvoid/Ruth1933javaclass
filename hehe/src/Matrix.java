public class Matrix {
    private int nrows;
    private int ncols;
    private int [] [] matrix;

    public Matrix(int nrows, int ncols){
        this.nrows = nrows;
        this.ncols = ncols;
        this.matrix = new int[nrows][ncols];
    }

    public Matrix(int[][] arr){
        this.matrix = arr;
        this.nrows = arr.length;
        this.ncols = arr[0].length;
    }

    public Matrix transpose(){
        Matrix newm = new Matrix(ncols, nrows);
        for(int i = 0; i<ncols; i++){
            for(int j = 0; j< nrows; j++){
                newm.matrix[i][j] = matrix[j][i];
            }
        }
        return newm;
    }

    public String toString(){
        String s = "";
        for(int i = 0; i<nrows; i++){
            s+= "\n";
            for( int j = 0; j<ncols; j++){
                s += matrix[i][j] + ", ";
            }
        }
        return s;
    }
    public static void main(String[] args){
        int [][] pie = {{1,2,3},{4,5,6}};
        Matrix easy = new Matrix(pie);
        System.out.println(easy);
        System.out.println(easy.transpose());
    }

}
