package lecture5;

import java.util.ArrayList;
import java.util.List;

public class Lecture5 {

    public static void main(String args[]) {

        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person(15, "Peter"));
        persons.add(new Person(35, "John"));
        persons.add(new Person(55, "Mike"));

        int count = 0;
        for (Person person : persons) {
            if (person.age > 25) {
                count++;
            }
        }

        System.out.println(count);
    }
}
