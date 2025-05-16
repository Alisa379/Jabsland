import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Jabs {

    private int adminsCount;
    private int civiliansCount;
    private int scientistsCount;
    private int warriorsCount;
    public static final int maxLevel;
    private int adminsLevel;
    private int civiliansLevel;
    private int scientistsLevel;
    private int warriorsLevel;
    public static final List<String> casts = new ArrayList<>();

    static {
        maxLevel = 20;
    }

    static {
        casts.add("admins");
        casts.add("civilians");
        casts.add("scientists");
        casts.add("warriors");
    }


    public Jabs(int adminsCount, int civiliansCount, int scientistsCount, int warriorsCount,
                int adminsLevel, int civiliansLevel, int scientistsLevel, int warriorsLevel) {
        this.adminsCount = adminsCount;
        this.civiliansCount = civiliansCount;
        this.scientistsCount = scientistsCount;
        this.warriorsCount = warriorsCount;
        this.adminsLevel = adminsLevel;
        this.civiliansLevel = civiliansLevel;
        this.scientistsLevel = scientistsLevel;
        this.warriorsLevel = warriorsLevel;
    }

    public Map<String, Integer> getJabsCount() {
        Map<String, Integer> jabsCount = new HashMap<>();
        jabsCount.put(casts.getFirst(), adminsCount);
        jabsCount.put(casts.get(1), civiliansCount);
        jabsCount.put(casts.get(2), scientistsCount);
        jabsCount.put(casts.getLast(), warriorsCount);
        return jabsCount;
    }

    public Map<String, Integer> getJabsLevels() {
        Map<String, Integer> jabsLevels = new HashMap<>();
        jabsLevels.put(casts.getFirst(), adminsLevel);
        jabsLevels.put(casts.get(1), civiliansLevel);
        jabsLevels.put(casts.get(2), scientistsLevel);
        jabsLevels.put(casts.getLast(), warriorsLevel);
        return jabsLevels;
    }

    public void setAdminsCount(int adminsCount) {
        this.adminsCount = adminsCount;
    }
    public void setCiviliansCount(int civiliansCount) {
        this.civiliansCount = civiliansCount;
    }
    public void setScientistsCount(int scientistsCount) {
        this.scientistsCount = scientistsCount;
    }
    public void setWarriorsCount(int warriorsCount) {
        this.warriorsCount = warriorsCount;
    }

    public void setAdminsLevel(int adminsLevel) {
        this.adminsLevel = adminsLevel;
    }
    public void setCiviliansLevel(int civiliansLevel) {
        this.civiliansLevel = civiliansLevel;
    }
    public void setScientistsLevel(int scientistsLevel) {
        this.scientistsLevel = scientistsLevel;
    }
    public void setWarriorsLevel(int warriorsLevel) {
        this.warriorsLevel = warriorsLevel;
    }
};
