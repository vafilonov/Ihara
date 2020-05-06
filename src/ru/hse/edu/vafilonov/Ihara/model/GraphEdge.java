package ru.hse.edu.vafilonov.Ihara.model;

public class GraphEdge extends AbstractGraphElement {
    private GraphNode origin;
    private GraphNode tail;
    private double weight = 0.0;

    public GraphEdge(GraphNode origin, GraphNode tail){
        this.origin = origin;
        this.tail = tail;
    }

    @Override
    public void deleteElement(){
        origin = null;
        tail = null;
    }

    public void setWeight(double w){
        weight = w;
    }

    public double getWeight() {
        return weight;
    }

    public GraphNode getOrigin() {
        return origin;
    }

    public GraphNode getTail() {
        return tail;
    }

    public boolean contains(GraphNode node){
        return origin == node || tail == node;
    }
}