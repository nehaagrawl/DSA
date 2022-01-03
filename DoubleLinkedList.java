public class DoubleLinkedList {

        static class Node {
            int element;
            Node next;
            Node prev;
            public Node(int e, Node n, Node p)
            {
                element = e;
                next = n;
                prev = p;
            }
        }
        private Node head;
        private Node tail;
        private int size;

        public DoubleLinkedList() {
            head = null;
            tail = null;
            size = 0;
        }
        public int Length() {

            return size;
        }

        public boolean isEmpty() {

            return size == 0;
        }

        public void InsertLast(int e) {
            Node newest = new Node(e, null, null);
            if(isEmpty()) {
                head = newest;
            }
            else {
                tail.next = newest;
                newest.prev = tail;
            }
            tail = newest;
            size = size + 1;
        }
    public void InsertFirst(int e) {
        Node newest = new Node(e, null, null);
        if(isEmpty()) {
            head = newest;
            tail = newest;
        }
        else {
            newest.next = head;
            head.prev = newest;
            head = newest;
        }
        size = size + 1;
    }
    public void InsertPosition(int e, int position) {
        if(position <= 0 || position >= size) {
            System.out.println("Invalid Position");
            return;
        }
        Node newest = new Node(e, null, null);
        Node p = head;
        int i = 1;
        while(i < position-1) {
            p = p.next;
            i = i + 1;
        }
        newest.next = p.next;
        p.next.prev = newest;
        p.next = newest;
        newest.prev = p;
        size = size + 1;
    }
    public int DeleteFirst() {
        if(isEmpty()) {
            System.out.println("Doubly List is Empty");
            return -1;
        }
        int e = head.element;
        head = head.next;
        size = size - 1;
        if(isEmpty())
            tail = null;
        else
            head.prev = null;
        return e;
    }
    public int DeleteLast() {
        if(isEmpty()) {
            System.out.println("Doubly List is Empty");
            return -1;
        }
        int e = tail.element;
        tail = tail.prev;
        tail.next = null;
        size = size - 1;
        return e;
    }
    public int DeletePosition(int position) {
        if(position <= 0 || position >= size-1) {
            System.out.println("Invalid Position");
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
        p.next.prev = p;
        size = size - 1;
        return e;
    }
    public void Display() {
            Node p = head;
            while(p!=null) {
                System.out.print(p.element + "-->");
                p = p.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            DoubleLinkedList l = new DoubleLinkedList();
            int element;
            l.InsertLast(100);
            l.InsertLast(200);
            l.InsertLast(300);
            l.InsertLast(400);
            l.InsertLast(500);
            l.Display();
            System.out.println("Size: " + l.Length());
            l.InsertFirst(50);
            l.InsertFirst(10);
            l.Display();
            System.out.println("Size: " + l.Length());
            l.InsertPosition(75, 3);
            l.Display();
            System.out.println("Size: " + l.Length());
            element = l.DeleteFirst();
            System.out.println("Deleted Element: " + element);
            l.Display();
            System.out.println("Size: " + l.Length());
            element = l.DeleteLast();
            System.out.println("Deleted Element: " + element);
            l.Display();
            System.out.println("Size: " + l.Length());
            element = l.DeletePosition(3);
            System.out.println("Deleted Element: " + element);
            l.Display();
            System.out.println("Size: " + l.Length());

        }
    }


