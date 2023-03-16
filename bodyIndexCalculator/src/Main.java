import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double height, index;
        int weight;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        height = scanner.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        weight = scanner.nextInt();

        index = weight / (height * height) ;
        System.out.print("Vücut kitle indeksiniz : " + index);
    }
}