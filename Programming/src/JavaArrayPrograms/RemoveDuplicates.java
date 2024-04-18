package JavaArrayPrograms;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 4, 5, 5, 6, 6, 6, 6};
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                result[i] = arr[i];

            }
        }
        System.out.println("Using For Each Loop");
        for (int num : result) {
            if (num != 0)
                System.out.print(num + "  ");
        }
        System.out.println();
        System.out.println("Using For Loop");
        for (int i = 0; i < result.length; i++) {
            if (result[i] != 0)
            System.out.print(result[i] + "  ");

        }
    }
}
