public abstract class BaseProduct {
    private int id;
    private double price;
    private double discountRatio;
    private double stockAmount;
    private String productName;
    private Brands brandInfo;
    private int ram;
    private int storage;
    private double screenSize;

    public BaseProduct(int id, double price, double discountRatio, double stockAmount, String productName, Brands brandInfo, int ram, int storage, double screenSize) {
        this.id = id;
        this.price = price;
        this.discountRatio = discountRatio;
        this.stockAmount = stockAmount;
        this.productName = productName;
        this.brandInfo = brandInfo;
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
    }

    public BaseProduct(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountRatio() {
        return discountRatio;
    }

    public void setDiscountRatio(double discountRatio) {
        this.discountRatio = discountRatio;
    }

    public double getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(double stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Brands getBrandInfo() {
        return brandInfo;
    }

    public void setBrandInfo(Brands brandInfo) {
        this.brandInfo = brandInfo;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public abstract void printInfo();

}
