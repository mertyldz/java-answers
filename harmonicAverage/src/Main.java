public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 100};
        double harmonicSeries = 0;

        for (int i = 0; i < numbers.length; i++) {
            harmonicSeries += 1.0/numbers[i];
        }

        System.out.println("Dizideki sayıların harmonik ortalaması : "+ numbers.length/harmonicSeries);

    }
}