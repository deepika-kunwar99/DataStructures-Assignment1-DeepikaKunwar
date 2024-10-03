package com.cestar.datastructure;

public class LabyrinthPath {
    // Node class to represent each location in the path
    private class Node {
        String location; // The location represented by the node
        Node next;      // Pointer to the next node in the list

        // Constructor to initialize a node with a location
        Node(String location) {
            this.location = location;
            this.next = null; // Next is initially null
        }
    }

    private Node head;  // Head of the linked list, representing the start of the path

    // Constructor to initialize the LabyrinthPath
    public LabyrinthPath() {
        this.head = null; // Initially, the path is empty
    }

    // Add a new location to the path
    public void addLocation(String location) {
        Node newNode = new Node(location); // Create a new node for the location
        if (head == null) {
            head = newNode;  // If the list is empty, set new node as head
        } else {
            Node current = head; // Start traversing from the head
            while (current.next != null) {
                current = current.next;  // Traverse to the end of the list
            }
            current.next = newNode;  // Add new node to the end of the list
        }
        System.out.println(location + " added to the path."); // Print confirmation
    }

    // Remove the last visited location from the path
    public void removeLastLocation() {
        if (head == null) {
            System.out.println("No locations to remove."); // No locations in the path
            return;
        }

        if (head.next == null) { // If there's only one node in the list
            System.out.println(head.location + " removed from the path."); // Print confirmation
            head = null;  // Remove the only node
        } else {
            Node current = head; // Start traversing from the head
            while (current.next.next != null) {
                current = current.next;  // Traverse to the second last node
            }
            System.out.println(current.next.location + " removed from the path."); // Print confirmation
            current.next = null;  // Remove the last node
        }
    }

    // Check if the path contains a loop (trap)
    public boolean hasLoop() {
        Node slow = head;   // Slow pointer starts at head
        Node fast = head;   // Fast pointer starts at head

        // Traverse the list with two pointers
        while (fast != null && fast.next != null) {
            slow = slow.next;             // Move slow pointer by 1
            fast = fast.next.next;       // Move fast pointer by 2
            if (slow == fast) {          // If they meet, a loop is detected
                System.out.println("Loop detected in the path."); // Print confirmation
                return true; // Return true for loop detected
            }
        }
        System.out.println("No loop detected in the path."); // Print confirmation if no loop found
        return false; // Return false if no loop detected
    }

    // Print the entire path
    public void printPath() {
        if (head == null) {
            System.out.println("Path is empty."); // If the path is empty
            return;
        }

        System.out.print("Labyrinth Path: "); // Print the start of the path
        Node current = head; // Start traversing from the head
        while (current != null) {
            System.out.print(current.location + " -> "); // Print current location
            current = current.next; // Move to the next location
        }
        System.out.println("null"); // Indicate the end of the path
    }

    // Main method to test the LabyrinthPath functionality
    public static void main(String[] args) {
        LabyrinthPath path = new LabyrinthPath(); // Create a new LabyrinthPath instance

        // Add locations to the path
        path.addLocation("Entrance");
        path.addLocation("Hallway");
        path.addLocation("Room A");
        path.addLocation("Room B");

        // Print the current path
        path.printPath();

        // Remove the last visited location
        path.removeLastLocation();

        // Print the path after removal
        path.printPath();

        // Check for loops (should be false at this point)
        path.hasLoop();

        // Create a loop for testing purposes
        path.head.next.next.next = path.head; // Manually create a loop
        path.hasLoop(); // Check for loop again
    }
}