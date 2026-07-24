// Circular Singly Linked List Demo Program
class CircularSinglyLL
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
        Node n4 = new Node(4);
        //linking nodes
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n1;
        //displaying nodes
        System.out.println("Circular Singly Linked List :- ");
        Node currentNode = n1;
        Node startNode = currentNode;
        System.out.print(currentNode.data + " --> ");   //printing first node 
        currentNode = currentNode.next;
        while(currentNode != startNode)
        {
            System.out.print(currentNode.data + " --> ");
            currentNode = currentNode.next;
        }
        System.out.println("....");

    }
}