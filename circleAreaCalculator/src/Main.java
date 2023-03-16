import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pi=3.14;
        int r, alfa;

        Scanner scanner = new Scanner(System.in);

        System.out.print("R değerini giriniz : ");
        r = scanner.nextInt();

        System.out.print("Alfa değerini giriniz : ");
        alfa = scanner.nextInt();

        double area = pi * (r*r) * alfa / 360;
        System.out.println("Dairenin alanı : " + area);

    }
}