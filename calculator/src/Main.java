import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz : ");
        n1 = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz : ");
        n2 = scanner.nextInt();

        System.out.println("Yapmak istediğiniz işlemi belirtiniz : \n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select = scanner.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam : " + (n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma : " + (n1-n2));
                break;
            case 3:
                System.out.println("Çarpma : " + (n1*n2));
                break;
            case 4:
                if (n2 != 0){
                    System.out.println("Bölme : " + (n1/n2));
                } else {
                    System.out.println("Sayı 0'a bölünemez!");
                }
                break;
            default:
                System.out.println("Hatalı işlem girdiniz");
        }
    }
}