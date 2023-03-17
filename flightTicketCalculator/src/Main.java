import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int distance, age, flightType;
        double priceDiscount, priceDiscountRatio,priceTotal, priceFinal, price2Way,flightDiscount=0.2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafi km türünden giriniz : ");
        distance = scanner.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        age = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz :\n1 => Tek Yön\n2 => Gidiş-Dönüş\n");
        flightType = scanner.nextInt();

        if((distance>0) && (age>0) && (flightType>=1) && (flightType<=2)){
            priceTotal = distance * 0.1;

            if(age<12){
                priceDiscountRatio = 0.5;
            } else if (age < 24){
                priceDiscountRatio = 0.1;
            } else if (age > 65) {
                priceDiscountRatio = 0.3;
            } else {
                priceDiscountRatio = 0;
            }

            priceDiscount = priceTotal * priceDiscountRatio;

            switch (flightType){
                case 1:
                    priceFinal = priceTotal - priceDiscount;
                    System.out.println("Toplam tutar : " + priceFinal);
                    break;
                case 2:
                    price2Way = priceTotal - priceDiscount;
                    price2Way -= (price2Way * flightDiscount);
                    priceFinal = price2Way * 2;
                    System.out.println("Toplam tutar : " + priceFinal);
                    break;
            }
        } else{
            System.out.println("Hatalı veri girdiniz !");
        }


    }
}