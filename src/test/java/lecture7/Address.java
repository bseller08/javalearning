package lecture7;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "Address")
public class Address {

    @Column(name = "line1")
    public String line1;
    @Column(name = "city")
    public String city;
    @Column(name = "zip")
    public String zip;


    public String getLine1() {
        return line1;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }


}
