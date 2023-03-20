public class Main {
    static void pattern(int number) {
        int tempNumber = number;


        while (tempNumber > 0) {
            System.out.print(tempNumber + " ");
            tempNumber -= 5;
        }

        while (tempNumber <= number) {
            System.out.print(tempNumber + " ");
            tempNumber += 5;
        }
    }

    public static void main(String[] args) {
        pattern(25);
    }
}