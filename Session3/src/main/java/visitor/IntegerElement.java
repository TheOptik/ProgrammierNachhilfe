package visitor;

public class IntegerElement implements Element{

    private int number;

    public IntegerElement(int number) {
        this.number = number;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitInteger(this);
    }

    public int getNumber() {
        return number;
    }
}
