//package Binary Tree;

import java.util.Scanner;
public class Tree {
    static Node create() {
        Scanner s = new Scanner(System.in);
        Node root = null;
        System.out.print("Enter data:");
        int data = s.nextInt();
        if (data == -1)
            return null;
        root = new Node(data);
        System.out.println("Enter left child of: " + root.data);       
        root.left = create();
        System.out.println("Enter right child of :" + root.data);
        root.right = create();
        return root;

    }

    static void Inorder(Node root) {
        if (root == null)
            return;
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }
    static void Preorder(Node root)
    {
        if(root==null)
        return;
        System.out.print(root.data+" ");
        Preorder(root.left);
        Preorder(root.right);
    }
    static void Postorder(Node root)
    {
        if(root==null)
        return;
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
        Node root = create();
        System.out.println("Inorder:");
        Inorder(root);
        System.out.println();
        System.out.println("Preorder");
        Preorder(root);
        System.out.println();
        System.out.println("Postorder:");
        Postorder(root);

    }
}

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
