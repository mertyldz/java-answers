import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double priceStart, priceMin, pricePerKm, travelledDistance, priceFinalCondition, priceFinal;
        priceStart=10;
        pricePerKm=2.2;
        priceMin=20;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kac Km Yol Gidildi? : ");
        travelledDistance=scanner.nextDouble();

        priceFinalCondition = priceStart + (travelledDistance * pricePerKm);
        priceFinal = (priceFinalCondition > 20) ? priceFinalCondition:20;

        System.out.println("Ödenmesi Gereken Tutar : " + priceFinal);
    }
}