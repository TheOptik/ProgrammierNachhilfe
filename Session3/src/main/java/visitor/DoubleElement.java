package visitor;

public class DoubleElement implements Element {

    private double number;

    public DoubleElement(double number) {
        this.number = number;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitDouble(this);
    }

    public double getNumber() {
        return number;
    }
}
