import java.util.ArrayList;
import java.util.Scanner;

public class Telephone extends BaseProduct {
    private static ArrayList<Telephone> telephones = new ArrayList<>();

    static {
        add();
    }

    private int batteryPower;
    private String color;
    private int camera;


    public Telephone(int id, double price, double discountRatio, double stockAmount, String productName, Brands brandInfo, int ram, int storage, double screenSize, int batteryPower, String color, int camera) {
        super(id, price, discountRatio, stockAmount, productName, brandInfo, ram, storage, screenSize);
        this.batteryPower = batteryPower;
        this.color = color;
        this.camera = camera;
    }

    public Telephone(int batteryPower, String color, int camera) {
        this.batteryPower = batteryPower;
        this.color = color;
        this.camera = camera;
    }

    public static Telephone getPhoneById(int id) {
        for (Telephone t : telephones) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }


    public static void printTelInfo() {
        System.out.println("| ID | Ürün Adı         | Fiyat | Marka | Depolama | Ekran | Kamera | Pil | RAM | Renk |");
        for (Telephone t : telephones) {
            System.out.println("| " + t.getId() + " | " + t.getProductName() + " \t|" + t.getPrice() + " TL| " + t.getBrandInfo().getName() + " | " + t.getStorage() + " | " + t.getScreenSize() + " | " + " | " + t.getCamera() + " | " + t.getBatteryPower() + " | " + t.getRam() + " | " + t.getColor() + " \t|");
        }
    }

    public static void deletePhoneById() {
        int deleteId;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Silinecek ürünün id'sini giriniz : ");
        deleteId = scanner.nextInt();

        for (int i = 0; i < telephones.size(); i++) {
            if (telephones.get(i).getId() == deleteId) {
                telephones.remove(i);
            }
        }
    }

    public static void addPhone() {
        int id, ram, storage, batteryPower, camera;

        double price, discountRatio, screenSize, stockAmount;
        String productName, color;
        Brands brandInfo;

        Scanner scanner = new Scanner(System.in);
        System.out.print("ID : ");
        id = scanner.nextInt();
        System.out.print("Price : ");
        price = scanner.nextDouble();
        System.out.print("Discount Ratio : ");
        discountRatio = scanner.nextDouble();
        System.out.print("Stock Amount : ");
        stockAmount = scanner.nextDouble();
        System.out.print("Product Name : ");
        productName = scanner.next();
        System.out.print("Brand Info : ");
        String brandInfoName = scanner.next();
        brandInfo = Brands.getBrandByName(brandInfoName);
        System.out.print("Ram : ");
        ram = scanner.nextInt();
        System.out.print("Storage : ");
        storage = scanner.nextInt();
        System.out.print("Screen Size : ");
        screenSize = scanner.nextDouble();
        System.out.print("Battery Power : ");
        batteryPower = scanner.nextInt();
        System.out.print("Color : ");
        color = scanner.next();
        System.out.print("Camera : ");
        camera = scanner.nextInt();

        Telephone tel = new Telephone(id, price, discountRatio, stockAmount, productName, brandInfo, ram, storage, screenSize, batteryPower, color, camera);
        telephones.add(tel);
    }


    public static ArrayList<Telephone> getTelephones() {
        return telephones;
    }

    public static void setTelephones(ArrayList<Telephone> telephones) {
        Telephone.telephones = telephones;
    }

    public static void add() {
        telephones.add(new Telephone(1, 3199, 20, 50, "SAMSUNG GALAXY A51", Brands.getBrandByName("Samsung"), 6, 128, 6.5, 32, "Siyah", 4000));
        telephones.add(new Telephone(2, 7379.0, 20, 50, "IPHONE 11 64 GB", Brands.getBrandByName("Apple"), 6, 64, 6.1, 5, "Mavi", 3046));
    }

    @Override
    public void printInfo() {
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}


