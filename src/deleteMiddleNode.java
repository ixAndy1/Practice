/*
Delete a given node from a singly linked list,
having being given access only to that node
 */

public class deleteMiddleNode
{
    public static void main(String[] args)
    {
        Node head = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
    }

    private static void deleteMiddle(Node n)
    {
        Node node = n.next;
        node.data = n.data; //Copy contents from the next node to the middle node
        node.next = n.next; //Set the middle.next to n.next, skipping over it
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
