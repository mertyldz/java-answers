import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, levelCounter = 0, basamakToplam = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        number = scanner.nextInt();

        while (number % 10 != 0) {
            basamakToplam += (number % 10);
            number /= 10;
        }
        System.out.println(basamakToplam);

    }
}