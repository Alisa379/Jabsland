public abstract class LocalLoot implements levelUp {
    private final String name;
    private boolean status;
    private final String info;
    private final String levelUpCast;
    private final int levelBoost;

    public LocalLoot(String name, String info, String levelUpCast, int levelBoost) {
        this.name = name;
        this.status = false;
        this.info = info;
        this.levelUpCast = levelUpCast;
        this.levelBoost = levelBoost;
    }

    public String getName() {
        return this.name;
    }
    public boolean getStatus() {
        return this.status;
    }
    public String getInfo() {
        return this.info;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void levelUp(Jabs jabs) {
        switch(this.levelUpCast) {
            case("admins"):
                if (jabs.getJabsLevels().get(Jabs.casts.getFirst()) < (Jabs.maxLevel - this.levelBoost)) {
                    jabs.setAdminsLevel(jabs.getJabsLevels().get(Jabs.casts.getFirst()) + this.levelBoost);
                }
                else {
                    jabs.setAdminsLevel(Jabs.maxLevel);
                }
                break;
            case("civilians"):
                if (jabs.getJabsLevels().get(Jabs.casts.get(1)) < (jabs.getJabsLevels().get(Jabs.casts.getFirst()) - this.levelBoost)) {
                    jabs.setCiviliansLevel(jabs.getJabsLevels().get(Jabs.casts.get(1)) + this.levelBoost);
                }
                else {
                    jabs.setCiviliansLevel(jabs.getJabsLevels().get(Jabs.casts.getFirst()));
                }
                break;
            case("scientists"):
                if (jabs.getJabsLevels().get(Jabs.casts.get(2)) < (jabs.getJabsLevels().get(Jabs.casts.getFirst()) - this.levelBoost)) {
                    jabs.setScientistsLevel(jabs.getJabsLevels().get(Jabs.casts.get(2)) + this.levelBoost);
                }
                else {
                    jabs.setScientistsLevel(jabs.getJabsLevels().get(Jabs.casts.getFirst()));
                }
                break;
            case("warriors"):
                if (jabs.getJabsLevels().get(Jabs.casts.get(3)) < (jabs.getJabsLevels().get(Jabs.casts.getFirst()) - this.levelBoost)) {
                    jabs.setWarriorsLevel(jabs.getJabsLevels().get(Jabs.casts.get(3)) + this.levelBoost);
                }
                else {
                    jabs.setWarriorsLevel(jabs.getJabsLevels().get(Jabs.casts.getFirst()));
                }
                break;
        }
    }
};
