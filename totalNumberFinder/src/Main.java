import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total = 0, number;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Lütfen bir sayı giriniz : ");
            number = scanner.nextInt();
            if (number % 4 == 0) {
                total += number;
            }
        } while (number >= 0);

        System.out.println("Toplam : " + total);
    }
}