package visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Element> elements = new ArrayList<>();
        elements.add(new IntegerElement(5));
        elements.add(new DoubleElement(10.2));

        AddingVisitor visitor = new AddingVisitor();

        for (Element element : elements) {
            element.accept(visitor);
        }

        System.out.println(visitor.getSum());

        FormatingVisitor formatingVisitor = new FormatingVisitor();

        for (Element element : elements) {
            element.accept(formatingVisitor);
        }

        System.out.println(formatingVisitor.getResult());

    }

}
