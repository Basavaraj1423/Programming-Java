package JavaBasicPrograms;

import java.util.ArrayList;

public class EvenNumbersSumArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        int plus = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0)
                sum += arrayList.get(i);

        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                plus += arr[i];

        }

        System.out.println("The Sum of Even Numbers in an ArrayList  " + sum);
        System.out.println("The Sum of Even Numbers in an Array  " + plus);

    }
}
