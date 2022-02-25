package insurance.management.system;



import insurance.management.system.account.Account;

import java.util.TreeSet;

public class AccountManager {

    static TreeSet<Account> accounts=new TreeSet<>();

    public AccountManager() {

    }

    public static Account login(String inputMail, String inputPassword) throws NullPointerException {
        if (accounts != null) {
            for (Account account : accounts) {
                if (account.getUser().getEmail().equals(inputMail) && account.getUser().getPassword().equals(inputPassword)) {
                    try {
                        account.login(inputMail, inputPassword);
                        return account;
                    } catch (InvalidAuthenticationException e) {
                        System.out.println(AuthenticationStatus.FAIL);
                        e.printStackTrace();
                    }
                }
            }
        } else if (accounts == null) {
            System.out.println("Hesap listesi boş!");
            throw new NullPointerException();
        }
        return null;
    }

    public TreeSet<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(TreeSet<Account> accounts) {
        this.accounts = accounts;
    }
}
