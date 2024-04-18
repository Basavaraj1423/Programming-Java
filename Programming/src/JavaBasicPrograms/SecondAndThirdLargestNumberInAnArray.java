package JavaBasicPrograms;

public class SecondAndThirdLargestNumberInAnArray {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 7, 1, 3, 5, 9, 8};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("The Second Largest Number in an Array is : " + arr[arr.length-2]);

    }
}
