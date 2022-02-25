package insurance.management.system.address;

public class HomeAddress implements IAddress {
    String city;
    String district;
    int zipCode;

    public HomeAddress() {
    }

    public HomeAddress(String city, String district, int zipCode) {
        this.city = city;
        this.district = district;
        this.zipCode = zipCode;
    }

    @Override
    public void setCity(String city) {
        this.city=city;
    }

    @Override
    public void setDistrict(String district) {
        this.district=district;
    }

    @Override
    public void setZipCode(int zipCode) {
        this.zipCode=zipCode;
    }

    @Override
    public void showAddressInfo() {
        System.out.println("Şehir: "+this.city+"\tİlçe: "+this.district+"\tPosta kodu: "+this.zipCode);
    }
}
