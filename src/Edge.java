public class Edge {
    private Vertex from;

    private Vertex to;

    private int weight;

    Edge(Vertex from, Vertex to, int weight){
        setFrom(from);
        setTo(to);
        this.weight = weight;
    }

    public Vertex getFrom() {
        return from;
    }

    public void setFrom(Vertex from) {
        this.from = from;
    }

    public Vertex getTo() {
        return to;
    }

    public void setTo(Vertex to) {
        this.to = to;
    }

    public int getWeight() {
        return weight;
    }



}
