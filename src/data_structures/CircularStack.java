package src.data_structures;

import java.util.EmptyStackException;

public class CircularStack<E> implements ADTStack<E> {

    private ADTList<E> stack = new CircularLinkedList<E>();
    
    @Override
    public void push(E element) {
        stack.add(0, element);
    }

    @Override
    public E pop() {
        if (isEmpty())
            throw new EmptyStackException();
        return stack.remove(0);        
    }

    @Override
    public E peek() {
        if (isEmpty())
            throw new EmptyStackException();
        return stack.get(0);
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public int size() {
        return stack.size();
    }
}