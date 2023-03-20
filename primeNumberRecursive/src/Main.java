public class Main {

/*    static boolean isPrime(int number) {
        boolean checkPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                checkPrime = false;
                break;
            }
        }
        return checkPrime;
    }*/

    static boolean isPrime(int number, int divider) {
        if (number <= 0) {
            return (number == 2) ? true : false;
        }
        if (number % divider == 0) {
            return false;
        }
        if (divider * divider > number){
            return true;
        }
        return isPrime(number, divider + 1);
    }

    static void primeChecker(int number) {
        if (isPrime(number, 2)) {
            System.out.println("Bu bir asal sayıdır !");
        } else {
            System.out.println("Bu bir asal sayı değildir !");
        }
    }

    public static void main(String[] args) {
        primeChecker(8);
    }
}