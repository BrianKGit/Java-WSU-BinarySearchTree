/*
 * Author: Brian Klein
 * Date:
 * Program:
 * Description:
 */

import java.util.Scanner;

public class BinarySearchTreeClient {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        BinarySearchTree<Integer> myTree = new BinarySearchTree<Integer>();

        myTree.insertNode(12);
        myTree.insertNode(19);
        myTree.insertNode(5);
        myTree.insertNode(7);
        myTree.insertNode(15);
        myTree.insertNode(18);
        myTree.insertNode(2);
        myTree.insertNode(6);
        myTree.insertNode(13);
        myTree.insertNode(25);
        myTree.insertNode(29);
        myTree.insertNode(17);

        System.out.println("\nInorder Traverse: ");
        myTree.inorderTraverse();

        System.out.println("\n\nPreorder Traverse: ");
        myTree.preorderTraverse();

        System.out.println("\n\nPostorder Traverse: ");
        myTree.postorderTraverse();

        while (true) {
            System.out.println("\n\nEnter a key to search: ");
            int key = console.nextInt();

            if (key == -1) {
                break;
            }

            TreeNode temp = myTree.search(key, myTree.getRoot());
            
            if(temp == null) {
                System.out.println("Not Found.");
            } else {
                System.out.println("Found.");
                
                TreeNode parent = temp.getParent();
                TreeNode leftChild = temp.getLeftChild();
                TreeNode rightChild = temp.getRightChild();
                
                if(parent != null) {
                    System.out.println("Parent: " + parent.getData());
                } else {
                    System.out.println("It doesn't have a parent, it is the root.");
                }
                
                if(leftChild != null) {
                    System.out.println("Left Child: " + leftChild.getData());
                } else {
                    System.out.println("It doesn't have a left child.");
                }
                
                if(rightChild != null) {
                    System.out.println("Right Child: " + rightChild.getData());
                } else {
                    System.out.println("It doesn't have a right child.");
                }
            }

        }//end while
        
    }//end main
    
}//end class