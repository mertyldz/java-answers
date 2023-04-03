import java.util.ArrayList;
import java.util.Comparator;

public class Brands implements Comparator<Brands> {
    private static ArrayList<Brands> brandList = new ArrayList<>();
    private int id;
    private String name;
    private static int idIncreaser = 1;

    static {
        brandList.add(new Brands("Samsung"));
        brandList.add(new Brands("Lenovo"));
        brandList.add(new Brands("Apple"));
        brandList.add(new Brands("Huawei"));
        brandList.add(new Brands("Casper"));
        brandList.add(new Brands("Asus"));
        brandList.add(new Brands("HP"));
        brandList.add(new Brands("Xiaomi"));
        brandList.add(new Brands("Monster"));
    }


    public Brands() {
    }


    public Brands(String name) {
        this.id = idIncreaser;
        this.name = name;
        idIncreaser++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static ArrayList<Brands> getBrandList() {
        return brandList;
    }

    public static void setBrandList(ArrayList<Brands> brandList) {
        Brands.brandList = brandList;
    }

    public int getIdIncreaser() {
        return idIncreaser;
    }

    public void setIdIncreaser(int idIncreaser) {
        this.idIncreaser = idIncreaser;
    }

    public static Brands getBrandByName(String name){
        for(Brands b : Brands.brandList){
            if(b.getName().equals(name)){
                return b;
            }
        }
        return null;
    }

    public static void addBrand(String name){
        brandList.add(new Brands(name));
    }

    @Override
    public int compare(Brands o1, Brands o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

