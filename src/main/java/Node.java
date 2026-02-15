public class Node<Key extends Comparable<Key>, Value> implements Comparable<Node<Key, Value>> {

    Key key;
    Value value;
    Node<Key, Value> left;
    Node<Key, Value> right;
    Node<Key, Value> parent;
    boolean isRed;

    Node(Key key, Value value) {
        this.key = key;
        this.value = value;
        this.left = null;
        this.right = null;
        this.isRed = false;
    }

    Node(Key key, Value value, boolean isRed) {
        this.key = key;
        this.value = value;
        this.left = null;
        this.right = null;
        this.isRed = isRed;
    }

    Node(Key key, Value value, Node<Key, Value> left, Node<Key, Value> right, boolean isRed) {
        this.key = key;
        this.value = value;
        this.left = left;
        this.right = right;
        this.isRed = isRed;
    }

    @Override
    public int compareTo(Node<Key, Value> other) {
        return this.key.compareTo(other.key);
    }

    boolean isRed() {
        return isRed;
    }
}
