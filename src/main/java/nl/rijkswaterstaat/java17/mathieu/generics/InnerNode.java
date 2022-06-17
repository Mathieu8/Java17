package nl.rijkswaterstaat.java17.mathieu.generics;

public final class InnerNode<T> implements  TreeNode<T>{

private final TreeNode<T> left, right;

    public InnerNode(TreeNode<T> left, TreeNode<T> right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public T getValue() {
        return null;
    }

    @Override
    public TreeNode<T> getLeft() {
        return null;
    }

    @Override
    public TreeNode<T> getRight() {
        return null;
    }
}
