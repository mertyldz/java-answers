import java.sql.Timestamp;

public class ResidenceInsurance extends Insurance {
    public ResidenceInsurance(String name, int price, String dateStart, String dateFinish) {
        super(name, price, dateStart, dateFinish);
    }

    @Override
    public void calculate() {

    }
}
