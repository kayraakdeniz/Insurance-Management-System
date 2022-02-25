package insurance.management.system.account;

import insurance.management.system.AuthenticationStatus;
import insurance.management.system.InvalidAuthenticationException;
import insurance.management.system.User;
import insurance.management.system.address.IAddress;
import insurance.management.system.insurance.Insurance;

import java.util.ArrayList;
import java.util.List;

public abstract class Account implements Comparable<Account> {

    private User user;
    private AuthenticationStatus loginStatus;
    private List<Insurance> insuranceList;

    public Account() {
        insuranceList=new ArrayList<>();
    }

    public final void showUserInfo() {
        System.out.println("Kullanıcı ismi: "+this.user.getName());
        System.out.println("Kullanıcı maili: "+this.user.getEmail());
        System.out.println("Kullanıcı yaşı: "+this.user.getAge());
        System.out.println("Kullanıcı mesleği: "+this.user.getOccupation());
        System.out.println("Son girdiği tarih: "+this.user.getLastEnter());
    }

    public void login(String mail,String password) throws InvalidAuthenticationException {

        if (user.getEmail().equals(mail) && user.getPassword().equals(password)) {
            loginStatus = AuthenticationStatus.SUCCESS;
            System.out.println(showStatus(loginStatus));
        } else {
            throw new InvalidAuthenticationException();
        }
    }

    private AuthenticationStatus showStatus(AuthenticationStatus status) {
        return status;
    }

    public void addUserAddress(IAddress address) {
        user.getAddressList().add(address);
    }

    public void deleteUserAddress(IAddress address) {
        user.getAddressList().remove(address);
    }

    public abstract void addInsurance(Insurance insurance);


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public AuthenticationStatus getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(AuthenticationStatus loginStatus) {
        this.loginStatus = loginStatus;
    }

    public List<Insurance> getInsuranceList() {
        return insuranceList;
    }

    public void setInsuranceList(List<Insurance> insuranceList) {
        this.insuranceList = insuranceList;
    }

    @Override
    public int compareTo(Account o) {
        if (user.getName().compareTo(o.getUser().getName()) > 0) {
            return 1;
        } else if (user.getName().compareTo(o.getUser().getName()) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
