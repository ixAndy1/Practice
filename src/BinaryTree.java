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

//In Order Traversal
// Left subtree -> Root -> Right subtree
public static void inOrder(TreeNode node)
{
    System.out.println("In Order Traversal: ");
    if (node != null)
    {
        inOrder(node.left);
        System.out.print(" " + node.value);
        inOrder(node.right);
    }
}

//Pre Order Traversal
// Root -> Left Subtree -> Right subtree
public static void preOrder(TreeNode node)
{
    System.out.println("Pre Order Traversal: ");
    if (node != null)
    {
        System.out.print(" " + node.value);
        preOrder(node.left);
        preOrder(node.right);
    }
}

//Post Order Traversal
//Left Subtree -> Right subtree -> Root
public static void postOrder (TreeNode node)
{
    System.out.println("Post Order Traversal: ");
    if (node != null)
    {
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(" " + node.value);
    }
}

private TreeNode deleteRecursive(TreeNode current, int value)
{
    if (current == null)
    {
        return null;
    }

    if (value == current.value)
    {
        //If node is a leaf node
        if (current.left == null && current.right == null)
        {
            return null;
        }

        //If node has one child
        if (current.right == null)
        {
            return current.left;
        }

        if (current.left == null)
        {
            return current.right;
        }

        //If node has two children

        //First, we need to find the node that will replace the deleted node.
        // We’ll use the smallest node of the node to be deleted’s right sub-tree:
        int smallestValue = findSmallestValue(current.right);

        //Then, we assign the smallest value to the node to delete and after that,
        // we’ll delete it from the right subtree:
        current.value = smallestValue;
        current.right = deleteRecursive(current.right, smallestValue);
        return current;
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

//Finds the smallest node of the node's subtree
private int findSmallestValue(TreeNode root)
{
        return root.left == null
                ? root.value
                : findSmallestValue(root.left);

}

public void delete(int value)
    {
        root = deleteRecursive(root, value);
    }

@Test
public void deleteTest()
{
        BinaryTree bt = createExampleBinaryTree();

        assertTrue(bt.containsTreeNode(6));
        bt.delete(6);
        assertFalse(bt.containsTreeNode(6));
    }

}//End

