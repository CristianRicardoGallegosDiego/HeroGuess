package src.data_structures;

import java.util.NoSuchElementException;

public class CircularQueue<E> implements ADTQueue<E> {

    private ADTList<E> queue = new CircularLinkedList<E>();

    @Override
    public void enqueue(E element) {
        queue.add(element);
    }

    @Override
    public E dequeue() {
        if (isEmpty())
            throw new NoSuchElementException("The queue is empty.");
        return queue.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public E peek() {
        return !isEmpty()? queue.get(0) : null;
    }

    @Override
    public E poll() {
        return !isEmpty()? queue.remove(0) : null;
    }

    @Override
    public int size() {
        return queue.size();
    }
}