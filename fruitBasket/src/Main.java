import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double priceArmut=2.14, priceElma=3.67, priceDomates=1.11, priceMuz=0.95, pricePatlican=5;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Armut kaç kilo? : ");
        int armut = scanner.nextInt();

        System.out.print("Elma kaç kilo? : ");
        int elma = scanner.nextInt();

        System.out.print("Domates kaç kilo? : ");
        int domates = scanner.nextInt();

        System.out.print("Muz kaç kilo? : ");
        int muz = scanner.nextInt();

        System.out.print("Patlıcan kaç kilo? : ");
        int patlican = scanner.nextInt();

        double priceTotal = priceArmut*armut + priceElma*elma + priceDomates*domates + priceMuz*muz + pricePatlican*patlican;
        System.out.println("Toplam Tutar : " + priceTotal);
    }
}