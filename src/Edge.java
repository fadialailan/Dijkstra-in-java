public class Edge {
    private Vertex from;

    private Vertex to;

    private int weight;

    /**
     * constructor
     * @param from from which vertex
     * @param to to which vertex
     * @param weight the weight of the edge
     */
    Edge(Vertex from, Vertex to, int weight){
        setFrom(from);
        setTo(to);
        this.weight = weight;
    }

    /**
     * getter for the variable from
     * @return from
     */
    public Vertex getFrom() {
        return from;
    }

    /**
     * setter for the variable from
      * @param from new value for from
     */
    public void setFrom(Vertex from) {
        this.from = from;
    }

    /**
     * getter for the variable to
     * @return to
     */
    public Vertex getTo() {
        return to;
    }

    /**
     * setter for the variable to
     * @param to new value for to
     */
    public void setTo(Vertex to) {
        this.to = to;
    }

    /**
     * getter for the variable weight
     * @return weight
     */    
    public int getWeight() {
        return weight;
    }



}
