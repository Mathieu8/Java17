package nl.rijkswaterstaat.java17.mathieu.generics;

public  interface TreeNode<T>   {
    T getValue();

    TreeNode<T> getLeft();

    TreeNode<T> getRight();
}
