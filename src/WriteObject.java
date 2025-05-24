import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();

        t1.setGreeting("fghj");


        try {
            FileOutputStream ftests = new FileOutputStream("tests.bin");
            ObjectOutputStream otests = new ObjectOutputStream(ftests);

            otests.writeObject(t1);
            otests.writeObject(t2);

            otests.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
