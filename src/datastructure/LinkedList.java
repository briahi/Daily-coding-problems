package datastructure;

public class LinkedList {
    Node head;

    public void append(int value) {
    if(head==null)
        head=new Node(value);
    Node current=head;
    while (current.next!=null)
        current=current.next;

    current.next=new Node(value);
    }
public void prepend(int value){
    Node temp=new Node(value);
    temp.next=head;
    head=temp;
}

public void deleteValue(int value){
        if (head.value==value){
            head=head.next;
            return;
        }
        Node current=head;
        while(current!=null){
            if(current.next.value==value){
                current.next=current.next.next;
                return;
            }
            current=current.next;
        }

}
    public class Node {
        int value;
        Node next;
        public Node(int value){
            this.value=value;
        }
    }
 public void print(){
        if(head!=null){
            System.out.println(head.value);
            Node temp=head;
            while (temp.next!=null){
                System.out.println(temp.next.value);
                temp=temp.next;
            }
        }
 }
    public static void main(String[] args) {
        Node n=new LinkedList().new Node(1);
        LinkedList linkedList=new LinkedList();
        linkedList.head=n;
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        linkedList.print();
        linkedList.append(6);
        linkedList.print();
        linkedList.deleteValue(4);
        linkedList.print();
    }
}
