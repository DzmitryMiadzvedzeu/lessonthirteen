package com.telran.org.lessonthirteen;

public class Node {

    private int key;
    private String value;
    private Node left;
    private Node right;

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node(int key, String value) {
        this.key = key;
        this.value = value;
    }
}
