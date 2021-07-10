package DataStructure;

import java.util.Arrays;

public class StackUsingAnArray {

    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.display();

        System.out.println("First Pop Element "+stack.pop());
        System.out.println("Second Pop Element "+stack.pop());
        System.out.println("Third Pop Element "+stack.pop());

        System.out.println("TopMost Element in stack is"+stack.peek());
    }
}
class Stack {
    //Initialize the size of stack
    int MAX_SIZE=5;
    //Create an array Of Size 5 meaning only 5 elemts can be inserted
    int [] stackArray=new int [MAX_SIZE];
    //Initialize the starting element to -1
    int top=-1;
    //In push operation increment the top and insert the element
    public void push(int a) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            stackArray[++top] = a;
        }
    }

    private boolean isFull() {
        if (top == MAX_SIZE - 1)
            return true;
        else
            return false;
    }

    //In pop operation return the element and then decreament the top
    //first check whether stack is empty or not
    public int pop(){
        if(top<0){
            System.out.println("Stack is Empty");
            return 0;
        }else{
            return  stackArray[top--];
        }
    }

    //In peek operation we just retunrs the top most element
    public int peek(){

        return stackArray[top];
    }
    public void display(){
        System.out.println("Length of the array "+stackArray.length);
        System.out.println("Stack Elements are:");
        for(int elements: stackArray){
            System.out.println(elements);
        }
    }

}
