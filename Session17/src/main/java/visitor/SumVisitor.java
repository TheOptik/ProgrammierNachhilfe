package visitor;

public class SumVisitor implements Visitor<Integer> {

    int summe = 0;

    @Override
    public void visit(Integer current) {
        summe += current;
    }
}
