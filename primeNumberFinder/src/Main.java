import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numberRange;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hangi sayıya kadar asal sayılar bulunacak? : ");
        numberRange = scanner.nextInt();

        for (int i = 2; i < numberRange; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    continue;
                }
            }
        if (prime == true) System.out.print(i + " ");
        }
    }
}