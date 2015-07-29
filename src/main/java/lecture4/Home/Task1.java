import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task1 {
            public static void main (String args[]){
            List<String> list=new ArrayList<String>();
            list.add("one");
            list.add("two");
            list.add("three");
            list.add("two");
            list.add("one");
             Set<String> set = new HashSet<>(list);
                System.out.println(list);
                System.out.println(set);

        }
    }


