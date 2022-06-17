package nl.rijkswaterstaat.java17.mathieu.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeNodeTest {

    @Test
    void treeNode(){
        TreeNode<Integer> numbersTree = new TreeNode<Integer>() {
            @Override
            public Integer getValue() {
                return null;
            }

            @Override
            public TreeNode<Integer> getLeft() {
                return null;
            }

            @Override
            public TreeNode<Integer> getRight() {
                return null;
            }
        };
    }

}