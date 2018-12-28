/*
Implement an algorithm to find the kth to last element
in a (singly) linked list
 */
public class KthtoLast
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

        kthToLast(head,2);


    }

    private static void kthToLast (Node head, int k)
    {
        Node current = head;
        Node runner = head;

        for (int i = 1; i < k; i++)
        {
            runner = runner.next;
        }

        while (runner.next != null)
        {
            current = current.next;
            runner = runner.next;
        }
        System.out.println(current.data);
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
