import java.util.ArrayList;
import java.util.Collection;

public class Vertex implements MinHeapItem{
    boolean discovered;
    private int index;

    private double value;

    private final ArrayList<Edge> edges;

    private Vertex previousVertex;

    private int id;


    /**
     * constructor
     * @param id vertex unique ID
     * @param value the value of the vertex (for MinHeap)
     */
    Vertex(int id,int value){
        discovered = false;
        this.value = value;
        this.id = id;
        previousVertex = null;
        edges = new ArrayList<>();
        index = -1;
    }

    /**
     * getter for the variable id
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * setter for the variable id
     * @param id new value for id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * adds an edge to the adjacency list
     * @param edge new edge
     */
    public void addEdge(Edge edge){
        edges.add(edge);
    }


    /**
     *
     * @return a copy of the list of edges
     */
    public ArrayList<Edge> getEdges(){
        return (ArrayList<Edge>) edges.clone();
    }

    /**
     * getter for previousVertex
     * @return previousVertex
     */
    public Vertex getPreviousVertex() {
        return previousVertex;
    }

    /**
     * setter for previousVertex
     * @param previousVertex new value of previousVertex
     */
    public void setPreviousVertex(Vertex previousVertex) {
        this.previousVertex = previousVertex;
    }

    /**
     * setter for value ued in MinHeap comparison
     * @param value new value
     */
    @Override
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * get index in min heap
     * @return index
     */
    @Override
    public int getIndex() {
        return index;
    }

    /**
     * setter for the index in the MinHeap (Note: it doesn't change the index in the MinHeap,
     * it is meant for updating the index)
     * @param index new value of index
     */
    @Override
    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * getter for value used in MinHeap comparison
     * @return value of item
     */
    @Override
    public double getValue() {
        return value;
    }
}
