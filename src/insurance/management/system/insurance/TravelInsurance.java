package insurance.management.system.insurance;

import java.util.Date;

public class TravelInsurance extends Insurance {
    public TravelInsurance(Date start, Date finish) {
        super("Seyahat Sigortası", start, finish);
    }

    @Override
    public void calculate(int affect) {
        setPrice(600*affect);
    }
}
