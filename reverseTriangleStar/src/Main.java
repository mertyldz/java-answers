import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nStar;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç satır yıldız çizileceğini giriniz : ");
        nStar = scanner.nextInt();

        for (int i = 1; i <= nStar; i++) {
            System.out.print(" ".repeat(i - 1));
            System.out.println("*".repeat(2 * nStar - (2 * i - 1)));
        }
    }
}