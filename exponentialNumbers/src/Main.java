import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hangi sayının üssünün alınacağını giriniz : ");
        num1 = scanner.nextInt();

        System.out.print(num1 + " sayısının kaçıncı üssünün alınacağını giriniz : ");
        num2 = scanner.nextInt();

        int i = 1, total = 1;
        while (i <= num2) {
            total *= num1;
            i++;
        }
        System.out.println(total);
    }
}