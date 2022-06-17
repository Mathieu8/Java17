package nl.rijkswaterstaat.java17.mathieu.generics;

public class LeafNode<T> implements TreeNode<T> {
    private final T value;

    public LeafNode(T value) {
        this.value = value;
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
