import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;


public class Continue implements Serializable  {
    public static void main(String[] args) {
        try {
            FileInputStream f = new FileInputStream("data.bin");
            ObjectInputStream o = new ObjectInputStream(f);

            Object object = o.readObject();
            Game game = new Game();
            if (object instanceof Game) {
                game = (Game) object;
                System.out.println(game.getMonth());
            }
            else{
                System.out.println("не зашли");
            }

//            Player player = (Player) o.readObject();
//            Info info = (Info) o.readObject();

//            Region JB = (Region) o.readObject();
//            Region N1 = (Region) o.readObject();
//            Region W1 = (Region) o.readObject();
//            Region S1 = (Region) o.readObject();
//            Region E1 = (Region) o.readObject();
//            Region N2 = (Region) o.readObject();
//            Region W2 = (Region) o.readObject();
//            Region NW2 = (Region) o.readObject();
//            Region NE2 = (Region) o.readObject();
//            Region S2 = (Region) o.readObject();
//            Region E2 = (Region) o.readObject();
//            Region SW2 = (Region) o.readObject();
//            Region SE2 = (Region) o.readObject();
//            Region N3 = (Region) o.readObject();
//            Region W3 = (Region) o.readObject();
//            Region S3 = (Region) o.readObject();
//            Region E3 = (Region) o.readObject();
//            Region NW3 = (Region) o.readObject();
//            Region NE3 = (Region) o.readObject();
//            Region SW3 = (Region) o.readObject();
//            Region SE3 = (Region) o.readObject();
//
//            SecretKnowledge SecretJB = (SecretKnowledge) o.readObject();
//            SecretKnowledge SecretN1 = (SecretKnowledge) o.readObject();
//            SecretKnowledge SecretW1 = (SecretKnowledge) o.readObject();
//            SecretKnowledge SecretS1 = (SecretKnowledge) o.readObject();
//            SecretKnowledge SecretE1 = (SecretKnowledge) o.readObject();
//            SecretKnowledge SecretN2 = (SecretKnowledge) o.readObject();
//            SecretKnowledge SecretW2 = (SecretKnowledge) o.readObject();
//            SecretKnowledge SecretNW2 = (SecretKnowledge) o.readObject();
//            SecretKnowledge SecretNE2 = (SecretKnowledge) o.readObject();
//            SecretKnowledge SecretS2 = (SecretKnowledge) o.readObject();
//            SecretKnowledge SecretE2 = (SecretKnowledge) o.readObject();
//            SecretKnowledge SecretSW2 = (SecretKnowledge) o.readObject();
//            SecretKnowledge SecretSE2 = (SecretKnowledge) o.readObject();
//            SecretKnowledge SecretN3 = (SecretKnowledge) o.readObject();
//            SecretKnowledge SecretW3 = (SecretKnowledge) o.readObject();
//            SecretKnowledge SecretS3 = (SecretKnowledge) o.readObject();
//            SecretKnowledge SecretE3 = (SecretKnowledge) o.readObject();
//            SecretKnowledge SecretNW3 = (SecretKnowledge) o.readObject();
//            SecretKnowledge SecretNE3 = (SecretKnowledge) o.readObject();
//            SecretKnowledge SecretSW3 = (SecretKnowledge) o.readObject();
//            SecretKnowledge SecretSE3 = (SecretKnowledge) o.readObject();
//
//            Artifact AJB = (Artifact) o.readObject();
//            Artifact AN1 = (Artifact) o.readObject();
//            Artifact AW1 = (Artifact) o.readObject();
//            Artifact AS1 = (Artifact) o.readObject();
//            Artifact AE1 = (Artifact) o.readObject();
//            Artifact AN2 = (Artifact) o.readObject();
//            Artifact AW2 = (Artifact) o.readObject();
//            Artifact ANW2 = (Artifact) o.readObject();
//            Artifact ANE2 = (Artifact) o.readObject();
//            Artifact AS2 = (Artifact) o.readObject();
//            Artifact AE2 = (Artifact) o.readObject();
//            Artifact ASW2 = (Artifact) o.readObject();
//            Artifact ASE2 = (Artifact) o.readObject();
//            Artifact AN3 = (Artifact) o.readObject();
//            Artifact AW3 = (Artifact) o.readObject();
//            Artifact AS3 = (Artifact) o.readObject();
//            Artifact AE3 = (Artifact) o.readObject();
//            Artifact ANW3 = (Artifact) o.readObject();
//            Artifact ANE3 = (Artifact) o.readObject();
//            Artifact ASW3 = (Artifact) o.readObject();
//            Artifact ASE3 = (Artifact) o.readObject();


            o.close();
            //UX ux = new UX(game, player, info);
            //ux.run();
        }
        catch (Exception e) {
            e.printStackTrace();
        }


    }
}
