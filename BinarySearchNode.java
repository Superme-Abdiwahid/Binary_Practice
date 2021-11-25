// Class that represents a single node in the tree.
public class BinarySearchNode {
    public String data;
    public BinarySearchNode left;
    public BinarySearchNode right;

    // Constructs a leaf node with the given data. As a string
    public BinarySearchNode(String data) {
        this(data, null, null);
    }

    // Constructs a leaf or branch node with the given data and links.
    // to perform a binary search later on 
    public BinarySearchNode(String data, BinarySearchNode left, BinarySearchNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
