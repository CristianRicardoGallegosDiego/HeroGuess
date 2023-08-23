package src.data_structures;

public interface ADTList<E> {
    
    /**
     * Appends the specified element to the end of this list.
     * 
     * @param element - element to be appended to this list.
     */
    public void add(E element);

    /**
     * Inserts the specified element at the specified position in this list (optional operation). 
     * Shifts the element currently at that position (if any) and any subsequent elements to the right 
     * (adds one to their indices).
     * 
     * @param index - index at which the specified element is to be inserted.
     * @param element - element to be inserted
     * @throws IndexOutOfBoundsException - if the index is out of range (index < 0 || index > size()).
     * @throws NullPointerException - if the specified element is null and this list does not permit null elements
     */
    public void add(int index, E element) throws IndexOutOfBoundsException, NullPointerException;

    /**
     * Removes the element at the specified position in this list (optional operation). Shifts any 
     * subsequent elements to the left (subtracts one from their indices). Returns the element 
     * that was removed from the list.
     * 
     * @param index - the index of the element to be removed.
     * @return the element previously at the specified position.
     * @throws IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size()).
     */
    public E remove(int index) throws IndexOutOfBoundsException;

    /**
     * Returns the element at the specified position in this list.
     * 
     * @param index - index of the element to return.
     * @return the element at the specified position in this list.
     * @throws - if the index is out of range (index < 0 || index >= size())
     */
    public E get(int index) throws IndexOutOfBoundsException;

    /**
     * Returns true if this list contains the specified element. More formally, returns true 
     * if and only if this list contains at least one element e such that (o==null ? e==null : o.equals(e)).
     * 
     * @param element element whose presence in this list is to be tested.
     * @return true if this list contains the specified element
     * @throws NullPointerException - if the specified element is null and this list does not permit null elements (optional).
     */
    public boolean contains(E element) throws NullPointerException;

    /**
     * Removes all of the elements from this list. The list will be empty after this call returns.
     */
    public void clear();

    /**
     * Returns the number of elements in this list.
     * 
     * @return the number of elements in this list.
     */
    public int size();

    /**
     * Returns true if this list contains no elements.
     * 
     * @return true if this list contains no elements.
     */
    public boolean isEmpty();
}