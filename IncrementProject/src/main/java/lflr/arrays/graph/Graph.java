package lflr.arrays.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Graph implements IGraph{
    String name;
    Map< GNode, List<GEdge>> graph;
    public Graph(String name){
        this.name = name;
        graph = new java.util.HashMap<>();
    }

    @Override
    public int getNumberOfNodes() {
        return graph.size();
    }

    @Override
    public List<GNode> getNodes() {
        return new ArrayList<>(graph.keySet());
    }

    @Override
    public int numberOfEdges() {
        int count = 0;
        for  (List<GEdge> edges : graph.values()){
            count += edges.size();
        }
        return count;
    }

    @Override
    public List<GEdge> getEdges() {
        List<GEdge> returnEdges = new ArrayList<>();
        for (List<GEdge> edges : graph.values()){
            returnEdges.addAll(edges);
        }
        return returnEdges;
    }

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

    @Override
    public int outDegree(GNode node) {
        return graph.get(node).size();
    }

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

    @Override
    public List<GEdge> outgoingEdges(GNode node) {
        return graph.getOrDefault(node, new ArrayList<>());
    }

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

    @Override
    public void addNode(GNode node) {
        graph.putIfAbsent(node, new ArrayList<>());
    }

    @Override
    public void addEdge(GNode source, GNode destination, int weight) {
        List<GEdge> edges = graph.computeIfAbsent(source, k -> new ArrayList<>());
        edges.add(new GEdge(source.getValue(), destination.getValue(), weight));
    }

    /*public void addEdge(String source, String destination, int weight) {
        List currentNodeEdges = graph.get(source);
        currentNodeEdges.add(new GEdge(source, destination, weight));
    }*/

    @Override
    public void removeNode(GNode node) {
        graph.remove(node);
        for (List<GEdge> edges : graph.values()) {
            edges.removeIf(edge -> edge.getDestination().equals(node));
        }
    }

    @Override
    public void removeEdge(GEdge edge) {
        List<GEdge> edges = graph.get(edge.getSource());
        if (edges != null) {
            edges.remove(edge);
        }
    }
}
