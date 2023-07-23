
public class SafeHouse extends NormalLoc {
    public SafeHouse(Player player) {
        super(player, "Safe House");
    }

    @Override
    public boolean onLocation() {
        if (checkObjectives()) {
            System.out.println("Macerayı başarıyla tamamladın... Tekrar görüşmek dileğiyle!");
            return false;
        }
        System.out.println("Güvenli evdesiniz !");
        System.out.println("Canınız yenilendi !");
        this.getPlayer().setHealth(this.getPlayer().getOriginalHealth());
        return true;
    }

    public boolean checkObjectives() {
        boolean isWood = false;
        boolean isWater = false;
        boolean isFood = false;
        for (Objective obj : this.getPlayer().getInventory().getObjectiveList()) {
            if (obj.getName().equals("firewood")) {
                isWood = true;
            }
            if (obj.getName().equals("water")) {
                isWater = true;
            }
            if (obj.getName().equals("food")) {
                isFood = true;
            }
        }
        return isWater && isWood && isFood;
    }
}
