package JavaArrayPrograms;

public class PrintDuplicates {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,2,2,1};
        int[] res = new int[arr.length];
        System.out.println("The duplicates elements are : ");
        for (int i=0;i<arr.length;i++){
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j] && i!=j){
                    res[i] = arr[i];
                }

            }
        }
        for (int p : res) {
            System.out.println(p);

        }

    }
}
