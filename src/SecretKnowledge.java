import java.io.Serializable;

public class SecretKnowledge extends LocalLoot implements Serializable {
    public SecretKnowledge(String name, String info, String levelUpCAst, int levelUpFactor) {
        super(name, info, levelUpCAst, levelUpFactor);
    }
};
