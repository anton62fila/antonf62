package lesson3;
import java.util.Arrays;
public class HW3 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    static void createArray(int[] arr, int step, int shift) {
        for (int i = 0; i < 100; i++) {
            arr[i] = shift + i * step;
        }
    }
}