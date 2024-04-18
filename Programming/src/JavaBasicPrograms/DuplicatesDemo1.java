package JavaBasicPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DuplicatesDemo1 {
    public static void main(String[] args) {
        Map<Integer, String> season = new HashMap<>();
        System.out.println(season.size());
        ArrayList arrayList = new ArrayList();
        //System.out.println("ArrayList : " + arrayList.size());
        arrayList.add("Hi");
        season.put(1, "Rainy");
        season.put(2, "Summer");
        season.put(3, "Winter");
        season.put(4, "Mansoon");

        System.out.println(season);

//        Iterator iterator = season.entrySet().iterator();
//        while (iterator.hasNext()){
//                Map.Entry<Integer,String> entry = (Map.Entry<Integer, String>) iterator.next();
//        System.out.println(entry.getKey()+ " " +entry.getValue());



    }
}


