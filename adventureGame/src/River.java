public class River extends BattleLoc{
    public River(Player player) {
        super(player, "Nehir", new Bear(), 2);
        this.setAward(new Objective("water"));
    }
}
