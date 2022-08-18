import java.util.ArrayList;
import java.util.Collection;

public class Vertex implements MinHeapItem{
    boolean discovered;
    private int index;

    private double value;

    private final ArrayList<Edge> edges;

    private Vertex previousVertex;

    private int id;


    Vertex(int id,int value){
        discovered = false;
        this.value = value;
        this.id = id;
        previousVertex = null;
        edges = new ArrayList<>();
        index = -1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addEdge(Edge edge){
        edges.add(edge);
    }

    public Collection<Edge> getEdges(){
        return edges;
    }

    public Vertex getPreviousVertex() {
        return previousVertex;
    }

    public void setPreviousVertex(Vertex previousVertex) {
        this.previousVertex = previousVertex;
    }

    @Override
    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public int getIndex() {
        return index;
    }

    @Override
    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public double getValue() {
        return value;
    }
}
