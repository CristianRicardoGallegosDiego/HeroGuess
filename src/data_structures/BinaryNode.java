package src.data_structures;

public class BinaryNode<K, E> {
    
    public K key;
    private E element;

    private BinaryNode<K, E> parent;
    private BinaryNode<K, E> leftSon;
    private BinaryNode<K, E> rightSon;

    public BinaryNode(K key, E element, BinaryNode<K, E> parent) {
        this.key = key;
        this.element = element;
        this.parent = parent;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public BinaryNode<K, E> getParent() {
        return parent;
    }

    public void setParent(BinaryNode<K, E> parent) {
        this.parent = parent;
    }

    public BinaryNode<K, E> getLeftSon() {
        return leftSon;
    }

    public void setLeftSon(BinaryNode<K, E> leftSon) {
        this.leftSon = leftSon;
    }

    public BinaryNode<K, E> getRightSon() {
        return rightSon; 
    }

    public void setRightSon(BinaryNode<K, E> rightSon) {
        this.rightSon = rightSon;
    }
}