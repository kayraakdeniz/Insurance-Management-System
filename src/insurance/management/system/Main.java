package insurance.management.system;

import insurance.management.system.account.Account;
import insurance.management.system.account.Enterprise;
import insurance.management.system.account.Individual;
import insurance.management.system.address.AddressManager;
import insurance.management.system.address.BusinessAddress;
import insurance.management.system.address.HomeAddress;
import insurance.management.system.address.IAddress;
import insurance.management.system.insurance.*;

import java.util.Date;

public class Main {

    static AccountManager accountManager = new AccountManager();

    public static void main(String[] args) {

        User u1 = new User("Ahmet", "yahoo.com", "123", "Turizm",
                34, new Date(2014, 4, 15));
        Account account1 = new Individual();
        account1.setUser(u1);
        IAddress homeAddress = new HomeAddress("İstanbul", "Şişli", 34320);
        IAddress businessAddress = new BusinessAddress("İstanbul", "Gayrettepe", 34564);
        accountMaker(u1, account1, homeAddress, businessAddress);

        User u2 = new User("Fatma", "hotmail.com", "456", "Hemşire",
                25, new Date(2014, 8, 5));
        Account account2 = new Individual();
        account2.setUser(u2);
        IAddress homeAddress2 = new HomeAddress("İzmir", "Buca", 35380);
        IAddress businessAddress2 = new BusinessAddress("İzmir", "Alsancak", 35321);
        accountMaker(u2, account2, homeAddress2, businessAddress2);

        User u3 = new User("Migros_Ticaret", "migros.com", "789", "HR",
                32, new Date(2019, 11, 24));
        Account account3 = new Enterprise();
        account3.setUser(u3);
        IAddress homeAddress3 = new HomeAddress("İstanbul", "Beşiktaş", 34999);
        IAddress businessAddress3 = new BusinessAddress("İstanbul", "Ataşehir", 34212);
        accountMaker(u3, account3, homeAddress3, businessAddress3);

        Account account = null;

        try {
            account = AccountManager.login("migros.com", "789");
            account.showUserInfo();
            printAddress(account);
            printInsurance(account);
        } catch (NullPointerException exception) {
            System.out.println("Account değeri boş!");
        }

    }

    public static void accountMaker(User user, Account account, IAddress homeAddress, IAddress businessAddress) {
        helperInsert(homeAddress, user);
        helperInsert(businessAddress, user);

        Insurance carInsurance1 = new CarInsurance(new Date(2012, 5, 12), new Date());
        helperCalculate(carInsurance1,  account);

        HealthInsurance healthInsurance = new HealthInsurance(new Date(), new Date());
        helperCalculate(healthInsurance,  account);

        TravelInsurance travelInsurance = new TravelInsurance(new Date(), new Date());
        helperCalculate(travelInsurance, account);

        ResidenceInsurance residenceInsurance = new ResidenceInsurance(new Date(), new Date());
        helperCalculate(residenceInsurance, account);
        accountManager.getAccounts().add(account);

    }

    private static void helperInsert(IAddress address, User user) {
        AddressManager.insert(address, user);
    }

    private static void helperCalculate(Insurance insurance, Account account1) {
        account1.addInsurance(insurance);
    }

    private static void printAddress(Account account) {
        for (IAddress address : account.getUser().getAddressList()) {
            address.showAddressInfo();
        }
        System.out.println("*********");
    }

    private static void printInsurance(Account account1) {
        for (Insurance insurance : account1.getInsuranceList()) {
            System.out.print(insurance.getName() + "-");
            System.out.println(insurance.getPrice());
        }
    }
}
