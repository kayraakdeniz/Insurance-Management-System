package insurance.management.system.insurance;

import java.util.Date;

public abstract class Insurance {

    private String name;
    private double price;
    private Date start;
    private Date finish;

    public Insurance(String name, Date start, Date finish) {
        this.name = name;
        this.start = start;
        this.finish = finish;
    }

    public abstract void calculate(int affect);


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getFinish() {
        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }
}
