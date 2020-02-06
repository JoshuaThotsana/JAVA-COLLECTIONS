import java.util.HashSet;
import java.util.Set;

public class Collection {

    public int[][] subset(int[] queue, int subArraySize) {

        int[][] set = new int[queue.length-subArraySize+1][subArraySize];
        for (int i = 0; i < queue.length-subArraySize+1; i++) {
            if (subArraySize >= 0) System.arraycopy(queue, i, set[i], 0, subArraySize);
        }
        return set;
    }
    public int unique(int[][] subset) {

        int uniqueInt = 0;

        for (int[] ints : subset) {

            Set<Integer> set = new HashSet<>();

            for (int anInt : ints) {
                set.add(anInt);
            }
            if (set.size() > uniqueInt) {
                uniqueInt = set.size();
            }
        }
        return uniqueInt;
    }
}
