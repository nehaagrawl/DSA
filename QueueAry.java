public class QueueAry {
    int[] data;
    int front;
    int rear;
    int size;

    QueueAry(int n) {
        data = new int[n];
        front = 0;
        rear = 0;
        size = 0;
    }

    public int Length() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public int Dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        } else {
            int e = data[front];
            front = front + 1;
            size = size - 1;
            return e;
        }
    }

    public void Enqueue(int e) {
        if (isFull()) {
            System.out.println("Queue is Full");
        } else {
            data[rear] = e;
            rear = rear + 1;
            size = size + 1;
        }
    }

    public void Display() {
        for (int i = front; i < rear; i++)
            System.out.print(data[i] + "<--");
        System.out.println();
    }


    public static void main(String[] args) {
        QueueAry nw=new QueueAry(8);
        
        nw.Enqueue(12);
        nw.Enqueue(2);
        nw.Enqueue(112);
        nw.Enqueue(121);
        nw.Display();
        nw.Dequeue();
        nw.Display();
        System.out.println("size :"+nw.Length());
    }
}
