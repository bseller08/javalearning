package lecture4;

import java.util.*;

public class Lecture4 {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5};
        String[][] strarr = {{"r", "f"}, {"t", "g"}};
        int br= arr.length;

        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("one");
        list.add("one");
        list.add("one");
        list.add("one");
        list.add("two");
        list.add("one");
        list.add("one");
        list.add("one");
        list.add("one");
        list.add("one");
        list.add("three");
        list.add("one");
        list.add("one");
        list.add("one");
        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i);
            if (temp.equalsIgnoreCase("three")) {
                System.out.println(i);
            }
        }

        Set<String> set = new HashSet<String>();
        set.add("one");
        set.add("two");
        set.add("two");
        set.add("three");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1233, "Friend");
        map.put(1234, "Spouse");

        Set<Integer> keys = map.keySet();

        System.out.println(map.get(1234));
    }
}
