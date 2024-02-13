import lflr.arrays.binarytrees.BinaryTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinaryTreeTests {

    @Test
    public void testInsertData() {
        BinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);
        Assertions.assertEquals(7, tree.size());
    }

    @Test
    public void testSearchData() {
        BinaryTree tree = new BinaryTree();
        Assertions.assertFalse(tree.search(5));
        tree.insert(3);
        tree.insert(7);
        tree.insert(4);
        Assertions.assertTrue(tree.search(3));
        Assertions.assertTrue(tree.search(7));
        Assertions.assertTrue(tree.search(4));
        Assertions.assertFalse(tree.search(1));
        Assertions.assertFalse(tree.search(9));
    }

    @Test
    public void height() {
        BinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);
        Assertions.assertEquals(3, tree.height());
    }

    @Test
    public void getNode() {
        int value = 12;
        int value2 = 24;

        BinaryTree tree = new BinaryTree(value);
        Assertions.assertEquals(value, tree.getNode(value).data);

        tree.insert(value2);
        tree.insert(6);
        tree.insert(3);
        Assertions.assertEquals(value2, tree.getNode(value2).data);
    }

    @Test
    public void inOrder() {
        BinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);
        int[] expected = {2, 3, 4, 5, 6, 7, 8};
        Assertions.assertArrayEquals(expected, tree.inOrder());
    }

    @Test
    public void preOrder() {
        BinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);
        int[] expected = {5, 3, 2, 4, 7, 6, 8};
        Assertions.assertArrayEquals(expected, tree.preOrder());
    }

    @Test
    public void postOrder() {
        BinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);
        int[] expected = {2, 4, 3, 6, 8, 7, 5};
        Assertions.assertArrayEquals(expected, tree.postOrder());
    }

}
