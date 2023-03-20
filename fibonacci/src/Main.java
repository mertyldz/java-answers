import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int fibonacciRange;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç basamaklı bir fibonacci serisi oluşturmak isteniyor ? : ");
        fibonacciRange = scanner.nextInt();

        int[] fibonacci = new int[fibonacciRange];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i <= (fibonacciRange - 1); i++)
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];

        for (int fibo : fibonacci) {
            System.out.print(fibo + " ");
        }
    }
}