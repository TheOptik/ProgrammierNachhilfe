package lektion22.uebung5;

public class Baum<E extends Comparable<E>> {

    public static class Knoten<E> {
        Knoten<E> left;
        Knoten<E> right;
        E content;



    }

    public interface Visitor<T>{
        public void visit(Knoten<T> current);
    }

    Knoten<E> root;

    public void einfuegen(E content) {
        if(root == null){
            root = new Knoten<>();
            root.content = content;
        }
        else {
            knotenEinfuegen(content,root);
        }
    }

    private void knotenEinfuegen(E content,Knoten<E> k){

        if (k.left == null){
                k.left = new Knoten<>();
                k.left.content = content;
                return;
            }
            else if(k.right == null){
                k.right = new Knoten<>();
                k.right.content = content;
                return;
            }
            knotenEinfuegen(content,k.left);
        }

    protected void traversiere(Visitor<E> visitor) {
        if (root == null) return;
        else traversiere(root, visitor);
    }

    protected void traversiere(Knoten<E> current, Visitor<E> visitor) {
        if (current.left != null) traversiere(current.left, visitor);
        visitor.visit(current);
        if (current.right != null) traversiere(current.right, visitor);
    }

    public int size(){
        SizeVisitor<E> v = new SizeVisitor<>();
        traversiere(v);
        return v.nodeCounter;
    }

    public static void main(String[] args) {
        Baum<String> b = new Baum<String>();

        for(int i = 0;i<5;i++) {
            b.einfuegen("hallo" + i);
            System.out.println(b.size());
        }
        b.traversiere(new Visitor<String>() {
            @Override
            public void visit(Knoten<String> current) {
                System.out.println(current.content);
            }
        });
    }


}
