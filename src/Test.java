import java.io.Serializable;

public class Test implements Serializable {
    public String greeting;
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
    public String getGreeting() {
        return this.greeting;
    }
}
