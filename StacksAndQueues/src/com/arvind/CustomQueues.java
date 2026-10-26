package com.arvind;

public class CustomQueues {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;

    //if we don't want to insert the size of the queue
    public CustomQueues(){
        this(DEFAULT_SIZE);
    }
    //when we want to add fix size
    public CustomQueues(int size) {
        this.data = new int[size];
    }

    public boolean insert(int item){
        if(isFull()){
            System.out.println("Queue is Full!");
            return false;
        }
        data[end] = item;
        end++;
        //data[end++] = item -> first insert the item then increase the value of end
        return true;
    }
    public int remove() throws Exception {
        if(isEmpty()){
            throw new Exception("You cannot remove from Empty Queue!!");
        }
        int removed = data[0];

        //shift the element to the left
        for (int i = 1; i < end ; i++) {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty!");
        }
        return data[0];
    }

    private boolean isEmpty() {
        return end == 0;
    }

    public boolean isFull() {
        return end == data.length;  //ptr is at last index
    }
    public void display() {
        for (int i = 0; i < end ; i++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.println("END");
    }
}
