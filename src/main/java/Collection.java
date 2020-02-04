import java.util.Arrays;

public class Collection {

    public static void main(String[] args) {

        int number = 9;
        int subArraySize = 3;
        int[] queue = {6,2,6,8,3,7,1,4,4};

        for (int i = 0; i < queue.length; i++) {
            System.out.println(Arrays.deepToString(subset(number, subArraySize, queue)));
        }

    }
    public static String[][] subset(int arraySize, int subArraySize,int[] queue) {
        String[][] myArray = new String[arraySize-subArraySize+1][subArraySize];

        for (int i = 0; i < arraySize-subArraySize+1; i++) {
            for (int j = 0; j < subArraySize; j++) {
                myArray[i][j] = String.valueOf(queue[j]);
            }
        }
        return myArray;
    }
}
