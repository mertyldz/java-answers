import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double result = 0, constantHarmonic=1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Harmonik seri için bir N değeri tanımlayınız : ");
        int harmonicValue = scanner.nextInt();

        for (int i = 1; i<= harmonicValue; i++) {
            result += (constantHarmonic/i);
        }
        System.out.println("Sonuç : " + result);

    }
}