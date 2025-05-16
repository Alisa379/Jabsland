import java.util.List;
import java.util.ArrayList;

public class Region implements playActions {
    private String name;
    private final String originalName;
    private boolean status;
    private final String basicInfo;
    private final int kvaks;
    private final int treasury;
    private final int profitPerJab;
    private final int openSimplicytyFactor;
    private final int levelUpFactor;
    private Jabs jabs;
    private Artifact artifact;
    private SecretKnowledge secretKnowledge;
    private final List<Integer> defaultValues = new ArrayList<>();
    private final List<Integer> adjacentRegions = new ArrayList<>();

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
        for (Integer i: adjacentRegions) {
            this.adjacentRegions.add(i);
        }
    }


    @Override
    public void endMonth() {

    }
    @Override
    public void getFullInfo() {

    }
}
