package DataStructure;

public class SingleLinkedList {
    ListNode head;

    //create a List node
    private static class ListNode {
        int data;
        ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static void main(String[] args) {
        SingleLinkedList s1=new SingleLinkedList();//head-->null
        //Created a new nodes
        s1.head=        new ListNode(10);// head->10
        ListNode second=new ListNode(20); //second--> 20 --> Null
        ListNode third=new ListNode(30);  //third -->30  --> Null
        ListNode fourth=new ListNode(40);  //fourth -->40 -->Null


        //connect the nodes together
        s1.head.next=second;
        second.next=third;
        third.next=fourth;

        s1.printList();
        s1.deleteANoteAtBegining();
        System.out.println("After deleting a element from the begining");
        s1.printList();
        s1.deleteANodeAtTheEnd();
        System.out.println("After deleting a element from end");
        s1.printList();
        s1.deleteElementAtAGivenPosition(2);
        System.out.println("After deleting a element at a given position");
        s1.printList();


       /*int noOfElements= s1.countNoOfElementsInList();
        System.out.println("No of Elements "+noOfElements);

       //Insert Element at the begining
        s1.insertElementAtTheBegining(50);
        s1.insertElementAtTheBegining(60);
        s1.printList();
        int noOfElementsAfterInsertingAtTheBegining= s1.countNoOfElementsInList();
        System.out.println("No of Elements "+noOfElementsAfterInsertingAtTheBegining);

        //Insert Elements At The End
       *//* s1.insertElementAtTheEnd(10);
        s1.insertElementAtTheEnd(20);
        s1.insertElementAtTheEnd(30);
        s1.insertElementAtTheEnd(40);
        s1.printList();*//*

        //InsertElementAtTheRequiredPosition
        s1.insertElementAtTheGivenPosition(1,10);
        s1.insertElementAtTheGivenPosition(2,20);
        s1.insertElementAtTheGivenPosition(3,30);
        s1.printList();
        s1.insertElementAtTheGivenPosition(2,40);
        System.out.println("Elements are after inserting at position 2");
        s1.printList();*/
    }



    public int countNoOfElementsInList() {
        int count=0;
        ListNode current=head;//Current will point to the head
        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
    }

    public void printList(){
        ListNode current=head;
        System.out.println("Elements in the Linked List are :");
        while(null!=current){
            System.out.println(current.data);
            current=current.next;
        }
    }
    public void insertElementAtTheBegining(int value){
        ListNode newNode=new ListNode(value);
        newNode.next=head;
        head=newNode;
    }

    public void deleteANoteAtBegining(){
        ListNode temp=head;
        head=head.next;
        temp.next=null;

    }

    public void insertElementAtTheEnd(int value) {
        ListNode newNode = new ListNode(value);
        if(head==null){
            head=newNode;
            return;
        }
        ListNode current=head;
        while(null!=current.next){
            current=current.next;
        }
        current.next=newNode;
    }

    public void deleteANodeAtTheEnd(){
        if (head==null || head.next==null){
            return;
        }
        ListNode current=head;
        ListNode previous=null;
        while(null!=current.next){
            previous=current;//just to get previous node befor current node so that we can delete the current node
        current=current.next;
        }
        previous.next=null;
    }

    public void insertElementAtTheGivenPosition(int position, int value){
        ListNode node=new ListNode(value);
        if(position==1){
            node.next=head;
            head=node;
        }
        else{
            ListNode previous=head;
            int count=1;
            while(count<position-1){
                previous=previous.next;
                count++;
            }
            ListNode current=previous.next;
            node.next=current;
            previous.next=node;
        }

    }

    public void deleteElementAtAGivenPosition(int position){
        if (position==1){
            head=head.next;
        }
        else {
            ListNode previous=head;
            int count=1;
            while(count<position-1){
                previous=previous.next;
                count++;
            }
            ListNode current=previous.next;
            previous.next=current.next;
        }
    }


}
