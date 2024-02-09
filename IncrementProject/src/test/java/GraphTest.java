import lflr.arrays.graph.GNode;
import lflr.arrays.graph.Graph;

public class GraphTest {
    public static void main(String[] args) {
        Graph graph = new Graph("My graph");
        GNode a = new GNode("A");
        GNode b = new GNode("B");
        GNode c = new GNode("C");

        graph.addNode(a);
        graph.addNode(b);
        graph.addNode(c);
    }
}
