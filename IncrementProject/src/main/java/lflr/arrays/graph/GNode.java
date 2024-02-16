package lflr.arrays.graph;

public class GNode {
    private String value;

    public GNode(String value) {
        this.value = value;
    }


    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
