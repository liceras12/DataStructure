package lflr.arrays.binarytrees;

public interface IBinaryTree {
    /**
     * @param data the data to be inserted
     */
    void insert(int data);

    /**
     * @param data the data to be searched
     * @return true if the data is found, false otherwise
     */
    boolean search(int data);

    /**
     * @return the root of the tree
     */
    BTNode getRoot();

    /**
     * @param data the data to be searched
     * @return the node containing the data
     */
    BTNode getNode(int data);

    /**
     * @param data the data to be deleted
     */
    void delete(int data);

    /**
     * @return the in-order traversal of the tree
     */
    int[] inOrder();

    /**
     * @return the pre-order traversal of the tree
     */
    int[] preOrder();

    /**
     * @return the post-order traversal of the tree
     */
    int[] postOrder();

    /**
     * @return the height of the tree
     */
    int height();

    /**
     * @return the size of the tree
     */
    int size();

    /**
     * prints the tree
     */
    void print();
}
