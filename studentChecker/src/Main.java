import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fiz, tur, kim, muz, total = 0;
        ArrayList<String> dersList = new ArrayList<String>();
        double avg;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz : ");
        mat = scanner.nextInt();

        System.out.print("Fizik notunu giriniz : ");
        fiz = scanner.nextInt();

        System.out.print("Türkçe notunu giriniz : ");
        tur = scanner.nextInt();

        System.out.print("Kimya notunu giriniz : ");
        kim = scanner.nextInt();

        System.out.print("Müzik notunu giriniz : ");
        muz = scanner.nextInt();

        if (mat >= 0 && mat <= 100) {
            total += mat;
            dersList.add("mat");
        }

        if (fiz >= 0 && mat <= 100) {
            total += fiz;
            dersList.add("fiz");
        }

        if (tur >= 0 && mat <= 100) {
            total += tur;
            dersList.add("tur");
        }

        if (kim >= 0 && mat <= 100) {
            total += kim;
            dersList.add("kim");
        }

        if (muz >= 0 && mat <= 100) {
            total += muz;
            dersList.add("muz");
        }

        avg = total / (dersList.size());
        System.out.println("Girilen geçerli not sayısı : "+ dersList.size());
        System.out.println("Ortalama : " + avg);
    }
}