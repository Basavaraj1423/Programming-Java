package JavaArrayPrograms;

public class EvenAndOddPosition {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        System.out.print("Elements in even position : ");
        for (int i = 1; i < a.length; i=i+2)
            System.out.print(a[i] + "  ");

        System.out.println();

        System.out.print("Elements in Odd position : ");
        for (int i = 0; i < a.length; i=i+2)
            System.out.print(a[i] + "  ");
    }
}
