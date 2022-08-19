import java.util.ArrayList;

public class MinHeap {
    public final ArrayList<MinHeapItem> heap_data;

    MinHeap(){
        heap_data = new ArrayList<>();
    }

    public void addItem(MinHeapItem item){
        int index = heap_data.size();
        heap_data.add(item);
        item.setIndex(index);
        heapUp(index);
    }

    public void heapUp(int index){
        if (index == 0){
            return;
        }
        int parent_index = getParent(index);
        double item_value = heap_data.get(index).getValue();
        double parent_value = heap_data.get(parent_index).getValue();
        if (item_value < parent_value) {
            swap(index, parent_index);
            heapUp(parent_index);
        }

    }

    private void swap(int index1, int index2){
        MinHeapItem item1 = heap_data.get(index1);
        MinHeapItem item2 = heap_data.get(index2);
        item1.setIndex(index2);
        item2.setIndex(index1);
        heap_data.set(index1,item2);
        heap_data.set(index2,item1);
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

    public MinHeapItem pop(){
        MinHeapItem output = heap_data.get(0);

        MinHeapItem newTop = heap_data.get(heap_data.size()-1);
        newTop.setIndex(0);
        heap_data.set(0, heap_data.get(heap_data.size()-1));
        heap_data.remove(heap_data.size()-1);

        if (heap_data.size() > 0){
            heapDown(0);
        }
        output.setIndex(-1);
        return output;
    }

    public void heapDown(int index){
        int right_index = getRightChild(index);
        int left_index = getLeftChild(index);

        int heap_size = heap_data.size();
        double this_value = heap_data.get(index).getValue();
        double right_value, left_value;

        if (left_index >= heap_size) {
            left_value = this_value;
        } else {
            left_value = heap_data.get(left_index).getValue();
        }
        if (right_index >= heap_size) {
            right_value = this_value;
        } else {
            right_value = heap_data.get(right_index).getValue();
        }

        if (this_value <= right_value && this_value <= left_value){
            return;
        }
        else if (right_value < left_value){
            swap(index, right_index);
            heapDown(right_index);
        }
        else {
            swap(index, left_index);
            heapDown(left_index);
        }



    }

    public void printHeap(){
        for (MinHeapItem item: heap_data){
            System.out.print(item.getValue());
            System.out.println(" ");
        }
    }

    public void setValue(int index, double value){
        MinHeapItem item = heap_data.get(index);
        double current_value = item.getValue();
        item.setValue(value);
        if (current_value > value){
            heapUp(index);
        }
        if (current_value < value){
            heapDown(index);
        }
    }

    public boolean isEmpty(){
        return heap_data.size() == 0;
    }

    public void printHeapSort(){
        while (heap_data.size() > 0){
            System.out.print(pop().getValue());
            System.out.print(" ");
        }
    }





}
