package JavaArrayPrograms;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=arr[i];
        }
        System.out.println("Elements in an array one");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println();

        System.out.println("Elements in an array Two");
        for (int i = 0; i < arr2.length; i++)
            System.out.print(arr2[i] + " ");



    }
}
