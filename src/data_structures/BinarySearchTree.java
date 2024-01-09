package src.data_structures;

public class BinarySearchTree<K extends Comparable<K>, E> implements ADTBinarySearchTree<K, E> {

    private BinaryNode<K, E> root;
    private int size;

    // BIEN
    public BinarySearchTree() {
        size = 0;
    }

    //BIEN
    public BinaryNode<K, E> getRoot() {
        return root;
    }

    // BIEN
    public int size() {
        return size;
    }

    //BIEN
    public boolean isEmpty() {
        return root == null;
    }

    // BIEN
    public boolean isLeaf(BinaryNode<K, E> node) {
        return (node.getLeftSon() == null && node.getRightSon() == null);
    }

    // BIEN
    @Override
    public void insert(K key, E element) {
        if (key == null || element == null)
            throw new IllegalArgumentException("Key or element cannot be nulls.");
        size++;
        if (isEmpty()) {
            root = new BinaryNode<K, E>(key, element, null);
        } else {
            auxiliaryInsert(root, key, element);
        }
    }

    // BIEN
    private void auxiliaryInsert(BinaryNode<K, E> currentNode,K key, E element) {
        if (currentNode.key.compareTo(key) >= 0) {
            if (currentNode.getLeftSon() == null) {
                currentNode.setLeftSon(new BinaryNode<K, E>(key, element, currentNode));
            } else {
                auxiliaryInsert(currentNode.getLeftSon(), key, element);
            }
        } else {
            if (currentNode.getRightSon() == null) {
                currentNode.setRightSon(new BinaryNode<K, E>(key, element, currentNode));
            } else {
                auxiliaryInsert(currentNode.getRightSon(), key, element);
            }
        }
    }

    public E delete(K key) {
        return null;
    }

    // BIEN
    public E retrieve(K key) {
        if (key == null)
            throw new IllegalArgumentException("Key cannot be null.");
        BinaryNode<K, E> node = retrieve(root, key);
        return (node != null)? node.getElement() : null;
    }

    // BIEN
    private BinaryNode<K, E> retrieve(BinaryNode<K, E> currentNode, K key) {
        if (currentNode == null)
            return null;
        if (currentNode.key.compareTo(key) == 0)
            return currentNode;
        if (currentNode.key.compareTo(key) > 0) {
            return retrieve(currentNode.getLeftSon(), key);
        } else {
            return retrieve(currentNode.getRightSon(), key);
        }
    }

    // BIEN
    public int level(K key) {
        if (key == null)
            throw new IllegalArgumentException("Key cannot be null.");
        return auxiliaryLevel(root, key, 1);
    }

    // BIEN
    private int auxiliaryLevel(BinaryNode<K, E> currentNode, K key, int currentLevel) {
        if (currentNode == null)
            return -1;
        if (currentNode.key.compareTo(key) == 0)
            return currentLevel;
        if (currentNode.key.compareTo(key) < 0) {
            return auxiliaryLevel(currentNode.getLeftSon(), key, currentLevel++);
        } else {
            return auxiliaryLevel(currentNode.getRightSon(), key, currentLevel++);
        }
    }

    // BIEN
    public E findMax() {
        BinaryNode<K, E> currentNode = root;
        BinaryNode<K, E> auxiliaryNode = null;
        while (currentNode != null) {
            auxiliaryNode = currentNode;
            currentNode = currentNode.getRightSon();
        }
        return auxiliaryNode.getElement();
    }

    //BIEN
    public E findMin() {
        BinaryNode<K, E> currentNode = root;
        BinaryNode<K, E> auxiliaryNode = null;
        while (currentNode != null) {
            auxiliaryNode = currentNode;
            currentNode = currentNode.getLeftSon();
        }
        return auxiliaryNode.getElement();
    }

    // BIEN
    private E[] toArray(ADTQueue<E> queue) {
        E[] array = (E[]) new Object[queue.size()];
        int index = 0;
        while (!queue.isEmpty()) {
            array[index++] = queue.dequeue();
        }
        return array;
    }

    // BIEN
    public E[] preorder() {
        if (isEmpty())
            return null;
        ADTQueue<E> tree = new CircularQueue<E>();
        preorder(tree, root);
        return toArray(tree);
    }

    // BIEN
    private void preorder(ADTQueue<E> preorder, BinaryNode<K, E> currentNode) {
        if (currentNode == null)
            return;
        preorder.enqueue(currentNode.getElement());
        preorder(preorder, currentNode.getLeftSon());
        preorder(preorder, currentNode.getRightSon());
    }

    public E[] inorder() {
        if (isEmpty())
            return null;
        ADTQueue<E> tree = new CircularQueue<E>();
        inorder(tree, root);
        return toArray(tree);
    }

    private void inorder(ADTQueue<E> inorder, BinaryNode<K, E> currentNode) {
        if (currentNode == null)
            return;
        inorder(inorder, currentNode.getLeftSon());
        inorder.enqueue(currentNode.getElement());
        inorder(inorder, currentNode.getRightSon());
    }

    public E[] postorder() {
        if (isEmpty())
            return null;
        ADTQueue<E> tree = new CircularQueue<E>();
        postorder(tree, root);
        return toArray(tree);
    }

    private void postorder(ADTQueue<E> postorder, BinaryNode<K, E> currentNode) {
        if (currentNode == null)
            return;
        postorder(postorder, currentNode.getLeftSon());
        postorder(postorder, currentNode.getRightSon());
        postorder.enqueue(currentNode.getElement());
    }
}