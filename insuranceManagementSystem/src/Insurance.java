import java.sql.Timestamp;

public abstract class Insurance {
    private String name;
    private int price;
    private String dateStart;
    private String dateFinish;

    public Insurance(String name, int price, String dateStart, String dateFinish) {
        this.name = name;
        this.price = price;
        this.dateStart = dateStart;
        this.dateFinish = dateFinish;
    }

    public abstract void calculate();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateFinish() {
        return dateFinish;
    }

    public void setDateFinish(String dateFinish) {
        this.dateFinish = dateFinish;
    }
}
