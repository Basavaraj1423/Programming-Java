package JavaBasicPrograms;

import java.util.ArrayList;

public class DuplicatesInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        for (int i = 0; i < integers.size(); i++) {
            for (int j = i + 1; j < integers.size(); j++) {
                if (integers.get(i) == integers.get(j)) {
                    integers.remove(j);
                    j--;
                }
            }
        }
        for (int numbers : integers)
            System.out.println(numbers);


    }
}
