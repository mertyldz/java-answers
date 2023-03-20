public class Main {
    static int exponential(int baseNumber, int upperNumber){
        if(upperNumber==0){
            return 1;
        }

        return baseNumber * exponential(baseNumber, upperNumber-1);
    }
    public static void main(String[] args) {
        System.out.println(exponential(4,4));
    }
}