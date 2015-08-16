package lecture1;

public class Lecture1 {

    public static void main(String[] args) {

        Driver driver = new Driver();
        Transport transport = new Poezd();
        driver.goFromAToB(transport);
        transport = new Kamaz();
        driver.goFromAToB(transport);

    }
}
