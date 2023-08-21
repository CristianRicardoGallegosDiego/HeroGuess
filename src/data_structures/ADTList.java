package src.data_structures;

public interface ADTList<E> {
    
    /**
     * Appends the specified element to the end of this list.
     * 
     * @param element - element to be appended to this list.
     */
    public void add(E element);

    /**
     * 
     * 
     * @param index
     * @param element
     */
    public void add(int index, E element) throws IndexOutOfBoundsException, NullPointerException;

    public E remove(int index);

    public E get(int index);

    public boolean contains(E element);

    public void clear();

    public int size();

    public boolean isEmpty();
}