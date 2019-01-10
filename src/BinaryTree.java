import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BinaryTree
{
    TreeNode root;

//Add TreeNode
private TreeNode addRecursive(TreeNode current, int value)
{
    if (current == null)
    {
        return new TreeNode(value);
    }

    if (value < current.value)
    {
        current.left = addRecursive(current.left,value);
    }

    else if (value > current.value)
    {
        current.right = addRecursive(current.right, value);
    }

    else
    {
        return current;
    }

   return current;
}

public void add (int value)
{
    root = addRecursive(root,value);
}

private BinaryTree createExampleBinaryTree()
{
    BinaryTree bt = new BinaryTree();

    bt.add(6);
    bt.add(4);
    bt.add(8);
    bt.add(3);
    bt.add(5);
    bt.add(7);
    bt.add(9);

    return bt;
}

private boolean containsTreeNodeRecursive(TreeNode current, int value)
{
    if (current == null)
    {
        return false;
    }

    if (value == current.value)
    {
        return true;
    }

    return value < current.value
            ? containsTreeNodeRecursive(current.left, value) // If <, get left
            : containsTreeNodeRecursive(current.right, value); // If !<, get right
}

public boolean containsTreeNode(int value)
{
    return containsTreeNodeRecursive(root, value);
}

@Test
public void testContains()
{
    BinaryTree bt = createExampleBinaryTree();

    assertTrue(bt.containsTreeNode(6));
    assertTrue(bt.containsTreeNode(8));

    assertFalse(bt.containsTreeNode(1));

}

private TreeNode deleteRecursive(TreeNode current, int value)
{
    if (current == null)
    {
        return null;
    }

    if (value == current.value)
    {
        //Node to delete found
    }

    if (value < current.value)
    {
        current.left = deleteRecursive(current.left,value);
        return current;
    }

    current.right = deleteRecursive(current.right, value);
    return current;
}

//TreeNode Class
class TreeNode
{
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode (int value)
    {
        this.value = value;
        right = null;
        left = null;
    }
}

}
