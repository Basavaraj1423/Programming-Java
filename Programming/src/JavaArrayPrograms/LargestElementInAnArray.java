package JavaArrayPrograms;

public class LargestElementInAnArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 10, 40, 50, 87};
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        System.out.println("Largest Element in an array : " +max);
    }
}
