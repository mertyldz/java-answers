public class Main {
    public static void main(String[] args) {
        String[][] bLetter = new String[7][4];
        for (int i = 0; i < bLetter.length; i++) {
            if (i % 3 == 0) {
                for (int j = 0; j < bLetter[i].length; j++) {
                    bLetter[i][j] = "*";
                }
            } else {
                for(int l = 0; l < bLetter[i].length; l++){
                    bLetter[i][l]=" ";
                }

                for (int k = 0; k < bLetter[i].length; k += 3) {
                    bLetter[i][k] = "*";
                }
            }
        }

        for(int i = 0; i<bLetter.length; i++){
            for(int j = 0; j<bLetter[i].length; j++){
                System.out.print(bLetter[i][j] + " ");
            }
            System.out.println();
        }
    }
}