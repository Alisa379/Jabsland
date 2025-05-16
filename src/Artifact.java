
public class Artifact extends LocalLoot  {
    private final String action;
    private final int lootCoins;

    public Artifact(String name, String info, String action, int lootCoins, String levelUpCast, int levelUpFactor) {
        super(name, info, levelUpCast, levelUpFactor);
        this.action = action;
        this.lootCoins = lootCoins;
    }

    public String getAction() {
        return action;
    }

    public int specialMethod() {
        return lootCoins;
    }

};
