package src.data_structures;

public class CircularLinkedList<E> implements ADTList<E> {

    private DoubleNode<E> head;

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
            head = new DoubleNode<E>(element);
            head.setPrevious(head);
            head.setNext(head);
        } else if (index == 0) {
            DoubleNode<E> temporalHead = head;
            DoubleNode<E> temporalTail = head.getPrevious();
            head = new DoubleNode<E>(element);
            temporalTail.setNext(head);
            head.setNext(temporalHead);
            head.getNext().setPrevious(head);
            head.setPrevious(temporalTail);
        } else {
            DoubleNode<E> iterator = head;
            DoubleNode<E> temporalNode = new DoubleNode<E>(element);
            if (index <= Math.ceil((double)size() / (2.0))) {
                for (int i = 0; i < (index - 1); i++)
                    iterator = iterator.getNext();
                temporalNode.setNext(iterator.getNext());
                temporalNode.setPrevious(iterator);
                iterator.getNext().setPrevious(temporalNode);
                iterator.setNext(temporalNode);
            } else {
                for (int i = (size() - 1); i >= (index + 1); i--)
                    iterator = iterator.getPrevious();
                temporalNode.setNext(iterator);
                temporalNode.setPrevious(iterator.getPrevious());
                iterator.getPrevious().setNext(temporalNode);
                iterator.setPrevious(temporalNode);
            }
        }
        size++;
    }

    @Override
    public E remove(int index) {
        if (index >= size() || index < 0)
            throw new IndexOutOfBoundsException(index);
        size--;
        E temporalElement = head.getElement();
        if (size() == 0) {
            head = null;
        } else if (index == 0) {
            DoubleNode<E> temporalTail = head.getPrevious();
            head = head.getNext();
            temporalTail.setNext(head);
            head.setPrevious(temporalTail);
        } else if (index == size()) {
            temporalElement = head.getPrevious().getElement();
            DoubleNode<E> temporalTail = head.getPrevious().getPrevious();
            head.setPrevious(temporalTail);
            temporalTail.setNext(head);
        } else {
            DoubleNode<E> iterator = head;
            if (index <= Math.ceil((double)size() / (2.0))) {
                for (int i = 0; i < index - 1; i++)
                    iterator = iterator.getNext();
                temporalElement = iterator.getNext().getElement();
                iterator.setNext(iterator.getNext().getNext());
                iterator.getNext().setPrevious(iterator);
            } else {
                for (int i = size(); i >= index + 1; i--)
                    iterator = iterator.getPrevious();
                temporalElement = iterator.getPrevious().getElement();
                iterator.setPrevious(iterator.getPrevious().getPrevious());
                iterator.getPrevious().setNext(iterator);
            }
        }
        return temporalElement;
    }

    @Override
    public E get(int index) {
        if (index >= size() || index < 0)
            throw new IndexOutOfBoundsException(index);
        DoubleNode<E> iterator = head;
        if (index <= Math.ceil((double)size() / (2.0))) {
            for (int i = 0; i < index; i++)
                iterator = iterator.getNext();
        } else {
            for (int i = size - 1; i >= index; i--)
                iterator = iterator.getPrevious();
        }
        return iterator.getElement();
    }

    @Override
    public boolean contains(E element) {
        if (element == null)
            throw new NullPointerException("Element cannot be null");
        DoubleNode<E> iteratorOne = head;
        DoubleNode<E> iteratorTwo = head;
        int middle = (int)Math.ceil((double)size() / (2.0));
        for (int i = 0; i <= middle; i++) {
            if (iteratorOne.getElement().equals(element) || iteratorTwo.getElement().equals(element))
                return true;
            iteratorOne = iteratorOne.getNext();
            iteratorTwo = iteratorTwo.getPrevious();
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