public class Snake extends Obstacle {
    public static Weapon droppedWeapon = null;
    public static Armor droppedArmor = null;

    public Snake() {
        super(4, "Yılan", 0, 12, 0);
        int damage = (int) (Math.random() * 3) + 3;
        this.setDamage(damage);


    }
}
