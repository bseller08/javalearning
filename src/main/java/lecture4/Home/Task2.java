package lecture4.Home;



import java.io.StringReader;
import java.util.*;

public class Task2 {
    public static void main(String args[]) {
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("two");
        list.add("onelll");
        int count =0;
        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i);
            if (temp.length() > 3) {
               count++;

            }

        }

        System.out.println(count);

    }
}