import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizi boyutunu giriniz : ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Dizinin elemanlarını giriniz : ");
        for (int i = 0; i < n; i++) {
            System.out.print(i+1 + ". Eleman : ");
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }
}