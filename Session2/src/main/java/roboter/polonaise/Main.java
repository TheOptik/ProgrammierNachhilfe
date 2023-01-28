package roboter.polonaise;

public class Main {

    public static void main(String[] args) {

        Polonaise polonaise = new Polonaise();

        Roboter r1 = new Roboter("Erster roboter.polonaise.Roboter", 1);

        polonaise.anhaengen(r1);
        polonaise.anhaengen(new Roboter("Zweiter roboter.polonaise.Roboter", 2));
        polonaise.anhaengen(new Roboter("Dritter roboter.polonaise.Roboter", 3));
        polonaise.anhaengen(new Roboter("Vierter roboter.polonaise.Roboter", 5));
        polonaise.anhaengen(new Roboter("Fünfter roboter.polonaise.Roboter", 4));

        polonaise.vorstellen();
    }

}


