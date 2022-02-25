package insurance.management.system.address;

public class BusinessAddress implements IAddress {
    String city;
    String district;
    int zipCode;
    String companyName;

    public BusinessAddress() {
    }

    public BusinessAddress(String city, String district, int zipCode) {
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

    public void setCompanyName(String companyName) {
        this.companyName=companyName;
    }

    @Override
    public void showAddressInfo() {
        System.out.println("Şehir: "+this.city+"\tİlçe: "+this.district+"\tPosta kodu: "+this.zipCode);
    }
}
