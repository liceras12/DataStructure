package lflr.arrays.binarytrees;

public class BTNode {
    public int data;
    BTNode right;
    BTNode left;

    public BTNode(int data){
        this.data = data;
        this.right = null;
        this.left = null;
    }
    public boolean isLeaf(){
        return this.right == null && this.left == null;
    }

}
