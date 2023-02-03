package visitor;

public class FormatingVisitor implements Visitor{

    private String result = "";

    @Override
    public void visitInteger(IntegerElement number) {
        result += " " + Integer.toBinaryString(number.getNumber());
    }

    @Override
    public void visitDouble(DoubleElement number) {
        result += " " + Double.toHexString(number.getNumber());
    }

    public String getResult() {
        return result;
    }
}
