// Doubly Linked List Demo Program
class DoublyLL{
    static class Node{
        int data;
        Node next;
        Node prev;
        //parameterised constructor
        Node(int n){
            this.data = n;
            this.next = null;
            this.prev = null;
        }
    }

    public static void main(String args[]){
        //creating nodes
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        //linking nodes
        n1.next = n2;
        n2.next = n3;
        n2.prev = n1;
        n3.next = n4;
        n3.prev = n2;
        n4.prev = n3;

        System.out.println("Doubly Linked List :- ");
        Node currentNode;
        //forward printing 
        System.out.print("Forward : ");
        currentNode = n1;
        while(currentNode != null){
            System.out.print(currentNode.data + " --> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");

        //backward printing
        System.out.print("Backward : ");
        currentNode = n4;
        while(currentNode != null){
            System.out.print(currentNode.data + " --> ");
            currentNode = currentNode.prev;
        }
        System.out.println("null");
    }
}