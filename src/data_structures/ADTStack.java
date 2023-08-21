package src.data_structures;

import java.util.EmptyStackException;

public interface ADTStack<E> {

    public void push(E element) throws NullPointerException;

    public E pop() throws EmptyStackException;

    public E peek() throws EmptyStackException;

    public boolean isEmpty();

    public int size();
}