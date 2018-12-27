/*
Remove duplicates from an unsorted (singly) linked list
 */

import java.util.Enumeration;
import java.util.Hashtable;

public class RemoveDuplicates
{
    private static void removeDuplicates(Node head)
    {
        Hashtable<Integer, Integer> hashTable = new Hashtable<>();

        Node current = head;

        while (current.next != null) //While linked list is not empty
        {
            //Put into hashtable
            if (!hashTable.containsKey(current.data))
            {
                hashTable.put(current.data, 1);
                current = current.next;
            }
            else
                //Move to next node
            {
                current = current.next;
            }
        }

       Enumeration keyList = hashTable.keys();

        while (keyList.hasMoreElements())
        {
            System.out.print(keyList.nextElement() + " ");
        }
    }

    public static void main(String[] args)
    {
        Node head = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(2);
        Node node5 = new Node(1);
        Node node6 = new Node(2);
        Node node7 = new Node(3);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        removeDuplicates(head);

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
