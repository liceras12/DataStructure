package lflr.arrays.graph;

import java.util.List;

public interface IGraph {
    /**
     * @return the number of nodes in the graph
     */
    int getNumberOfNodes();

    /**
     * @return the list of nodes in the graph
     */
    List<GNode> getNodes();

    /**
     * @return the number of edges in the graph
     */
    int numberOfEdges();

    /**
     * @return the list of edges in the graph
     */
    List<GEdge> getEdges();

    /**
     * @param source
     * @param destination
     * @return the edge between source and destination
     */
    GEdge getEdge(GNode source, GNode destination);

    /**
     * @param node
     * @return the number of edges going out of the node
     */
    int outDegree(GNode node);

    /**
     * @param node
     * @return the number of edges coming into the node
     */
    int inDegree(GNode node);

    /**
     * @param node
     * @return the list of edges going out of the node
     */
    List<GEdge> outgoingEdges(GNode node);

    /**
     * @param node
     * @return the list of edges coming into the node
     */
    List<GEdge> incomingEdges(GNode node);

    /**
     * @param node insert the node into the graph
     */
    void addNode(GNode node);

    /**
     * @param source
     * @param destination
     * @param weight add an edge between source and destination with the given weight
     */
    void addEdge(GNode source, GNode destination, int weight);

    /**
     * @param node remove the node from the graph
     */
    void removeNode(GNode node);

    /**
     * @param edge remove the edge from the graph
     */
    void removeEdge(GEdge edge);

}
