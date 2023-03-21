import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int enteredNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Girilen sayı : ");
        enteredNumber = scanner.nextInt();

        int negDiff = -778, posDiff = enteredNumber;



        for (int number : list) {
            if (enteredNumber - number > 0) {
                if (enteredNumber - number < enteredNumber) {
                    posDiff = enteredNumber - number;
                }
            }

            if (enteredNumber - number < 0) {
                if (enteredNumber - number > negDiff) {
                    negDiff = enteredNumber-number;
                }
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + (enteredNumber - posDiff));
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + (enteredNumber - negDiff));
    }
}