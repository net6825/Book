package school.datastructure;

interface Queue {
    boolean isEmpty();

    void enQueue(char item, int time);

    char deQueue();

    void delete();

    char peek();
}

class QNode {
    char data;
    QNode link;
    int size;
}

class LinkedQueue implements Queue {
    QNode front;
    QNode rear;
    int timeQuantum = 2;
    int total;

    public LinkedQueue() {
        front = null;
        rear = null;
    }

    @Override
    public boolean isEmpty() {
        return (front == null);
    }

    @Override
    public void enQueue(char item, int time) {
        QNode newNode = new QNode();
        newNode.data = item;
        newNode.link = null;
        newNode.size = time;
        if (isEmpty()) {
            newNode.size = time;
            front = newNode;
            rear = newNode;
        } else {
            newNode.size = time;
            rear.link = newNode;
            rear = newNode;
        }
        System.out.println("삽입: "+item + "/ 크기: " + newNode.size);
    }

    @Override
    public char deQueue() {
        char item = front.data;
        LinkedQueue temp = new LinkedQueue();
        if (isEmpty()) {
            System.out.println("Deleting fail! Linked Queue is empty!!");
            return 0;
        } else {
            if (timeQuantum >= front.size) {
                total += front.size;
                front = front.link;
                if (front == null) rear = null;
                System.out.println("현재 처리 시간 "+ total);
                return 0;
            } else {
                enQueue(front.data, front.size - 2);
                total += timeQuantum;
                front.size -= timeQuantum;
                System.out.println("현재 처리 시간 "+ total);
//                temp.enQueue(front.data,front.size);

                front = front.link;
                if (front == null) rear = null;
                return item;
            }
        }
    }


    @Override
    public void delete() {
        if (isEmpty()) System.out.println("Deleting fail! Linked Queue is empty!");
        else {

            front = front.link;
            if (front == null) rear = null;
        }
    }

    @Override
    public char peek() {
        if (isEmpty()) {
            System.out.println("Peeking fail! Linked Queue is empty!!");
            return 0;
        } else return front.data;
    }

    public void printQueue() {
        if (isEmpty()) System.out.printf("Linked Queue is empty!! %n %n");
        else {
            QNode temp = front;
            System.out.printf("Linked Queue>> ");
            while (temp != null) {
                System.out.printf("%c ", temp.data);
                temp = temp.link;
            }
            System.out.println();
            System.out.println();
        }
    }
}

public class Ex_8_3 {
    public static void main(String[] args) {
        char deletedItem;
        LinkedQueue lq = new LinkedQueue();

        lq.enQueue('A', 5);
        lq.printQueue();
        lq.enQueue('F', 7);
        lq.printQueue();
        lq.enQueue('B', 2);
        lq.printQueue();
        lq.enQueue('C', 1);
        lq.printQueue();

        deletedItem = lq.deQueue();
        if (deletedItem != 0) System.out.println("deleted Item : " + deletedItem);
        lq.printQueue();

        deletedItem = lq.deQueue();
        if (deletedItem != 0) System.out.println("deleted Item : " + deletedItem);
        lq.printQueue();

        deletedItem = lq.deQueue();
        if (deletedItem != 0) System.out.println("deleted Item : " + deletedItem);
        lq.printQueue();

        deletedItem = lq.deQueue();
        if (deletedItem != 0) System.out.println("deleted Item : " + deletedItem);
        lq.printQueue();

        deletedItem = lq.deQueue();
        if (deletedItem != 0) System.out.println("deleted Item : " + deletedItem);
        lq.printQueue();

        deletedItem = lq.deQueue();
        if (deletedItem != 0) System.out.println("deleted Item : " + deletedItem);
        lq.printQueue();

        deletedItem = lq.deQueue();
        if (deletedItem != 0) System.out.println("deleted Item : " + deletedItem);
        lq.printQueue();

        deletedItem = lq.deQueue();
        if (deletedItem != 0) System.out.println("deleted Item : " + deletedItem);
        lq.printQueue();

        deletedItem = lq.deQueue();
        if (deletedItem != 0) System.out.println("deleted Item : " + deletedItem);
         lq.printQueue();
    }
}
