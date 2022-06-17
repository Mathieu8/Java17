package nl.rijkswaterstaat.java17.mathieu.algebraicDataTypes;

public sealed interface Tree permits Node, Leaf {
    Integer getData();
}
