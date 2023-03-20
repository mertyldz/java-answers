import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ebob = 1, n1, n2, i = 1, j = 1, ekok = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz : ");
        n1 = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz : ");
        n2 = scanner.nextInt();

        // n1'i büyük sayıya çevirme işlemi
        if (n1 < n2) {
            int n3 = n1;
            n1 = n2;
            n2 = n3;
        }

        while (i < n2) {
            if ((n1 % i == 0) && (n2 % i == 0)) {
                ebob = i;
            }
            i++;
        }
        System.out.println("Ebob : " + ebob);

        
        while (j <= n1 * n2) {
            if (j % n1 == 0 && j % n2 == 0) {
                ekok = j;
                break;
            }
            j++;
        }
        System.out.println("Ekok : " + ekok);
    }
}