package mypackage;
import java.util.Arrays;
import java.util.Random;

public class BinarySearch {
    private static int[] randomArray(int length, int range) {
        int[] array = new int[length];
        Random r = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = r.nextInt(range);
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(randomArray(10, 100)));
    }
}
