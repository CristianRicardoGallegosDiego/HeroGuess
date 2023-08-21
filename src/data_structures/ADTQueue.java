package src.data_structures;

import java.util.NoSuchElementException;

public interface ADTQueue<E> {

    public void enqueue(E element) throws NullPointerException;

    public E dequeue() throws NoSuchElementException;

    public boolean isEmpty();

    public E peek();

    public E poll();

    public int size();
}