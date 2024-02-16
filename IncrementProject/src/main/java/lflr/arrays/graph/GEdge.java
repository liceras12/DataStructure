package lflr.arrays.graph;

public class GEdge {
    private GNode source;
    private GNode destination;
    private int weight;

    public GEdge(GNode source, GNode destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public GNode getSource() {
        return source;
    }

    public GNode getDestination() {
        return destination;
    }

    public int getWeight() {
        return weight;
    }
}
