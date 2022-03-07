package school.datastructure;

class DQNode{
    char data;
    int length;
    DQNode rlink;
    DQNode llink;
}

class DQueue{
    DQNode front;
    DQNode rear;

    int total=0;
    int timeQuantum=2;

    public DQueue(){
        front=null;
        rear=null;
    }
    public boolean isEmpty(){
        return (front == null);
    }
    public void insertFront(char item,int time){
        DQNode newNode = new DQNode();
        newNode.data = item;
        newNode.length=time;
        if(isEmpty()){
            front = newNode;
            rear = newNode;
            front.length= newNode.length;
            newNode.rlink = null;
            newNode.llink = null;
        }else {
            front.length= newNode.length;
            front.llink=newNode;
            newNode.rlink=front;
            newNode.llink=null;
            front = newNode;
        }
        System.out.println("Front Inserted Item : " + item + "는"+time+ " 초");
    }
    public void insertRear(char item){
        DQNode newNode = new DQNode();
        newNode.data = item;
        if(isEmpty()){
            front = newNode;
            rear = newNode;
            newNode.rlink = null;
            newNode.llink = null;
        }else {
            rear.rlink = newNode;
            newNode.rlink = null;
            newNode.llink = rear;
            rear = newNode;
        }
        System.out.println("Rear Inserted Item : " + item);
    }
    public char deleteFront(){
        if(isEmpty()){
            System.out.println("Front Deleting fail! DQueue is Empty!!");
            return 0;
        }else {
            char item = front.data;
            if(front.rlink == null){
                front = null;
                rear = null;
            }
            else {
                front = front.rlink;
                front.llink = null;
            }
            if (timeQuantum < front.length) {
                front.length -= timeQuantum;
                this.total += this.timeQuantum;
            } else {
                this.total += front.length;
            }
            return item;
        }
    }
    public char deleteRear(){
        if(isEmpty()){
            System.out.println("Rear Deleting fail! DQueue is empty!!");
            return 0;
        }else {
            char item = rear.data;
            if(rear.llink == null){
                rear = null;
                front = null;
            }else {
                rear = rear.llink;
                rear.rlink = null;
            }
            return item;
        }
    }
    public void removeFront(){
        if(isEmpty()){
            System.out.println("Front Removing fail! DQueue is empty");
        }else {
            if(front.rlink == null){
                front = null;
                rear = null;
            }else {
                front = front.rlink;
                front.llink = null;
            }
        }
    }
    public void removeRear(){
        if(isEmpty()){
            System.out.println("Rear Removing Fail! DQueue is empty!");
        }else {
            if(rear.llink == null){
                rear = null;
                front = null;
            }else {
                rear = rear.llink;
                rear.rlink = null;
            }
        }
    }
    public char peekFront(){
        if(isEmpty()){
            System.out.println("Front Peeking fail! DQueue is empty!");
            return 0;
        }else return front.data;
    }
    public char peekRear(){
        if(isEmpty()){
            System.out.println("Rear Peeking fail! DQueue is empty!");
            return 0;
        }else return rear.data;
    }
    public void printDQueue(){
        if (isEmpty()) System.out.printf("DQueue is empty!! %n %n");
        else {
            DQNode temp = front;
            System.out.println("DQueue>> ");
            while(temp != null){
                System.out.printf("%c ", temp.data);
                temp = temp.rlink;
            }
            System.out.println();
            System.out.print("총 처리시간은"+this.total+"초");
            System.out.println();
            System.out.println();
        }
    }
}

public class Ex_8_4 {
    public static void main(String[] args) {
        char deletedItem;
        DQueue dq = new DQueue();

        dq.insertFront('A',5);
        dq.insertFront('B',2);
        dq.insertFront('C',1);
        dq.printDQueue();

        deletedItem = dq.deleteFront();
        if(deletedItem != 0) System.out.println("Front deleted Item : " + deletedItem);
        dq.printDQueue();
        deletedItem = dq.deleteFront();
        if(deletedItem != 0) System.out.println("Front deleted Item : " + deletedItem);
        dq.printDQueue();
        deletedItem = dq.deleteFront();
        if(deletedItem != 0) System.out.println("Front deleted Item : " + deletedItem);
        dq.printDQueue();


//        deletedItem = dq.deleteRear();
//        if(deletedItem != 0) System.out.println("Rear deleted Item : " + deletedItem);
//        dq.printDQueue();

//        dq.insertRear('D'); dq.printDQueue();
//        dq.insertFront('E'); dq.printDQueue();
//        dq.insertFront('F'); dq.printDQueue();
    }
}