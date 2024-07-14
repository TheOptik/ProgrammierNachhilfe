package visitor;

public class SizeVisitor<T> implements Visitor<T>{
    int size = 0;

    @Override
    public void visit(T current) {
        size++;
    }
}
