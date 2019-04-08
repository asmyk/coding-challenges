package com.asmyk.utils;

import com.asmyk.utils.NodeColor;

public class Node {
    private Node left;
    private Node right;
    private Node parent;
    private int value;
    private NodeColor color;

    Node(int v) {
        this.value = v;
        this.color = NodeColor.Red;
    }

    Node(int v, Node parent) {
        this(v);
        this.parent = parent;
    }

    public int getValue() {
        return this.value;
    }

    public Node getLeftNode() {
        return this.left;
    }

    public Node getRightNode() {
        return this.right;
    }

    public Node getParentNode() {
        return this.parent;
    }

    public void setRightNode(Node n) {
        this.right = n;
    }

    public void setLeftNode(Node n) {
        this.left = n;
    }

    public void setParentNode(Node n) {
        this.parent = n;
    }

    private void makeRedNode() {
        this.setColor(NodeColor.Red);
    }

    private void makeBlackNode() {
        this.setColor(NodeColor.Black);
    }

    private void setColor(NodeColor c) {
        this.color = c;
    }
}