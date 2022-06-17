package nl.rijkswaterstaat.java17.mathieu.algebraicDataType;

import nl.rijkswaterstaat.java17.mathieu.algebraicDataTypes.Leaf;
import nl.rijkswaterstaat.java17.mathieu.algebraicDataTypes.Node;
import nl.rijkswaterstaat.java17.mathieu.algebraicDataTypes.Tree;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlgebraicDataType {
    @Test
    void algebraicDataType(){
        Leaf leaf1 = new Leaf(1);
        Leaf leaf2 = new Leaf(2);
        Leaf leaf3 = new Leaf(3);
        Node node1 = new Node(List.of(leaf1, leaf2));
        Node node2 = new Node(List.of(node1, leaf3));

        var result1 = node1.getData();
        var result2 = node2.getData();
        assertEquals(3, result1);
        assertEquals(6, result2);
    }
}
