package insurance.management.system.insurance;

import java.util.Date;

public class CarInsurance extends Insurance {


    public CarInsurance(Date start, Date finish) {
        super("Araba Sigortası",start, finish);
    }

    @Override
    public void calculate(int affect) {

        this.setPrice(1500*affect);
    }
}
