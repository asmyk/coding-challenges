package com.asmyk;

import com.asmyk.utils.RBTree;

// https://leetcode.com/problems/my-calendar-i/
public class MyCalendar {
    public MyCalendar() {

        RBTree tree = new RBTree();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(20);
        tree.insert(25);
        tree.rotateRight(tree.root.getRightNode());
        System.out.println("ab");
    }

    public boolean book(int start, int end) {
        return true;
    }
}