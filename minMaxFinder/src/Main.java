import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numberCount=1, numberBiggest, numberSmallest;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz ? : ");
        numberCount = scanner.nextInt();

        int[] numbers = new int[numberCount];

        for (int i = 0; i<numbers.length; i++){
            System.out.print(i+1 + ". Sayıyı Giriniz : ");
            numbers[i] = scanner.nextInt();
        }

        numberSmallest = numbers[0];
        numberBiggest = numbers[0];


        for(int number:numbers){
            if (number > numberBiggest){
                numberBiggest=number;
            }

            if (number < numberSmallest){
                numberSmallest=number;
            }
        }
        System.out.println("En büyük sayı : " + numberBiggest);
        System.out.println("En küçük sayı : " + numberSmallest);
    }
}