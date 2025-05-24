
public class Artifact extends LocalLoot  {
    private final String action;
    private final int lootCoins;

    public Artifact(String name, String info, String action, int lootCoins, String levelUpCast, int levelUpBoost) {
        super(name, info, levelUpCast, levelUpBoost);
        this.action = action;
        this.lootCoins = lootCoins;
    }

    public String getAction() {
        return action;
    }

    public void specialMethod(Player player) {
        player.setCoinsAmount(player.getCoinsAmount() + this.lootCoins);
    }

};
