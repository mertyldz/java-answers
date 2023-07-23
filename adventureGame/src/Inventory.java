import java.util.ArrayList;

public class Inventory {
    private Weapon weapon;
    private Armor armor;
    private ArrayList<Objective> objectiveList;

    public Inventory() {
        this.weapon = new Weapon("Yumruk", -1, 0, 0);
        this.armor = new Armor("Paçavra", -1,0,0);
        this.objectiveList = new ArrayList<>();
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public ArrayList<Objective> getObjectiveList() {
        return objectiveList;
    }

    public void setObjectiveList(ArrayList<Objective> objectiveList) {
        this.objectiveList = objectiveList;
    }
}
