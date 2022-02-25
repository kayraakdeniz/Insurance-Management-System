package insurance.management.system.account;

import insurance.management.system.insurance.Insurance;


public class Individual extends Account {

    private static final int affect=6;

    public Individual() {
        super();
    }



    @Override
    public void addInsurance(Insurance insurance) {
        insurance.calculate(affect);
        this.getInsuranceList().add(insurance);
    }
}
