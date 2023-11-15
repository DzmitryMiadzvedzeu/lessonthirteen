package com.telran.org.lessonthirteen;

public class TestDFS {
    public static void main(String[] args) {


        BinaryTree binaryTreeTwo = new BinaryTree();
        binaryTreeTwo.insert(10, "node 10");
        binaryTreeTwo.insert(9, "node 9");
        binaryTreeTwo.insert(7, "node 7");
        binaryTreeTwo.insert(8, "node 8");
        binaryTreeTwo.insert(13, "node 13");
        binaryTreeTwo.insert(11, "node 11");
        binaryTreeTwo.insert(14, "node 14");

        binaryTreeTwo.print();

        depthInOrder(binaryTreeTwo.getRoot());


    }

    public static void depthInOrder(Node node) {
        if(node == null) {
            return;
        }

        depthInOrder(node.getLeft());
        System.out.println("Value dfs = " + node.getValue());
        depthInOrder(node.getRight());
    }


}
