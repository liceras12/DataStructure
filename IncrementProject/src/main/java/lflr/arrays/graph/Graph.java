package lflr.arrays.graph;

import java.util.List;
import java.util.Map;

public class Graph implements IGraph{
    String name;
    Map< GNode, List<GEdge>> graph;
    public Graph(String name){
        this.name = name;
        graph = new java.util.HashMap<>();
    }

    /**
     * @return
     */
    @Override
    public int getNumberOfNodes() {
        return 0;
    }

    /**
     * @return
     */
    @Override
    public List<GNode> getNodes() {
        return null;
    }

    /**
     * @return
     */
    @Override
    public int numberOfEdges() {
        return 0;
    }

    /**
     * @return
     */
    @Override
    public List<GEdge> getEdges() {
        List<GEdge> returnEdges = new java.util.ArrayList<>();
        for (GNode key : graph.keySet()){
            List<GEdge> edges = graph.get(key);
            returnEdges.addAll(edges);
        }
        return returnEdges;
    }

    /**
     * @param source
     * @param destination
     * @return
     */
    @Override
    public GEdge getEdge(GNode source, GNode destination) {
        List<GEdge> edges = graph.get(source);
        for (GEdge edge : edges){
            if (edge.getDestination().equals(destination)){
                return edge;
            }
        }
        return null;
    }

    /**
     * @param node
     * @return
     */
    @Override
    public int outDegree(GNode node) {
        return graph.get(node).size();
    }

    /**
     * @param node
     * @return
     */
    @Override
    public int inDegree(GNode node) {
        int counter = 0;
        for (GNode key : graph.keySet()){
            List<GEdge> edges = graph.get(key);
            for (GEdge edge : edges){
                if (edge.getDestination().equals(node)){
                    counter++;
                }
            }
        }
        return counter;
    }

    /**
     * @param node
     * @return
     */
    @Override
    public List<GEdge> outgoingEdges(GNode node) {
        return graph.get(node);
    }

    /**
     * @param node
     * @return
     */
    @Override
    public List<GEdge> incomingEdges(GNode node) {
        for (GNode key : graph.keySet()){
            List<GEdge> edges = graph.get(key);
            for (GEdge edge : edges){
                if (edge.getDestination().equals(node)){
                    return edges;
                }
            }
        }
        return null;
    }

    /**
     * @param node
     */
    @Override
    public void addNode(GNode node) {
        graph.putIfAbsent(node, new java.util.ArrayList<>());
    }

    @Override
    public void addEdge(GNode source, GNode destination, int weight) {

    }

    /**
     * @param source
     * @param destination
     * @param weight
     */
   /* @Override
    public void addEdge(String source, String destination, int weight) {
        List currentNodeEdges = graph.get(source);
        currentNodeEdges.add(new GEdge(source, destination, weight));
    }*/

    /**
     * @param node
     */
    @Override
    public void removeNode(GNode node) {
        graph.remove(node);
    }

    /**
     * @param edge
     */
    @Override
    public void removeEdge(GEdge edge) {
        List<GEdge> currentEdges = graph.get(edge.getSource());
        currentEdges.remove(edge);
    }
}
