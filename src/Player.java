import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

public class Player implements Serializable {
    private int coinsAmount;
    private List<Region> ownedRegions = new ArrayList<>();
    private List<SecretKnowledge> ownedSecretKnoledges = new ArrayList<>();
    private List<Artifact> ownedArtifacts = new ArrayList<>();

    public int getCoinsAmount() {
        return this.coinsAmount;
    }
    public List<Region> getOwnedRegions() {
        return this.ownedRegions;
    }
    public List<SecretKnowledge> getOwnedSecretKnoledges() {
        return this.ownedSecretKnoledges;
    }
    public List<Artifact> getOwnedArtifacts() {
        return this.ownedArtifacts;
    }
    public int countCoins() {
        int sum = 0;
        for(Region r: this.ownedRegions) {
            sum += r.countProfit();
        }
        return sum;
    }
    public void setCoinsAmount(int coinsAmount) {
        this.coinsAmount = coinsAmount;
    }
    public void addOwnedRegion(Region newRegion) {
        this.ownedRegions.add(newRegion);
    }
    public void addOwnedSecretKnowledge(SecretKnowledge newSecretKnowledge) {
        this.ownedSecretKnoledges.add(newSecretKnowledge);
    }
    public void addOwnedArtifact(Artifact newArtifact) {
        this.ownedArtifacts.add(newArtifact);
    }
    public void removeOwnedRegion(Region newRegion) {
        this.ownedRegions.remove(newRegion);
    }
    public void removeOwnedSecretKnowledge(SecretKnowledge newSecretKnowledge) {
        this.ownedSecretKnoledges.remove(newSecretKnowledge);
    }
    public void removeOwnedArtifact(Artifact newArtifact) {
        this.ownedArtifacts.remove(newArtifact);
    }
}
