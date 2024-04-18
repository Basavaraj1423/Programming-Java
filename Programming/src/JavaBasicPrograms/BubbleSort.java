package JavaBasicPrograms;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 4, 3, 5};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j ] = temp;
                }
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.println("The Buble Sort of an array is " +arr[k]);

        }
    }
}
