package JavaBasicPrograms;

public class SumOfMinAndMaxInAnArray {
    public static void main(String[] args) {
        int[] arr = {8, 6, 5, 7, 9, 1, 6, 2, 3};
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max)
                max = arr[i];
            if (arr[i]<min)
                min = arr[i];

        }
        System.out.println("The Minmum + maximum value in an array is : " +(min+max));
    }
}








