import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,b,c;

        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk Kenarın Uzunluğunu Giriniz : ");
        a = scanner.nextDouble();

        System.out.print("İkinci Kenarın Uzunluğunu Giriniz: ");
        b = scanner.nextDouble();

        double c2 = Math.pow(a,2) + Math.pow(b,2);
        System.out.println("2 Kenarın Uzunluklarının Kareleri Toplamı : "+c2);

        c = Math.sqrt(c2);
        System.out.println("Hipotenüs : " + c);
    }
}