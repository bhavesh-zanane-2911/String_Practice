package DataStructure;

public class QueueUsingAnArray {

    int front,rear;
    int capacity;
    int []queue;
    QueueUsingAnArray(int c){
        capacity=c;
        front=rear=0;
        queue=new int [capacity];

    }

    public void insert(int data){
        if (rear==capacity){
            System.out.println("Queue1 is Full");
        }
        else{
            queue[rear]=data;
            rear++;
        }
    }

    public void delete(){
        if(front==rear){
            System.out.println("Queue1 is empty");
        }
        else
        {
            //move the elements to the right
            for(int i=0;i<rear-1;i++){
                queue[i]=queue[i+1];
                System.out.println("Value at index "+i+" "+queue[i]);
            }
            if(rear<capacity){
                System.out.println("Rear is less than Capacity");
                queue[rear]=0;
            }
            rear--;
        }
    }

    public void display(){
        for (int data:queue){
            System.out.println(data);
        }
    }

    public static void main(String[] args) {
        QueueUsingAnArray queueUsingAnArray=new QueueUsingAnArray(5);
        queueUsingAnArray.insert(10);
        queueUsingAnArray.insert(20);
        queueUsingAnArray.insert(30);
       // queueUsingAnArray.insert(40);
       // queueUsingAnArray.insert(50);

        queueUsingAnArray.display();
        System.out.println("Capacity "+queueUsingAnArray.capacity);
        System.out.println("Front "+queueUsingAnArray.front);
        System.out.println("Rear "+queueUsingAnArray.rear);

        queueUsingAnArray.delete();
        queueUsingAnArray.display();
        System.out.println("Capacity "+queueUsingAnArray.capacity);
        System.out.println("Front "+queueUsingAnArray.front);
        System.out.println("Rear "+queueUsingAnArray.rear);


    }
}
