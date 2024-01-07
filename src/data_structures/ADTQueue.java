package src.data_structures;

import java.util.NoSuchElementException;

public interface ADTQueue<E> {

    /**
     * Inserts the specified element into this queue.
     * 
     * @param element - the element to add.
     * @throws NullPointerException - if the specified element is null and this queue does not permit null elements.
     */
    public void enqueue(E element) throws NullPointerException;

    /**
     * Retrieves and removes the head of this queue.
     * 
     * @return the head of this queue.
     * @throws NoSuchElementException - if this queue is empty.
     */
    public E dequeue() throws NoSuchElementException;

    /**
     * Tests if this queue is empty.
     * 
     * @return true if and only if this stack contains no items; false otherwise.
     */
    public boolean isEmpty();

    /**
     * Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
     * 
     * @return the head of this queue, or null if this queue is empty.
     */
    public E peek();

    /**
     * Retrieves and removes the head of this queue, or returns null if this queue is empty.
     * 
     * @return the head of this queue, or null if this queue is empty.
     */
    public E poll();

    /**
     * Returns the number of elements in this queue.
     * 
     * @return the number of elements in this stack.
     */
    public int size();
}