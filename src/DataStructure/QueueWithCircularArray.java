package DataStructure;

public class QueueWithCircularArray {
    public static void main(String[] args) {

        Queue1 queue1 = new Queue1(10);
        System.out.println("Is Queue1 Empty " + queue1.isEmpty());
        System.out.println("Is Queue1 Full " + queue1.isFull());
        queue1.enque(10);
        queue1.enque(20);
        queue1.enque(30);
        queue1.enque(40);
        queue1.enque(50);
        queue1.enque(60);
        queue1.enque(70);
        queue1.enque(80);
        queue1.enque(90);
        queue1.enque(100);
        //queue1.enque(110);

        queue1.display();

        queue1.dequeue();
        queue1.dequeue();
        queue1.dequeue();
        queue1.dequeue();
        queue1.dequeue();
        queue1.dequeue();
        queue1.dequeue();
        System.out.println("\n Elements in Queue1 after deque 7 elements");
        queue1.display();
        System.out.println("Inserting 3 more elements");
        queue1.enque(10);
        queue1.enque(20);
        queue1.enque(30);
        queue1.display();


    }
}

class Queue1 {
    int front, rear;
    int MAX_SIZE;
    int[] data;

    Queue1(int MAX_SIZE) {
        front = -1;
        rear = -1;
        this.MAX_SIZE = MAX_SIZE;
        data = new int[this.MAX_SIZE];
    }

    public Boolean isEmpty() {
        if (front == -1 && rear == -1)
            return true;
        else
            return false;
    }

    public Boolean isFull() {
        if (((rear+1)%MAX_SIZE)==front)
            return true;
        else
            return false;
    }

    public void enque(int i) {
        if (isFull())
            System.out.println("Queue1 Is Full");
        else if (isEmpty()) {
            front = rear = 0;
            data[rear] = i;
        } else {
            rear = (rear + 1)%MAX_SIZE;
            data[rear] = i;
        }
    }

    public int dequeue(){
        if(isEmpty()) {
            System.out.println("Queue1 is Empty");
            return 0;
        }
        else if(front==rear){
            int x=data[front];
            data[front]=0;
            front=-1;
            rear=-1;
            return x;
        }
        else{
            int x= data[front];
            data[front]=0;
            front=(front+1)%MAX_SIZE;
            return x;
        }
    }

    public void display() {
        for (int elements : data) {
            System.out.println("Elements are " + elements);
        }
    }
}

