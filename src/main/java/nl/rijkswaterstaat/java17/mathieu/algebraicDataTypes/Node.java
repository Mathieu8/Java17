package nl.rijkswaterstaat.java17.mathieu.algebraicDataTypes;

import java.util.List;

public record Node(List<Tree> data)  implements Tree{
    @Override
    public Integer getData() {
        NumberOfLeafs number = new NumberOfLeafs();
        data.forEach(tree -> number.leafs=tree.getData()+ number.leafs);
        return number.leafs;
    }

    class NumberOfLeafs{
        int leafs;
    }
}
