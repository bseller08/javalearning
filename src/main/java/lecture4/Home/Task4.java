package lecture4.Home;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String args[]){
        List <String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("two");
        list.add("one");
String result="";
        System.out.println(list.toString());
        System.out.println(list.toString().length());
        for (int i = 0; i < list.size(); i++) {
         result=result+list.get(i);

            
        }           
        System.out.println(result);


    }
}
