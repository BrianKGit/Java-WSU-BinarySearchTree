/*
 * Author: Brian Klein
 * Date:
 * Program:
 * Description:
 */

public class TreeNode< E extends Comparable<E>> {

    //data members
    private E data;
    private TreeNode<E> parent;
    private TreeNode<E> leftChild;
    private TreeNode<E> rightChild;

    //constructor
    public TreeNode(E data) {
        this.data = data;
        parent = null;
        leftChild = null;
        rightChild = null;
    }

    //setters and getters
    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public TreeNode<E> getParent() {
        return parent;
    }

    public void setParent(TreeNode<E> parent) {
        this.parent = parent;
    }

    public TreeNode<E> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode<E> leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode<E> getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode<E> rightChild) {
        this.rightChild = rightChild;
    }

    //insert a new tree node to the tree
    public void insert(E data, TreeNode<E> node) {

        if (data.compareTo(node.getData()) < 0) {//turn left

            if (leftChild == null) {
                leftChild = new TreeNode(data);
                leftChild.setParent(node);
                node.setLeftChild(leftChild);
            } else {
                leftChild.insert(data, node.getLeftChild());
            }
        } else {
            if (rightChild == null) {
                rightChild = new TreeNode(data);
                rightChild.setParent(node);
                node.setRightChild(rightChild);
            } else {
                rightChild.insert(data, node.getRightChild());
            }
        }

    }

}
