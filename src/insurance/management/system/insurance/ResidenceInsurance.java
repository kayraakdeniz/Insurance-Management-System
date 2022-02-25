package insurance.management.system.insurance;

import java.util.Date;

public class ResidenceInsurance extends Insurance {
    public ResidenceInsurance(Date start, Date finish) {
        super("Konut Sigortası", start, finish);
    }

    @Override
    public void calculate(int affect) {
        setPrice(3400*affect);
    }
}
