import java.util.Arrays;

public class MainProgram {


    public static void main(String[] args) {
        Collection  collection = new Collection();

        int subArraySize = 3;
        int[] queue = {7,5,5,7,5,5,7,5,5,6};

        for (int i = 0; i < queue.length-subArraySize+1; i++) {
            System.out.println(Arrays.toString(collection.subset(queue, subArraySize)[i]));
        }
        System.out.println();

        int[][] subArray = collection.subset(queue, subArraySize);

        System.out.println(collection.unique(subArray));
    }
}
