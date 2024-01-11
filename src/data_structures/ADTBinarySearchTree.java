package src.data_structures;

public interface ADTBinarySearchTree<K extends Comparable<K>, E> {

    public void insert(K key, E element);

    public E delete(K key);

    public E retrieve(K key);

    public int level(K key);

    public boolean isLeaf(BinaryNode<K, E> node);

    public boolean isLeaf(K key);

    public BinaryNode<K, E> getRoot();

    public boolean isEmpty();
    
    public E findMax();

    public E findMin();

    public E[] preorder();

    public E[] inorder();

    public E[]postorder();
}