import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total = 0, dividedCount = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                total += i;
                dividedCount++;
            }
        }
        System.out.println("Girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların nortalaması : " + (total / dividedCount));
    }
}