// Singly Linked List Demo Program
class SinglyLL
{
    static class Node
    {
        int data;
        Node next;

        Node(int n)
        {
            this.data = n;
            this.next = null;
        }
    }

    public static void main(String args[])
    {
        //creating nodes
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        //linking nodes
        n1.next = n2;
        n2.next = n3;
        //displaying nodes
        System.out.println("Singly Linked List :- ");
        Node current = n1;
        while(current != null)
        {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");

    }
}