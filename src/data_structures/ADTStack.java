package src.data_structures;

import java.util.EmptyStackException;

public interface ADTStack<E> {

    /**
     * Pushes an item onto the top of this stack.
     * 
     * @param element - the item to be pushed onto this stack.
     * @throws NullPointerException - if the specified element is null and this list does not permit null elements.
     */
    public void push(E element) throws NullPointerException;

    /**
     * Removes the object at the top of this stack and returns that object as the value of this function.
     * 
     * @return The object at the top of this stack (the last item of the Vector object).
     * @throws EmptyStackException - if this stack is empty.
     */
    public E pop() throws EmptyStackException;

    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     * 
     * @return the object at the top of this stack (the last item of the Vector object).
     * @throws EmptyStackException - if this stack is empty.
     */
    public E peek() throws EmptyStackException;

    /**
     * Tests if this stack is empty.
     * 
     * @return true if and only if this stack contains no items; false otherwise.
     */
    public boolean isEmpty();

    /**
     * Returns the number of elements in this stack.
     * 
     * @return the number of elements in this stack.
     */
    public int size();
}