/*
Given a linked list, reverse it.
 */
public class ReverseLinkedList
{
    public static void main(String[] args)
    {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Reversed linked list:");
        Node reversedList = reverse(head);
        printList(reversedList);

    }

    private static Node reverse(Node head)
    {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current!= null) //Go through the list
        {
            next = current.next; //Set the next node
            current.next = prev; //Move the +1 node to the -1 position
            prev = current; //Move the -1 node to the current position
            current = next; //Move to the next node
        }
        head = prev;
        return head;

    }



    private static void printList(Node node)
    {
        while (node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }


}
