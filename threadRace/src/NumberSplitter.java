import java.util.ArrayList;
import java.util.List;

public class NumberSplitter implements Runnable {
    public List<Integer> allNums = new ArrayList<>();
    public List<Integer> evenNums = new ArrayList<>();
    public List<Integer> oddNums = new ArrayList<>();

    public NumberSplitter(List<Integer> allNums, List<Integer> evenNums, List<Integer> oddNums) {
        this.allNums = allNums;
        this.evenNums = evenNums;
        this.oddNums = oddNums;
    }

    @Override
    public void run() {
        splitter(allNums, evenNums, oddNums);
    }

    public synchronized void splitter(List<Integer> allN, List<Integer> evenN, List<Integer> oddN) {
        for (Integer i : allNums) {
            if (i % 2 == 0) {
                evenNums.add(i);
                System.out.println(Thread.currentThread() + " : " + i + " " + "even number added.");
            } else {
                oddNums.add(i);
                System.out.println(Thread.currentThread() + " : " + i + " " + "odd number added.");
            }
        }
    }


}
