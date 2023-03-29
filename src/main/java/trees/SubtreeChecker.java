package trees;

public class SubtreeChecker {

    public boolean isSubTree(BinarySearchTree t1, BinarySearchTree t2) {
        String order1 = t1.getOrder();
        String order2 = t2.getOrder();

        return order1.contains(order2);
    }
}