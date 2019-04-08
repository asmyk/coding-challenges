package com.asmyk.utils;

import com.asmyk.utils.Node;

public class RBTree {

    public Node root;

    public RBTree() {

    }

    public RBTree(Node root) {
        this.root = root;
    }

    public void rotateLeft(Node node) {
        Node left = node.getLeftNode();
        Node right = node.getRightNode();

        node.setLeftNode(left.getLeftNode());
        node.getLeftNode().setParentNode(node);

        left.setParentNode(node);
        left.setLeftNode(left.getRightNode());
        left.setRightNode(node);
        node.setRightNode(left);
    }

    public void rotateRight(Node node) {
        Node left = node.getLeftNode();
        Node right = node.getRightNode();

        node.setRightNode(right.getRightNode());
        node.getRightNode().setParentNode(node);

        right.setParentNode(node);
        right.setLeftNode(node);
        right.setRightNode(right.getRightNode());
        node.setLeftNode(left);
        node.getParentNode().setRightNode(right);
    }

    public void insert(int value) {
        Node currentNode = this.root;

        if (this.root == null) {
            this.root = new Node(value);
        } else {
            while (currentNode != null) {
                if (currentNode.getValue() < value) {
                    if (currentNode.getRightNode() == null) {
                        currentNode.setRightNode(new Node(value, currentNode));
                        currentNode = null;
                    } else {
                        currentNode = currentNode.getRightNode();
                    }
                } else if (currentNode.getValue() >= value) {
                    if (currentNode.getLeftNode() == null) {
                        currentNode.setLeftNode(new Node(value, currentNode));
                        currentNode = null;
                    } else {
                        currentNode = currentNode.getLeftNode();
                    }
                }
            }
        }
    }

}