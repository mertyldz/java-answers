import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> allNums = new ArrayList<>();
        List<Integer> oddNums = new ArrayList<>();
        List<Integer> evenNums = new ArrayList<>();

        for (int i = 1; i <= 10000; i++) {
            allNums.add(i);
        }

        List<Integer> allNumsPart1 = allNums.subList(0, 2500);
        List<Integer> allNumsPart2 = allNums.subList(2500, 5000);
        List<Integer> allNumsPart3 = allNums.subList(5000, 7500);
        List<Integer> allNumsPart4 = allNums.subList(7500, 10000);

        Thread nmsp1 = new Thread(new NumberSplitter(allNumsPart1, evenNums, oddNums));
        nmsp1.start();
        Thread nmsp2 = new Thread(new NumberSplitter(allNumsPart2, evenNums, oddNums));
        nmsp2.start();
        Thread nmsp3 = new Thread(new NumberSplitter(allNumsPart3, evenNums, oddNums));
        nmsp3.start();
        Thread nmsp4 = new Thread(new NumberSplitter(allNumsPart4, evenNums, oddNums));
        nmsp3.start();
        

        System.out.println(evenNums.size());
        System.out.println(oddNums.size());


    }
}