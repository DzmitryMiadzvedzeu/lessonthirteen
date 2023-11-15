package com.telran.org.lessonthirteen;

import java.util.LinkedList;
import java.util.Queue;

public class TestBFS {
    public static void main(String[] args) {
        BinaryTree binaryTreeTwo = new BinaryTree();
        binaryTreeTwo.insert(3, "node 3");
        binaryTreeTwo.insert(2, "node 2");
        binaryTreeTwo.insert(1, "node 1");
        binaryTreeTwo.insert(4, "node 4");
        binaryTreeTwo.insert(5, "node 5");
        binaryTreeTwo.print();
        breadFirstSearch(binaryTreeTwo);
    }

    private static void breadFirstSearch(BinaryTree binaryTree) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(binaryTree.getRoot());

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.println("Value = " + node.getValue());
            if (node.getLeft() != null) {
                queue.add(node.getLeft());
            }

            if (node.getRight() != null) {
                queue.add(node.getRight());
            }
        }
    }

}
