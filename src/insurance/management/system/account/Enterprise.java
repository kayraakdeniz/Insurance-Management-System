package insurance.management.system.account;

import insurance.management.system.insurance.Insurance;


public class Enterprise extends Account {

    private static final int affect=11;

    public Enterprise() {
        super();
    }

    @Override
    public void addInsurance(Insurance insurance) {
        insurance.calculate(affect);
        this.getInsuranceList().add(insurance);
    }
}
