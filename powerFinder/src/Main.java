import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz : ");
        number = scanner.nextInt();

        for (int i = 1, j = 1; i <= number && j <= number; i *= 4, j *= 5) {
            System.out.println("4'ün katları : " + i);
            System.out.println("5'in katları : " + j);
        }
    }
}