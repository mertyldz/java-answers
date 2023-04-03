import java.sql.Timestamp;

public class TravelInsurance extends Insurance {
    public TravelInsurance(String name, int price, String dateStart, String dateFinish) {
        super(name, price, dateStart, dateFinish);
    }

    @Override
    public void calculate() {

    }
}
