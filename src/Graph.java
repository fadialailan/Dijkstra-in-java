import java.util.ArrayList;

public class Graph {
    ArrayList<Vertex> vertices;

    Graph(int vertex_count){
        vertices = new ArrayList<>();
        for (int i = 0; i < vertex_count; i++){
            vertices.add(new Vertex(i, 0));
        }
    }

    public void addVertex(){
        vertices.add(new Vertex(vertices.size(),0));
    }

    public void addEdge(int from, int to, int weight){
        Edge edge = new Edge(vertices.get(from), vertices.get(to), weight);
        vertices.get(from).addEdge(edge);
    }

    public ArrayList<Integer> dijkstra(int from, int to){
        MinHeap minHeap = new MinHeap();
        ArrayList<Integer> path = new ArrayList<>();

        for (Vertex vertex : vertices){
            vertex.setValue(Double.NEGATIVE_INFINITY);
            vertex.setPreviousVertex(null);
            minHeap.addItem(vertex);
        }
        Vertex first_vertex = vertices.get(from);
        first_vertex.setValue(0);
        minHeap.addItem(first_vertex);

        boolean foundIt = false;

        while (!minHeap.isEmpty()) {
            Vertex current_vertex = (Vertex) minHeap.pop();

            if (current_vertex.getId() == to) {
                foundIt = true;
                break;
            }

            for (Edge edge : current_vertex.getEdges()){
                Vertex toVertex = edge.getTo();
                double current_distance = toVertex.getValue();
                double other_distance = current_vertex.getValue()+edge.getWeight();
                if (other_distance < current_distance){

                    toVertex.setPreviousVertex(current_vertex);
                    if (toVertex.getIndex() == -1){
                        toVertex.setValue(other_distance);
                        minHeap.addItem(toVertex);
                    }
                    else {
                        minHeap.setValue(toVertex.getIndex(), other_distance);
                    }
                }

            }

        }

        if (!foundIt){
            return null;
        }

        Vertex current_vertex = vertices.get(to);

        while (current_vertex != null){
            path.add(0, current_vertex.getId());
            current_vertex = current_vertex.getPreviousVertex();
        }

        return path;


    }
}
