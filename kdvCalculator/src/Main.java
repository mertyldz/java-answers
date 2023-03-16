import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ürün Fiyatını Giriniz : ");
        double price =scanner.nextDouble();

        double kdvRatio = (price <= 1000) ? 18:8;
        System.out.println("KDV Oranı : "+kdvRatio);

        double newPrice = price + (price*kdvRatio/100);
        System.out.println("KDV Dahil Ürün Fiyatı : "+newPrice);
    }
}