import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nStar;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kaç basamak yıldız oluşturulacağını giriniz : ");
        nStar = scanner.nextInt();


        for (int i = 1; i <= nStar; i++) {
            System.out.println(" ".repeat(nStar - i) + "*".repeat(i) + "*".repeat(i - 1));
        }

        for (int j = 1; j <= nStar-1; j++){
            System.out.println(" ".repeat(j) + "*".repeat(nStar-1-j) + "*"+ "*".repeat(nStar-1-j));
        }

    }
}