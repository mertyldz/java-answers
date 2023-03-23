import java.util.Arrays;

public class Main {
    static boolean isExist(int[] array, int i) {
        for (int num : array) {
            if (num == i) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] dizi = new int[]{10, 20, 20, 10, 10, 20, 5, 20};
        int[] exists = new int[dizi.length];
        int count = 0, indexNumber = 0;

        for (int i = 0; i < dizi.length; i++) {
            if (!isExist(exists, dizi[i])) {
                exists[indexNumber] = dizi[i];
                indexNumber++;
                for (int j = 0; j < dizi.length; j++) {
                    if (dizi[i] == dizi[j]) {
                        count++;
                    }
                }
                System.out.println(dizi[i] + " Sayısı " + count + " kere tekrar edildi.");
                count = 0;
            }
        }
    }
}


