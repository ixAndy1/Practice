/*
Write an algorithm to partition a linked list around a value x,
such that all nodes less than x are on the left side,
and all nodes greater than or equal to x are on the right side
 */
public class Partition
{
    public static void main(String[] args)
    {
        Node head = new Node(6);
        Node node1 = new Node(3);
        Node node2 = new Node(7);
        Node node3 = new Node(5);
        Node node4 = new Node(2);
        Node node5 = new Node(9);
        Node node6 = new Node (8);
        Node node7 = new Node(1);
        Node node8 = new Node(4);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;

    }

    private static void part(Node head, int x)
    {
        
    }

    static class Node
    {
        int data;
        Node next;

        Node (int data)
        {
            this.data = data;
        }
    }

}
