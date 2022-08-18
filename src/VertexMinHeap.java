import java.util.ArrayList;

public class VertexMinHeap {
    private ArrayList<Vertex> vertex_heap;

    VertexMinHeap(){

    }

    public void addVertex(Vertex vertex){

    }

    public int getParent(int index) {
        return (index-1)/2;
    }

    public int getRightChild(int index) {
        return index*2+2;
    }

    public int getLeftChild(int index) {
        return index*2+1;
    }


}
