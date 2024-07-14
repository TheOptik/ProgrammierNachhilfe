package visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        SumVisitor visitor = new SumVisitor();

        traverse(list, visitor);

        System.out.println(visitor.summe);
    }

    private static void traverse(List<Integer> list, SumVisitor visitor) {
        for (Integer i : list) {
            visitor.visit(i);
        }
    }

}
