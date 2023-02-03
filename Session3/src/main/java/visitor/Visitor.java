package visitor;

public interface Visitor {

    void visitInteger(IntegerElement number);
    void visitDouble(DoubleElement number);

}
