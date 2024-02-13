package lflr.arrays.binarytrees;

public class BinaryTree implements IBinaryTree{

    BTNode root;

    public BinaryTree() {
        root = null;
    }
    public BinaryTree(int data) {
        root = new BTNode(data);
    }
    @Override
    public void insert(int data) {
        root = insert(root, data);
    }

    @Override
    public boolean search(int data) {
        return search(root, data);
    }

    @Override
    public BTNode getRoot() {
        return root;
    }

    @Override
    public BTNode getNode(int data) {
        return getNode(root, data);
    }

    @Override
    public void delete(int data) {
        delete(root, data);
    }

    @Override
    public int[] inOrder() {
        return inOrder(root);
    }

    @Override
    public int[] preOrder() {
        return preOrder(root);
    }

    @Override
    public int[] postOrder() {
        return postOrder(root);
    }

    @Override
    public int height() {
        return height(root);
    }

    @Override
    public int size() {
        return size(root);
    }

    @Override
    public void print() {
            var preOrder = preOrder();
            for (int i :preOrder){
                System.out.println(i + "");
            }
    }

    private static BTNode insert(BTNode root, int data) {
        if (root == null) {
            root = new BTNode(data);
            return root;
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    private static int size(BTNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + size(root.left) + size(root.right);
    }

    private static int height(BTNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    private static boolean search(BTNode root, int data) {
        if (root == null) {
            return false;
        }
        if (root.data == data) {
            return true;
        }
        if (data < root.data) {
            return search(root.left, data);
        }
        return search(root.right, data);
    }

    private static BTNode getNode(BTNode root, int data) {
        if (root == null) {
            return null;
        }
        if (root.data == data) {
            return root;
        }
        if (data < root.data) {
            return getNode(root.left, data);
        }
        return getNode(root.right, data);
    }

    private static int[] inOrder(BTNode root) {
        if (root == null) {
            return new int[0];
        }
        int[] left = inOrder(root.left);
        int[] right = inOrder(root.right);
        int[] result = new int[left.length + right.length + 1];
        System.arraycopy(left, 0, result, 0, left.length);
        result[left.length] = root.data;
        System.arraycopy(right, 0, result, left.length + 1, right.length);
        return result;
    }

    private static int[] preOrder(BTNode root) {
        if (root == null) {
            return new int[0];
        }
        int[] left = preOrder(root.left);
        int[] right = preOrder(root.right);
        int[] result = new int[left.length + right.length + 1];
        result[0] = root.data;
        System.arraycopy(left, 0, result, 1, left.length);
        System.arraycopy(right, 0, result, left.length + 1, right.length);
        return result;
    }

    private static int[] postOrder(BTNode root) {
        if (root == null) {
            return new int[0];
        }
        int[] left = postOrder(root.left);
        int[] right = postOrder(root.right);
        int[] result = new int[left.length + right.length + 1];
        System.arraycopy(left, 0, result, 0, left.length);
        System.arraycopy(right, 0, result, left.length, right.length);
        result[left.length + right.length] = root.data;
        return result;
    }

    private static void delete(BTNode root, int data) {
        if (root == null) {
            return;
        }
        if (root.data == data) {
            if (root.left == null && root.right == null) {
                root = null;
            } else if (root.left == null) {
                root = root.right;
            } else if (root.right == null) {
                root = root.left;
            } else {
                BTNode temp = root.right;
                while (temp.left != null) {
                    temp = temp.left;
                }
                root.data = temp.data;
                delete(root.right, temp.data);
            }
        } else if (data < root.data) {
            delete(root.left, data);
        } else {
            delete(root.right, data);
        }
    }
}
