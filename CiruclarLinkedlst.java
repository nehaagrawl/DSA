public class CiruclarLinkedlst {
    static class Node 
    {
        int element;
        Node next;

        public Node(int e, Node n) {
            element = e;
            next = n;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public CiruclarLinkedlst() {
        head = null;
        tail = null;
        size = 0;
    }

    public int Length() {
        return size;
    }

    public boolean Empty() {
        return size == 0;
    }

    public void AddLast(int e) {
        Node newnode = new Node(e, null);
        if (Empty()) {
            newnode.next = newnode;
            head = newnode;
        } else {
            newnode.next = tail.next;
            tail.next = newnode;
        }
        tail = newnode;
        size = size + 1;
    }
public void AddFirst(int e) {
    Node newnode = new Node(e, null);
    if(Empty()) {
        newnode.next = newnode;
        head = newnode;
        tail = newnode;
    }
    else {
        tail.next = newnode;
        newnode.next = head;
        head = newnode;
    }
    size = size + 1;
}
public void AddPosition(int e, int position) {
    if(position <= 0 || position >= size) {
        System.out.println("please enter valid number");
        return;
    }
    Node newnode = new Node(e, null);
    Node p = head;
    int i = 1;
    while(i < position-1) {
        p = p.next;
        i = i + 1;
    }
    newnode.next = p.next;
    p.next = newnode;
    size = size + 1;
}
public int DeleteFirst() {
    if(Empty()) {
        System.out.println("Circular List is Empty");
        return -1;
    }
    int e = head.element;
    tail.next = head.next;
    head = head.next;
    size = size - 1;
    if(Empty()) {
        head = null;
        tail = null;
    }
    return e;
}
public int DeleteLast() {
    if(Empty()) {
        System.out.println("Circular List is Empty");
        return -1;
    }
    Node p = head;
    int i = 1;
    while(i < Length()-1) {
        p = p.next;
        i = i + 1;
    }
    tail = p;
    p = p.next;
    tail.next = head;
    int e = p.element;
    size = size - 1;
    return e;
}
public int DeletePosition(int position) {
    if(position <= 0 || position >= size-1) {
        System.out.println("please enter valid number");
        return -1;
    }
    Node p = head;
    int i = 1;
    while(i < position-1) {
        p = p.next;
        i = i + 1;
    }
    int e = p.next.element;
    p.next = p.next.next;
    size = size - 1;
    return e;
}

public void Disply() {
        Node p = head;
        int i = 0;
        while (i < Length()) {
            System.out.print(p.element + "-->");
            p = p.next;
            i = i + 1;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CiruclarLinkedlst l = new CiruclarLinkedlst();
        int element;
        l.AddLast(100);
        l.AddLast(200);
        l.AddLast(300);
        l.AddLast(400);
        l.AddLast(500);
        l.Disply();
        l.AddPosition(80, 3);
        l.Disply();
        System.out.println("Size: " + l.Length());
        element = l.DeleteFirst();
        System.out.println("Deleted Element: " + element);
        l.Disply();
        System.out.println("Size: " + l.Length());
        element = l.DeleteLast();
        System.out.println("Deleted Element: " + element);
        l.Disply();
        System.out.println("Size: " + l.Length());
        element = l.DeletePosition(3);
        System.out.println("Deleted Element: " + element);
        l.Disply();
        System.out.println("Size: " + l.Length());

    }
}
