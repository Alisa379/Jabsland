import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;


public class Game implements Serializable  {
    public static List<Region> regions = new ArrayList<>();
    public static List<Artifact> artifacts = new ArrayList<>();
    public static List<SecretKnowledge> secretKnowledges = new ArrayList<>();

    private int yearsSinceCreationOfTheWorld;
    private int yearMark;
    private int month;

    public Game() {
        this.yearsSinceCreationOfTheWorld = 0;
        this.yearMark = 0;
        this.month = 0;
    }

    public int getYearsSinceCreationOfTheWorld() {
        return yearsSinceCreationOfTheWorld;
    }

    public int getYearMark() {
        return yearMark;
    }

    public int getMonth() {
        return month;
    }

    public static List<Region> getRegions() {
        return regions;
    }

    public static List<Artifact> getArtifacts() {
        return artifacts;
    }

    public static List<SecretKnowledge> getSecretKnowledges() {
        return secretKnowledges;
    }


    //    разнесено в разные механики на возможность дополнений
    public void successfulAttackRegion(Player player, Region to) {
        to.toOwned(player);
    }

    public void successfulNegotiateRegion(Player player, Region to) {
        to.toOwned(player);
    }

    public String loosingRegion(Player player) {
        Random random = new Random();
        int max = (player.getOwnedRegions().size());
        int number;
        if (max > 1) {
            number = random.nextInt(max -1) + 1;
        }
        else {
            number = random.nextInt(max);
        }
        String name = player.getOwnedRegions().get(number).getName();
        player.getOwnedRegions().remove(number);
        return name;
    }

    public void nextTurn(Player player) {
        // Обновление бюджета: count coints считает регион.профит - поддержание
        player.setCoinsAmount(player.getCoinsAmount() + player.countCoins());

        // Спавн мирных жаб по всем нашим регионам
        for (Region r: player.getOwnedRegions()) {
            r.endMonth();
        }

        // Временная логика
        month++;
        if (month >= 12) {
            month = 0;
            this.yearsSinceCreationOfTheWorld++;
            this.yearMark++;
        }


    }

    public boolean checkCoins(Player player) {
        if (player.getCoinsAmount() < 0) {

            return false;
        }
        else {
            return true;
        }
    }
}

