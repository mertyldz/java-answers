public class Forest extends BattleLoc{
    public Forest(Player player) {
        super(player, "Orman", new Vampire(), 3);
        this.setAward(new Objective("firewood"));
    }
}
