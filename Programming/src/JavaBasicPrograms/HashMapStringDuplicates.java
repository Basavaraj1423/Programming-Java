package JavaBasicPrograms;

import java.util.HashMap;
import java.util.Map;

public class HashMapStringDuplicates {
    public static void main(String[] args) {
        String str = "Welcomessllooggvvcc";
        int count = 1;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String s1 = String.valueOf(ch);
            if (map.containsKey(s1)) {
                map.put(s1, map.get(s1) + 1);
            } else {
                map.put(s1, count);
            }
        }



        for (String s2 : map.keySet()){
            int num = map.get(s2);
            if (num>1)
                System.out.println(s2 + "=> " + map.get(s2));
        }

    }
}
