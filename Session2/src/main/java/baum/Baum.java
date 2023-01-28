package baum;

public class Baum {

    public Knoten root;

    public void einfuegen(Knoten neuerKnoten) {
        if (root == null) {
            root = neuerKnoten;
            return;
        }
        einguegenUnterKnoten(root, neuerKnoten);
    }

    public void einguegenUnterKnoten(Knoten virtuellerRoot, Knoten neuerKnoten) {
        if (virtuellerRoot.links == null) {
            virtuellerRoot.links = neuerKnoten;
            return;
        }

        if (virtuellerRoot.rechts == null) {
            virtuellerRoot.rechts = neuerKnoten;
            return;
        }

        einguegenUnterKnoten(virtuellerRoot.links, neuerKnoten);
    }

}
