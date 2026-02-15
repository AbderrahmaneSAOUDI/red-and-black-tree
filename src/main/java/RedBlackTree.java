public class RedBlackTree<Key extends Comparable<Key>, Value> {
    Node<Key, Value> root;

    RedBlackTree() {
        this.root = null;
    }

    Node<Key, Value> search(Key key) {
        Node<Key, Value> x = this.root;

        if (x == null)
            return null;

        while (x != null) {
            int cmp = key.compareTo(x.key);
            if (cmp == 0)
                return x;
            if (cmp < 0)
                x = x.left;
            if (cmp > 0)
                x = x.right;
        }

        return null;
    }

    Node leftRotate(Node<Key, Value> h) {
        assert (h.isRed());

        Node x = h.right;
        h.right = x.left;
        x.left = h;
        x.isRed = h.isRed;
        h.isRed = true;

        return x;
    }

    Node rightRotate(Node<Key, Value>) {
        assert (h.isRed());
        
        return x;
    }
}
