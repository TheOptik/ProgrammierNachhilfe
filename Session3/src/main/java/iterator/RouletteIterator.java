package iterator;

import java.util.Iterator;

public class RouletteIterator implements Iterator<Integer> {

    int zaehler = 0;

    @Override
    public boolean hasNext(){
        return zaehler < 3;
    }


    @Override
    public Integer next(){
        Integer randomZahl = (int)(Math.random() * 36 + 1);

        if(randomZahl == 0){
            zaehler++;
        }

        return randomZahl;
    }


}
