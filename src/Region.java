import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Region implements PlayActions, Serializable {
    private String name;
    private final String originalName;
    private boolean status;
    private final String basicInfo;
    private final int kvaks;
    private final int treasury;
    private final int profitPerJab;
    private final int openSimplicytyFactor;
    private final int levelUpFactor;
    private final Jabs jabs;
    private final Artifact artifact;
    private final SecretKnowledge secretKnowledge;
    private final List<Integer> defaultValues = new ArrayList<>();
    private final List<Integer> adjacentRegions = new ArrayList<Integer>();

    public Region(String originalName, String basicInfo, int kvaks, int treasury,
                  int profitPerJab, int openSimplicityFactor, int levelUpFactor,
                  Artifact artifact, SecretKnowledge secretKnowledge,
                  int adminsCount, int civiliansCount, int scientistsCount, int warriorsCount,
                  int adminsLevel, int civiliansLevel, int scientistsLevel, int warriorsLevel,
                  Integer  ... adjacentRegions) {
        this.name = originalName;
        this.originalName = originalName;
        this.status = false;
        this.basicInfo = basicInfo;
        this.kvaks = kvaks;
        this.treasury = treasury;
        this.profitPerJab = profitPerJab;
        this.openSimplicytyFactor = openSimplicityFactor;
        this.levelUpFactor = levelUpFactor;
        this.jabs = new Jabs(adminsCount, civiliansCount, scientistsCount, warriorsCount,
                adminsLevel, civiliansLevel, scientistsLevel, warriorsLevel);
        this.artifact = artifact;
        this.secretKnowledge = secretKnowledge;
        this.defaultValues.add(adminsCount);
        this.defaultValues.add(civiliansCount);
        this.defaultValues.add(scientistsCount);
        this.defaultValues.add(warriorsCount);
        this.defaultValues.add(adminsLevel);
        this.defaultValues.add(civiliansLevel);
        this.defaultValues.add(scientistsLevel);
        this.defaultValues.add(warriorsLevel);
        this.adjacentRegions.addAll(List.of(adjacentRegions)); // под вопросом работоспособность
    }

    public String getName() {
        if (this.name.equals(this.originalName)) {
            return this.name;
        }
        else {
            return this.name + "(" + this.originalName + ")";
        }
    }

    public boolean getStatus() {
        return this.status;
    }

    public Jabs getJabs() {
        return this.jabs;
    }

    public Artifact getArtifact() {
        return this.artifact;
    }

    public SecretKnowledge getSecretKnowledge() {
        return this.secretKnowledge;
    }

    public String getPopulationInfo() {
        if(this.status) {
            return "Общая численность жабок: " + this.jabs.getJabsCount().get(Jabs.casts.get(0)) + this.jabs.getJabsCount().get(Jabs.casts.get(1)) + this.jabs.getJabsCount().get(Jabs.casts.get(2)) + this.jabs.getJabsCount().get(Jabs.casts.get(3)) + "\n" +
                    "Администраторы: " + this.jabs.getJabsCount().get(Jabs.casts.get(0)) + "(" + this.jabs.getJabsLevels().get(Jabs.casts.get(0)) + " уровень)" + ", " +
                    "Мирные-жабки: " + this.jabs.getJabsCount().get(Jabs.casts.get(1)) + "(" + this.jabs.getJabsLevels().get(Jabs.casts.get(1)) + " уровень)" + ", " +
                    "Жабки-ученые: " + this.jabs.getJabsCount().get(Jabs.casts.get(2)) + "(" + this.jabs.getJabsLevels().get(Jabs.casts.get(2)) + " уровень)" + ", " +
                    "Жабки-воины: " + this.jabs.getJabsCount().get(Jabs.casts.get(3)) + "(" + this.jabs.getJabsLevels().get(Jabs.casts.get(3)) + " уровень)";
        }
        else {
            return "Общая численность жабок: " + Integer.toString(this.jabs.getJabsCount().get(Jabs.casts.get(0)) + this.jabs.getJabsCount().get(Jabs.casts.get(1)) + this.jabs.getJabsCount().get(Jabs.casts.get(2)) + this.jabs.getJabsCount().get(Jabs.casts.get(3)));
        }
    }

    public String getAdjacentRegions() {
        String result = "";
        for (Integer i: this.adjacentRegions) {
            result += Game.regions.get(i).getName();
            if (Game.regions.get(i).getStatus()) {
                if(i < Game.regions.size() - 1) {
                    result += ": в собственности, \n";
                }
                else {
                    result += ": в собственности.";
                }
            }
            else{
                if(i < Game.regions.size() - 1) {
                    result += ": не захвачен, \n";
                }
                else {
                    result += ": не захвачен.";
                }
            }
        }
        return result;
    }

    @Override
    public String getFullInfo() {
        return "Название региона: " + this.name + "\n" +
                "Исконное название региона: " + this.originalName + "\n" +
                this.basicInfo + "\n" +
                "Территория: " + this.kvaks + EndingsMod.kvaksMod(this.kvaks) + "\n" +
                "Доход с одной мирной жабки: " + this.jabs.getJabsLevels().get(Jabs.casts.get(1)) * this.profitPerJab + "\n" +
                "Артифакт: " + this.artifact.getName() + "\n" +
                this.artifact.getInfo() +
                "Секретное знание: " + this.secretKnowledge.getName() + "\n" +
                this.secretKnowledge.getInfo() + "\n" +
                this.getPopulationInfo() + "\n" +
                "Близлежащие регионы: \n" + this.getAdjacentRegions() + "\n";
    }

    public void changeName(String newName) {
        this.name = newName;
    }

    public int countMaintenanceCost() {
        return this.jabs.getJabsCount().get(Jabs.casts.get(0)) * this.jabs.getJabsLevels().get(Jabs.casts.get(0)) +
                this.jabs.getJabsCount().get(Jabs.casts.get(2)) * this.jabs.getJabsLevels().get(Jabs.casts.get(2)) +
                this.jabs.getJabsCount().get(Jabs.casts.get(3)) * this.jabs.getJabsLevels().get(Jabs.casts.get(3));
    }

    public int countLevelUpCost(String jabCast, int desiredLevel) {
        int sum = 0;
        int level = this.jabs.getJabsLevels().get(jabCast);
        while(level < desiredLevel) {
            sum += (1 + level) / this.levelUpFactor;
            level += 1;
        }
        return sum;
    }

    public int countProfit() {
        return this.jabs.getJabsCount().get(Jabs.casts.get(1)) * this.jabs.getJabsLevels().get(Jabs.casts.get(1)) * this.profitPerJab - this.countMaintenanceCost();
    }

    public void generateJabs() {
        if (this.jabs.getJabsCount().get(Jabs.casts.get(1)) >= 2) {
            this.jabs.setCiviliansCount(this.jabs.getJabsCount().get(Jabs.casts.get(1)) + 1);
        }
        else {
            this.jabs.setCiviliansCount(this.jabs.getJabsCount().get(Jabs.casts.get(1)) * 2);
        }
    }

    @Override
    public void endMonth() {
        this.generateJabs();
    }

    public void civiliansCastTo(String newCast, int amount) {
        this.jabs.setCiviliansCount(this.jabs.getJabsCount().get(Jabs.casts.get(1)) - amount);
        switch(newCast) {
            case("admins"):
                this.jabs.setAdminsCount(this.jabs.getJabsCount().get(Jabs.casts.getFirst() + amount));
                break;
            case("scientists"):
                this.jabs.setScientistsCount(this.jabs.getJabsCount().get(Jabs.casts.get(2) + amount));
                break;
            case("warriors"):
                this.jabs.setWarriorsCount(this.jabs.getJabsCount().get(Jabs.casts.get(3) + amount));
                break;
        }
    }

    public void levelUp(String jabCast, int desiredLevel, Player player) {
        player.setCoinsAmount(player.getCoinsAmount() - this.countLevelUpCost(jabCast, desiredLevel));
        switch(jabCast) {
            case ("admins"):
                this.jabs.setAdminsLevel(desiredLevel);
                break;
            case ("civilians"):
                this.jabs.setCiviliansLevel(desiredLevel);
                break;
            case ("scientists"):
                this.jabs.setScientistsLevel(desiredLevel);
                break;
            case ("warriors"):
                this.jabs.setWarriorsLevel(desiredLevel);
                break;
            default:
                break;
        }
    }

    public boolean tryToAttack(Region to, int warriorsToSend) {
        if (warriorsToSend * this.jabs.getJabsLevels().get(Jabs.casts.get(3)) >= to.jabs.getJabsCount().get(Jabs.casts.get(3)) * to.jabs.getJabsLevels().get(Jabs.casts.get(3))) {
            return true;
        }
        else {
            this.jabs.setWarriorsCount(0);
            this.jabs.setWarriorsLevel(0);
            return false;
        }
    }

    public boolean tryToNegotiate(Region to, int scientistsToSend) {
        if (scientistsToSend * this.jabs.getJabsLevels().get(Jabs.casts.get(2)) >= to.jabs.getJabsCount().get(Jabs.casts.get(2)) * to.jabs.getJabsLevels().get(Jabs.casts.get(2))) {
            return true;
        }
        else {
            this.jabs.setScientistsCount(0);
            this.jabs.setScientistsLevel(0);
            return false;
        }
    }

    public boolean tryToOpenSecretKnowledge(Player player) {
        float probability = (this.jabs.getJabsCount().get(Jabs.casts.get(2)) * this.jabs.getJabsLevels().get(Jabs.casts.get(2))) / ((this.kvaks - Jabs.minAdminsCount)*(Jabs.maxLevel - this.openSimplicytyFactor));
        Random random = new Random();
        if (random.nextFloat(1) <= probability) {
            player.addOwnedSecretKnowledge(this.secretKnowledge);
            this.getSecretKnowledge().levelUp(jabs);
            this.secretKnowledge.setStatus(true);
            this.secretKnowledge.setWasAcquired(true);
            return true;
        }
        else {
            this.jabs.setScientistsLevel(this.jabs.getJabsLevels().get(Jabs.casts.get(2)) - 1);
            return false;
        }
    }

    public boolean tryToDevelopArtifact(Player player) {
        float probability = (this.jabs.getJabsCount().get(Jabs.casts.get(2)) * this.jabs.getJabsLevels().get(Jabs.casts.get(2))) / ((this.kvaks - Jabs.minAdminsCount)*(Jabs.maxLevel - this.openSimplicytyFactor));
        Random random = new Random();
        if (random.nextFloat(1) <= probability) {
            player.addOwnedArtifact(this.artifact);
            this.artifact.setStatus(true);
            this.artifact.setWasAcquired(true);
            return true;
        }
        else {
            this.jabs.setScientistsLevel(this.jabs.getJabsLevels().get(Jabs.casts.get(2)) - 1);
            return false;
        }
    }

    public void applyArtifact(Player player) {
        this.artifact.specialMethod(player);
        this.artifact.levelUp(this.jabs);
    }

    public void toOwned(Player player) {
        player.addOwnedRegion(this);
        player.setCoinsAmount(player.getCoinsAmount() + this.treasury);
        this.status = true;
    }
    public void toDefault(Player player) {
        player.removeOwnedRegion(this);
        if(this.artifact.getStatus()) {
            player.removeOwnedArtifact(this.artifact);
        }
        if(this.secretKnowledge.getStatus()) {
            player.removeOwnedSecretKnowledge(this.secretKnowledge);
        }
        this.status = false;
        this.jabs.setAdminsCount(this.defaultValues.getFirst());
        this.jabs.setCiviliansCount(this.defaultValues.get(1));
        this.jabs.setScientistsCount(this.defaultValues.get(2));
        this.jabs.setWarriorsCount(this.defaultValues.get(3));
        this.jabs.setAdminsLevel(this.defaultValues.get(4));
        this.jabs.setCiviliansLevel(this.defaultValues.get(5));
        this.jabs.setScientistsLevel(this.defaultValues.get(6));
        this.jabs.setWarriorsLevel(this.defaultValues.get(7));
    }
}
