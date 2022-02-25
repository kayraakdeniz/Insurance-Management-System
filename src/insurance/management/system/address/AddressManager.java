package insurance.management.system.address;


import insurance.management.system.User;

public class AddressManager {

    public AddressManager() {

    }

    public static void insert(IAddress address, User user) {
        user.getAddressList().add(address);
    }

    public static void delete(IAddress address,User user) {
        user.getAddressList().remove(address);
    }


}
