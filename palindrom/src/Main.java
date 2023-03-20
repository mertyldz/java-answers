public class Main {
    public static boolean isPalindrom(int number) {
        int reverseNumber = 0, temp = number, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = lastNumber + (reverseNumber * 10);
            temp /= 10;
        }
        return number == reverseNumber;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(100));
    }
}