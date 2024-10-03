package com.cestar.datastructure;

public class ExplorerQueue {
    private String[] queue;
    private int front, rear, size, capacity;

    public ExplorerQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new String[capacity];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    // Enqueue a new explorer
    public void enqueue(String explorer) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue explorer: " + explorer);
            return;
        }
        queue[rear] = explorer;
        rear = (rear + 1) % capacity;
        size++;
        System.out.println("Enqueued explorer: " + explorer);
    }

    // Dequeue an explorer
    public String dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue explorer.");
            return null;
        }
        String explorer = queue[front];
        front = (front + 1) % capacity;
        size--;
        System.out.println("Dequeued explorer: " + explorer);
        return explorer;
    }

    // Display the next explorer in line
    public String peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No explorer in line.");
            return null;
        }
        return queue[front];
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        ExplorerQueue explorerQueue = new ExplorerQueue(5); // Capacity of the queue is 5

        // Enqueue explorers
        explorerQueue.enqueue("Anjali");
        explorerQueue.enqueue("Biyoncee");
        explorerQueue.enqueue("Chamalian");
        explorerQueue.enqueue("Dinxta");
        explorerQueue.enqueue("Ethan");

        // Attempt to enqueue when the queue is full
        explorerQueue.enqueue("Frank");

        // Display the next explorer in line
        System.out.println("Next explorer in line: " + explorerQueue.peek());

        // Dequeue explorers
        explorerQueue.dequeue();
        explorerQueue.dequeue();

        // Display the next explorer after dequeuing
        System.out.println("Next explorer in line after dequeue: " + explorerQueue.peek());

        // Dequeue remaining explorers
        explorerQueue.dequeue();
        explorerQueue.dequeue();
        explorerQueue.dequeue();

        // Attempt to dequeue when the queue is empty
        explorerQueue.dequeue();
    }
}
