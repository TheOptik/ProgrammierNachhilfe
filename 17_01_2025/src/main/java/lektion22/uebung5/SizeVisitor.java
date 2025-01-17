package lektion22.uebung5;

public class SizeVisitor<T> implements Baum.Visitor<T> {
    public int nodeCounter = 0;

    @Override
    public void visit(Baum.Knoten<T> current) {
        nodeCounter++;
    }


}
