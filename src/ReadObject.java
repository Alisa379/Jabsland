import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream ftests = new FileInputStream("tests.bin");
            ObjectInputStream otests = new ObjectInputStream(ftests);

            Test t1 = (Test) otests.readObject();
            Test t2 = (Test) otests.readObject();

            System.out.println(t1.getGreeting());
            System.out.println(t2.getGreeting());

            otests.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
