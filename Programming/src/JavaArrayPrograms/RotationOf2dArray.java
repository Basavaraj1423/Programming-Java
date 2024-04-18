package JavaArrayPrograms;

public class RotationOf2dArray {

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Before");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("After left Rotation");
        for (int row = a.length - 1; row >= 0; row--) {
            for (int col = 0; col < a.length; col++) {
                System.out.print(a[col][row] + " ");
            }
            System.out.println();
        }
        System.out.println("After Right Rotation");
        for (int row = 0; row < a.length; row++) {
            for (int col = a[row].length - 1; col >= 0; col--) {
                System.out.print(a[col][row] + " ");
            }
            System.out.println();
        }
        System.out.println("Reverse Rotation");
        for (int row = a.length - 1; row >= 0; row--) {
            for (int col = a[row].length - 1; col >= 0; col--) {
                System.out.print(a[row][col] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        System.out.println("Daignol Sum");
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i][a.length - 1 - i];
        }
        System.out.println("The sim of the daignol is " + sum);
    }
}
