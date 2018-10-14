package com.Krishna;

class Node{
    int key;
    Node left, right;
    public Node (int key)
    {
        this.key = key;
        left = right = null;
    }
}

public class BinaryTree {

    Node root;

    BinaryTree(){
        root = null;
    }

    public int getHeight(Node root)
    {
        if (root == null){
            return 0;
        }
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        return 1+(left > right ? left : right);
    }

public boolean checkHeightBalancedTree(Node root){
        int left, right;
        if(root == null)
        {
            return true;
        }
        left = getHeight(root.left);
        right = getHeight(root.right);
        return (Math.abs(left- right)<= 1 && checkHeightBalancedTree(root.left) && checkHeightBalancedTree(root.right));
}
    public static void main(String[] args) {

BinaryTree balance = new BinaryTree();
balance.root = new Node(3);
balance.root.left = new Node (5);
balance.root.right = new Node(7);

boolean status = balance.checkHeightBalancedTree(balance.root);

if(status)
{
    System.out.println("balanced");
}
else
    System.out.println(("unbalanced"));
    }
}
