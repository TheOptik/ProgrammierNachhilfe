package tcp.streams.objectstreams;

import java.io.Serializable;
import java.util.List;

public class ListPayload implements Serializable {

    private List<Integer> content;

    public ListPayload(List<Integer> content) {
        this.content = content;
    }

    public List<Integer> getContent() {
        return content;
    }
}
