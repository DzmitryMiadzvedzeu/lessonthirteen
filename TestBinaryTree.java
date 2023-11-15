package com.telran.org.lessonthirteen;

public class TestBinaryTree {
    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(1,"node 1");
        binaryTree.insert(2,"node 2");
        binaryTree.insert(3,"node 3");
        binaryTree.insert(5,"node 5");
        binaryTree.insert(4,"node 4");
        binaryTree.print();

        BinaryTree binaryTreeTwo = new BinaryTree();
        binaryTreeTwo.insert(3,"node 3");
        binaryTreeTwo.insert(2,"node 2");
        binaryTreeTwo.insert(1,"node 1");
        binaryTreeTwo.insert(4,"node 4");
        binaryTreeTwo.insert(5,"node 5");
        binaryTreeTwo.print();
    }
}
