package roboter.polonaise;

public class Roboter {

    private String name;
    private int hoehe;
    private Roboter next;

    public Roboter(String name, int hoehe) {
        this.name = name;
        this.hoehe = hoehe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoehe() {
        return hoehe;
    }

    public void setHoehe(int hoehe) {
        this.hoehe = hoehe;
    }

    public Roboter getNext() {
        return next;
    }

    public void setNext(Roboter next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Hallo ich bin " + name + ", ich bin " + hoehe + " Zentimeter groß";
    }

}
