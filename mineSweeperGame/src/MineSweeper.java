import java.util.Scanner;

public class MineSweeper {
    int rowNumber;
    int colNumber;
    int mineCounter = 0;
    String[][] gameMatris;
    String[][] mineMatris;


    public MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
    }

    public void show(String[][] matris) {
        for (String[] row : matris) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public void inplaceMine(String[][] mineMatris) {

        // Her zaman doğru sayıda mayın üretmiyor, fixle.
        int mineCount = (this.rowNumber * this.colNumber) / 4;
        int minePlaced = 1;
        for (int i = 0; i < this.mineMatris.length; i++) {
            for (int j = 0; j < this.mineMatris[i].length; j++) {
                mineMatris[i][j] = "-";
            }
        }

        while (minePlaced <= mineCount) {
            mineMatris[(int) (Math.random() * (this.rowNumber - 1))][(int) (Math.random() * (this.colNumber - 1))] = "*";
            minePlaced++;
        }
    }

    public void run() {
        this.gameMatris = new String[this.rowNumber][this.colNumber];
        this.mineMatris = new String[this.rowNumber][this.colNumber];

        for (int i = 0; i < this.gameMatris.length; i++) {
            for (int j = 0; j < this.gameMatris[i].length; j++) {
                this.gameMatris[i][j] = "-";
            }
        }
        inplaceMine(mineMatris);
        show(mineMatris);
        playGame();

    }

    public void playGame() {
        int playerRow, playerCol, roundCounter = 0;
        int minePlaced = getMineCounter(mineMatris);

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Satır numarasını giriniz : ");
            playerRow = scanner.nextInt();
            System.out.print("Sütun numarasını giriniz : ");
            playerCol = scanner.nextInt();

            if ((playerRow >= 0) && (playerRow <= rowNumber - 1) && (playerCol >= 0) && (playerCol <= colNumber - 1)) {

                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {

                        if (playerRow + i >= 0 && playerRow + i <= (this.rowNumber - 1) && playerCol + j >= 0 && playerCol + j <= (this.colNumber - 1)) {
                            if (mineMatris[playerRow + i][playerCol + j].equals("*")) {
                                mineCounter++;
                            }
                            String mineCounterString = Integer.toString(mineCounter);
                            gameMatris[playerRow][playerCol] = mineCounterString;
                        }
                    }
                }
                mineCounter = 0;
                roundCounter++;
                show(gameMatris);
                System.out.println("Mayın sayısı :" + minePlaced);
                System.out.println("Round sayısı : " + roundCounter);

                if (isWin(mineMatris, minePlaced, roundCounter)) {
                    System.out.println("Tebrikler ! Kazandınız.");
                    break;
                }
            } else {
                System.out.println("Yanlış değer girdiniz!");
            }
        } while (!mineMatris[playerRow][playerCol].equals("*"));


        if (mineMatris[playerRow][playerCol].equals("*")) {
            mineMatris[playerRow][playerCol] = "*";
            System.out.println("----Game Over!!!-----");
            show(mineMatris);
        }
    }

    public boolean isWin(String[][] arr, int mineCount, int roundCounter) {
        if (arr.length * arr[0].length - mineCount == roundCounter) {
            return true;
        }
        return false;
    }

    public int getMineCounter(String[][] arr) {
        int mineCount = 0;
        for (String[] rows : arr) {
            for (String col : rows) {
                if (col.equals("*")) {
                    mineCount++;
                }
            }
        }
        return mineCount;
    }
}

