import lflr.arrays.graph.GNode;
import lflr.arrays.graph.Graph;
import org.junit.jupiter.api.Test;

public class GraphTest {
    @Test
    public void testGraph() {
        Graph graph = new Graph("Test");
        graph.addNode(new GNode("A"));
        graph.addNode(new GNode("B"));
        graph.addNode(new GNode("C"));
        graph.addNode(new GNode("D"));
        graph.addEdge(new GNode("A"), new GNode("B"), 1);
        graph.addEdge(new GNode("A"), new GNode("C"), 2);
        graph.addEdge(new GNode("B"), new GNode("D"), 3);
        graph.addEdge(new GNode("C"), new GNode("D"), 4);
        System.out.println(graph);
    }
}
