package Collection;/* 

Created by 
bharat 
on 21/02/20 
*/

import java.util.*;

public class Q4_SortHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap=new HashMap<>();
        hashMap.put("one",1);
        hashMap.put("three",3);
        hashMap.put("two",2);
        LinkedHashMap<String,Integer> sortedMap = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();


        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            list.add(entry.getValue());
        }
        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer str, Integer str1) {
                return (str).compareTo(str1);
            }
        });
        for (int str : list) {
            for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
                if (entry.getValue().equals(str)) {
                    sortedMap.put(entry.getKey(), str);
                }
            }
        }
        System.out.println(sortedMap);
    }
}
