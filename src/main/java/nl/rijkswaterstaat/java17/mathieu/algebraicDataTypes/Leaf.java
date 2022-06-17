package nl.rijkswaterstaat.java17.mathieu.algebraicDataTypes;

public record Leaf(Integer numberOfLeaves) implements Tree{
    @Override
    public Integer getData() {
        return numberOfLeaves;
    }
}
