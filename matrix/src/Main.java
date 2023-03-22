import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[2][3];
        int[][] matrixT = new int[3][2];
        matrix[0][0] = 2;
        matrix[0][1] = 3;
        matrix[0][2] = 4;
        matrix[1][0] = 5;
        matrix[1][1] = 6;
        matrix[1][2] = 4;

        for(int i = 0; i < matrix.length; i++ ){
            for(int j = 0; j < matrix[i].length; j++){
                matrixT[j][i]=matrix[i][j];
            }
        }

        for(int[] rows:matrixT){
        System.out.println(Arrays.toString(rows));
        }

    }
}