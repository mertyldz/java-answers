import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double math, phy, chem, tur, hist, music;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz : ");
        math = scanner.nextDouble();

        System.out.print("Fizik notunuzu giriniz : ");
        phy = scanner.nextDouble();

        System.out.print("Kimya notunuzu giriniz : ");
        chem = scanner.nextDouble();

        System.out.print("Türkçe notunuzu giriniz : ");
        tur = scanner.nextDouble();

        System.out.print("Tarih notunuzu giriniz : ");
        hist = scanner.nextDouble();

        System.out.print("Müzik notunuzu giriniz : ");
        music = scanner.nextDouble();

        double total = math+phy+chem+tur+hist+music;
        double average = total/6;

        System.out.println("Not ortalaması : "+average);

        String result = (average > 60) ? "Sınıfı geçti" : "Sınıfta kaldı";
        System.out.println(result);
    }
}