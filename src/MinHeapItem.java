public interface MinHeapItem {

    /**
     * get index in min heap
     * @return index
     */
    int getIndex();

    /**
     * setter for the index in the MinHeap (Note: it doesn't change the index in the MinHeap,
     * it is meant for updating the index)
     * @param index new value of index
     */
    void setIndex(int index);

    /**
     * getter for value used in MinHeap comparison
     * @return value of item
     */
    double getValue();

    /**
     * setter for value ued in MinHeap comparison
     * @param value new value
     */
    void setValue(double value);
}
