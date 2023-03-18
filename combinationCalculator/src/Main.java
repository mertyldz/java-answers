import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total1 = 1, total2 = 1, total3 = 1, number1, number2, number3, combination;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Hangi sayının kombinasyonunun hesaplanacağını giriniz : ");
        number1 = scanner.nextInt();

        System.out.print(number1 + " sayısının kaçıncı kombinasyonunun hesaplanacağını giriniz : ");
        number2 = scanner.nextInt();

        number3 = number1 - number2;

        for (int i = 1; i <= number1; i++) {
            total1 *= i;
        }

        for (int i = 1; i <= number2; i++) {
            total2 *= i;
        }

        for (int i = 1; i <= number3; i++) {
            total3 *= i;
        }

        if (number2 == 0) {
            System.out.println(number1 + " sayısının " + number2 + ". kombinasyonu : 1");
        } else {
            combination = total1 / (total2 * total3);
            System.out.println(number1 + " sayısının " + number2 + ". kombinasyonu : " + combination);
        }
    }
}