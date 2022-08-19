public class Main {

    public static void main(String[] args){
        Graph g = new Graph(5);

        g.addEdge(0,1,4);
        g.addEdge(1,0,4);
        g.addEdge(0,3,2);
        g.addEdge(3,0,2);
        g.addEdge(1,2,3);
        g.addEdge(2,1,3);
        g.addEdge(1,4,4);
        g.addEdge(4,1,4);
        g.addEdge(3,4,7);
        g.addEdge(4,3,7);
        g.addEdge(3,2,0);
        g.addEdge(2,3,0);
        g.addEdge(2,4,1);
        g.addEdge(4,2,1);

        System.out.println(g.dijkstra(3,1));

    }
}
