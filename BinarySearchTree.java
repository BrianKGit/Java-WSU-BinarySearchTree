/*
 * Author: Brian Klein
 * Date:
 * Program:
 * Description:
 */

public class BinarySearchTree< E extends Comparable<E>> {

    //data members
    private TreeNode<E> root;

    //constructor
    public BinarySearchTree() {
        root = null;
    }

    //setter and getter
    public TreeNode<E> getRoot() {
        return root;
    }

    public void setRoot(TreeNode<E> root) {
        this.root = root;
    }

    //this method will build the tree
    public void insertNode(E data) {
        if (root == null) {
            root = new TreeNode(data);
        } else {
            root.insert(data, root);
        }
    }

    //inorder traverse
    public void inorderTraverse() {
        inorderHelper(root);
    }

    public void inorderHelper(TreeNode<E> node) {
        if (node == null) {
            return;
        }

        inorderHelper(node.getLeftChild()); //traverse the left subtree
        System.out.print(node.getData() + " ");
        inorderHelper(node.getRightChild()); //traverse the right subree
    }

    //preorder traverse
    public void preorderTraverse() {
        preorderHelper(root);
    }

    public void preorderHelper(TreeNode<E> node) {
        if (node == null) {
            return;
        }

        System.out.print(node.getData() + " ");
        preorderHelper(node.getLeftChild()); //traverse the left subtree
        preorderHelper(node.getRightChild()); //traverse the right subree
    }

    //postorder traverse
    public void postorderTraverse() {
        postorderHelper(root);
    }

    public void postorderHelper(TreeNode<E> node) {
        if (node == null) {
            return;
        }

        postorderHelper(node.getLeftChild()); //traverse the left subtree
        postorderHelper(node.getRightChild()); //traverse the right subree
        System.out.print(node.getData() + " ");
    }

    //search method
    public TreeNode search(E key, TreeNode<E> node) {
        TreeNode temp = searchHelper(key, node);
        return temp;
    }

    public TreeNode searchHelper(E key, TreeNode<E> node) {
        try {
            if (key.compareTo(node.getData()) < 0) {
                return searchHelper(key, node.getLeftChild());//search left subtree
            } else if (key.compareTo(node.getData()) > 0) {
                return searchHelper(key, node.getRightChild());//search right subtree
            } else {
                return node;
            }
        } catch (Exception e) {
            return null; //not found    
        }
    }
}
