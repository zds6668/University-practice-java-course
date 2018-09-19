package com.List;

public class DefLinkedList {
    static Node head;
    static Node last;

    private int size;

    public int size(){
        System.out.print("长度为：");
        return this.size;
    }

    public void add(Node node){
        if (head == null){
            Node tmp = new Node();
            tmp.data = node.data;
            head = tmp;
            last = tmp;
        }
        else{
            Node tmp = new Node(last, null, node.data);
            last.next = tmp;
            last = tmp;
            tmp = null; //释放tmp
        }
        size++;
    }
    public Object get(int index){
        if (size < index){
            return null;
        }else if (index == size){
            return last.data;
        }else{
            Node tmp = head;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }return tmp.data;
        }
    }

    public void remove(int index){
        if (index==size){
            last.previous.next = null;
            last = last.previous;
        }else{
            Node tmp = head;
            for (int i = 0; i < index-1; i++) {
                tmp = tmp.next;
            }tmp.previous.next = tmp.next;
            tmp.next.previous = tmp.previous;
            tmp = null;
        }
    }

    public void traversal(Node node){
        if (node == null){
            System.out.print("null");
        }else {
            System.out.print(node.data + "-->");
            node = node.next;
            traversal(node);
        }
    }
    public void reverseTraversal(Node node){
        if (node == null){
            System.out.print("null");
        }else {
            System.out.print(node.data + "-->");
            node = node.previous;
            reverseTraversal(node);
        }
    }
    public static void main(String[] args){
        DefLinkedList link = new DefLinkedList();
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        node1.data = 1;
        node2.data = 2;
        node3.data = 3;
        link.add(node1);
        link.add(node3);
        link.add(node2);
        System.out.println(link.head.data);
        System.out.println(link.last.data);
        System.out.println(link.get(2));

        link.traversal(head);
        System.out.println();

        link.reverseTraversal(last);
        System.out.println();

        System.out.println(link.size());
        link.remove(3);
        link.traversal(head);

    }
}



class Node{
    Node previous;
    Node next;
    Object data;

    public Node() {
    }

    public Node(Node previous, Node next, Object data) {
        this.previous = previous;
        this.next = next;
        this.data = data;
    }

}