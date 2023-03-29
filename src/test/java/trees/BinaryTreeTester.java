package trees;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinaryTreeTester {
    private SubtreeChecker treeChecker;

    @Before
    public void SetUp() {
        treeChecker = new SubtreeChecker();
    }

    @Test
    public void CheckSubTree() {
        // Challenge: T1 is a large binary tree and T2 is a smaller one. Write an
        // algorithm to determine if T2 is a subtree of T1.

        BinarySearchTree t1 = new BinarySearchTree();
        BinarySearchTree t2 = new BinarySearchTree();

        // Create our T1 tree
        t1.insert(5);
        t1.insert(3);
        t1.insert(2);
        t1.insert(4);
        t1.insert(7);
        t1.insert(6);
        t1.insert(8);

        Assert.assertEquals("5;3;2;4;7;6;8;", t1.getOrder());


        // Create our T2 tree
        t2.insert(7);
        t2.insert(6);
        t2.insert(8);

        Assert.assertEquals("768;", t2.getOrder());

        Assert.assertTrue(treeChecker.isSubTree(t1, t2));
    }
}
