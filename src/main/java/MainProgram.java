import java.util.Arrays;

public class MainProgram {


    public static void main(String[] args) {
        Collection  collection = new Collection();

        int subArraySize = 3;
        int[] queue = {6,2,6,8,3,7,1,4,4};

        int[][] subArray = collection.subset(queue, subArraySize);

        System.out.println(collection.unique(subArray));
    }
}
