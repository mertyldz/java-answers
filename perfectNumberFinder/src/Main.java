import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int totalDividers = 0, number;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        number = scanner.nextInt();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                totalDividers += i;
            }
        }

        if (totalDividers == number) {
            System.out.println(number + " Mükemmel sayıdır.");
        } else {
            System.out.println(number + " Mükemmel sayı değildir.");
        }
    }
}