package lecture4.Home;

import java.util.*;

public class Task3 {
    public static void main(String args[]) {
        double[] list = new double[]{3, 4, 9.3, -2, 0, 45, 765, -111, 657, 56.4, -777, 56};
        //Summa

        double sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }


        System.out.println("Sum is: " + sum);
        System.out.println("AVG: " + sum/list.length);



    }
}
