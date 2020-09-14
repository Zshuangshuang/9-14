/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-09-14
 * Time:20:13
 **/

class Node{
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
public class MyLinkedList {
    public Node head;

    public MyLinkedList() {
        this.head = null;
    }
    public void addLast(int data){
        Node cur  = this.head;
        Node node  = new Node(data);
        if (this.head == null){
            this.head = node;
            return;
        }
        while(cur.getNext() != null){
            cur = cur.getNext();
        }
       cur.setNext(node);
    }
    public void display(){
        Node cur = this.head;
        while(cur != null){
            System.out.print(cur.getData()+"  ");
            cur = cur.getNext();
        }
    }
    public Node findPrev(int toRemove){
        Node cur = this.head;
        while(cur.getNext() != null){
            if (cur.getNext().getData() == toRemove){
                return cur;
            }
            cur = cur.getNext();
        }
        return  null;
    }
    public void remove(int toRemove){
        Node tmp = findPrev(toRemove);
        if (this.head == null){
            return;
        }
        if (tmp == null){
            return;
        }
        Node prev = findPrev(toRemove);
        Node del = prev.getNext();
        prev.setNext(del.getNext());
    }
    public void RemoveAllKey(int toRemove) {
        Node prev = this.head;
        Node cur = this.head.getNext();
        while(cur != null){
            if (cur.getData() == toRemove){
                prev.setNext(cur.getNext());
                cur = cur.getNext();
            }
            prev = cur;
            cur = cur.getNext();
        }
        if (this.head.getData() == toRemove){
            this.head = this.head.getNext();
        }
    }
}
