package insurance.management.system.insurance;

import java.util.Date;

public class HealthInsurance extends Insurance {
    public HealthInsurance( Date start, Date finish) {
        super("Sağlık Sigortası", start, finish);
    }

    @Override
    public void calculate(int affect) {
        setPrice(5900*affect);
    }
}
