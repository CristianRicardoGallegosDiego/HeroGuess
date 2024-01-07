package src.data_structures;

public class SinglyLinkedList<E> implements ADTList<E> {

    private Node<E> head;
    
    private int size;

    @Override
    public void add(E element) {
        add(size(), element);
    }

    @Override
    public void add(int index, E element) {
        if (index > size() || index < 0)
            throw new IndexOutOfBoundsException(index);
        if (element == null)
            throw new NullPointerException("Element cannot be null");
        if (head == null) {
            head = new Node<E>(element);
        } else if (index == 0) {
            Node<E> temporalHead = head;
            head = new Node<E>(element);
            head.setNext(temporalHead);
        } else {
            Node<E> iterator = head;
            for (int i = 0; i < (index - 1); i++)
                iterator = iterator.getNext();
            Node<E> temporalNode = new Node<E>(element);
            temporalNode.setNext(iterator.getNext());
            iterator.setNext(temporalNode);
        }
        size++;
    }

    @Override
    public E remove(int index) {
        if (index >= size() || index < 0)
            throw new IndexOutOfBoundsException(index);
        size--;
        if (index == 0) {
            E temporalElement = head.getElement();
            head = head.getNext();
            return temporalElement;
        } else {
            Node<E> iteratorNode = head;
            int iteratorIndex = 0;
            while (iteratorIndex < (index - 1)) {
                iteratorNode = iteratorNode.getNext();
                iteratorIndex++;
            }
            E temporalElement = iteratorNode.getNext().getElement();
            if (index != size()) {
                Node<E> temporalNode = iteratorNode;
                iteratorNode.setNext(temporalNode.getNext().getNext());
            } else {
                iteratorNode.setNext(null);
            }
            return temporalElement;
        }
    }

    @Override
    public E get(int index) {
        if (index >= size() || index < 0)
            throw new IndexOutOfBoundsException(index);
        Node<E> iterator = head;
        for (int i = 0; i < index; i++)
            iterator = iterator.getNext();
        return iterator.getElement();
    }

    @Override
    public boolean contains(E element) {
        if (element == null)
            throw new NullPointerException("Element cannot be null");
        Node<E> iterator = head;
        for (int i = 0; i < size(); i++) {
            if (iterator.getElement().equals(element))
                return true;
            iterator = iterator.getNext();
        }
        return false;
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }
}