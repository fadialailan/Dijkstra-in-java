public class Vertex implements MinHeapItem{
    boolean discovered;
    private int index;

    private int value;

    Vertex(int value){
        discovered = false;
        this.value = value;
    }

    @Override
    public void setValue(int value) {
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
    public int getValue() {
        return value;
    }
}
