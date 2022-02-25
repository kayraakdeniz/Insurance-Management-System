package insurance.management.system;

import insurance.management.system.address.IAddress;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {

    private String name;
    private String email;
    private String password;
    private String occupation;
    private int age;
    private List<IAddress> addressList;
    private Date lastEnter;

    public User(String name, String email, String password, String occupation, int age, Date lastEnter) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.occupation = occupation;
        this.age = age;
        this.lastEnter = lastEnter;
        this.addressList=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<IAddress> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<IAddress> addressList) {
        this.addressList = addressList;
    }

    public Date getLastEnter() {
        return lastEnter;
    }

    public void setLastEnter(Date lastEnter) {
        this.lastEnter = lastEnter;
    }
}
