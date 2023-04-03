import java.sql.Timestamp;

public class CarInsurance extends Insurance {
    public CarInsurance(String name, int price, String dateStart, String dateFinish) {
        super(name, price, dateStart, dateFinish);
    }

    @Override
    public void calculate() {

    }
}
