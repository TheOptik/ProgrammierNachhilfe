package roboter.polonaise;

public class Polonaise {

    private Roboter start;

    public Polonaise() {
        start = null;
    }

    public void anhaengen(Roboter neuerRoboter) {

        if (start == null) {
            start = neuerRoboter;
            return;
        }

        if (start.getNext() == null) {
            if (start.getHoehe() < neuerRoboter.getHoehe()) {
                start.setNext(neuerRoboter);
            } else if (start.getHoehe() > neuerRoboter.getHoehe()) {
                neuerRoboter.setNext(start);
                start = neuerRoboter;
            }
            return;
        }

        Roboter oldTemp = start;
        Roboter temp = start.getNext();

        while (temp != null) {

            if (temp.getHoehe() > neuerRoboter.getHoehe()) {
                oldTemp.setNext(neuerRoboter);
                neuerRoboter.setNext(temp);
                break;
            } else {
                oldTemp = temp;
                temp = temp.getNext();
            }
            if (temp == null) {
                oldTemp.setNext(neuerRoboter);
            }
        }

    }

    public void vorstellen() {

        Roboter current = start;

        while (current != null) {
            System.out.println(current.toString());
            current = current.getNext();
        }

    }

}
