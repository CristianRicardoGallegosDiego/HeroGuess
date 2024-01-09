package src.data_structures;

public class DoubleNode<E> {

    private E element;

    private DoubleNode<E> next;
    private DoubleNode<E> previous;
        
    public DoubleNode (E element) {
        this.element = element;
    }

    public E getElement() {
        return element;
    }

    public DoubleNode<E> getNext() {
        return next;
    }

    public void setNext(DoubleNode<E> next) {
        this.next = next;
    }

    public DoubleNode<E> getPrevious() {
        return previous;
    }

    public void setPrevious(DoubleNode<E> previous) {
        this.previous = previous;
    } 
}