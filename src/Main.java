public class Main {

    public static void main(String[] args){
        MinHeap heap = new MinHeap();

        heap.addItem(new Vertex(10));
        heap.addItem(new Vertex(11));
        heap.addItem(new Vertex(9));
        heap.addItem(new Vertex(4));
        heap.addItem(new Vertex(14));
        heap.addItem(new Vertex(9));
        heap.addItem(new Vertex(34));
        heap.addItem(new Vertex(6));
        heap.addItem(new Vertex(100));
        heap.printHeap();


    }
}
