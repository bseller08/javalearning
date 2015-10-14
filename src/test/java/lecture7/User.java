package lecture7;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "Users")
public class User {

    @Column(name = "user_id")
    public Integer id;
    @Column(name = "name")
    public String name;
    @Column(name = "age")
    public Integer age;
    @Column(name = "address")
    public Address address;


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
