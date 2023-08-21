import java.util.ArrayList;
import java.util.PriorityQueue;


    // sort the given list in ascending order and return it in the given format .

public class Descending_order {

    public static  ArrayList<Integer> quickSortUsingDutchNationalFlag(ArrayList<Integer> arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(arr);
        ArrayList<Integer> sortedArr = new ArrayList<>();

        while (!pq.isEmpty()) {
            sortedArr.add(pq.poll());
        }

        return sortedArr;
    }

    
}
