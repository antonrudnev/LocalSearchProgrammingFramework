package localsearchoptimization.examples.structures.tree;

import localsearchoptimization.examples.structures.permutation.Permutation;

public interface OrientedTree extends TreeBranching, Permutation {

    OrientedTree fetchOrientedTree(int[] order, boolean[] branching, String operationName);

    default String printTree() {
        StringBuilder builder = new StringBuilder();
        int node = 0;
        for (boolean i : branching()) {
            builder.append(i ? ")" : "(" + order()[node]);
            if (!i) node++;
        }
        return builder.toString();
    }
}