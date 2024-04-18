package JavaArrayPrograms;

public class RotateRightArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Straight");
        for (int i = 0; i <= a.length-1 ; i++)
            System.out.print(a[i] + " ");

        System.out.println();

        System.out.println("Reverse");
        for (int i = a.length-1; i >=0 ; i--)
            System.out.print(a[i] + " ");
        System.out.println();

        System.out.println("One Dimension Array Right Rotation");
        int lastElement = a[a.length-1];
        for (int i = a.length-1; i > 0;  i--)
            a[i] = a[i-1];
        a[0] = lastElement;
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + "  ");
    }
}
