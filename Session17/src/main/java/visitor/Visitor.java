package visitor;

public interface Visitor<T> {
    public void visit(T current);
}
