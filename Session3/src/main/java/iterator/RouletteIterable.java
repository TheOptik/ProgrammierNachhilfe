package iterator;

import java.util.Iterator;

public class RouletteIterable implements Iterable<Integer>{

    @Override
    public Iterator<Integer> iterator(){
        return new RouletteIterator();
    }


}
