package visitor;

public class AddingVisitor implements Visitor{

    private double sum = 0;

    @Override
    public void visitInteger(IntegerElement number) {
        sum += number.getNumber();
    }

    @Override
    public void visitDouble(DoubleElement number) {
        sum += number.getNumber();
    }

    public double getSum() {
        return sum;
    }
}
