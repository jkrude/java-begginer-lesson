package lesson5.solution;

import lesson5.exercise.BinaryTree.Node;
import lesson5.exercise.TreeSum;

public class TreeSumImpl extends TreeSum {

    private int sum = 0;

    @Override
    public int sumOfTree() {
        return sum;
    }

    @Override
    public void visit(Node node) {
        sum += node.getValue();
    }
}
