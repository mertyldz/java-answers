public class Cave extends BattleLoc{
    public Cave(Player player) {
        super(player, "Mağara", new Zombie(), 3);
        this.setAward(new Objective("food"));
    }
}
