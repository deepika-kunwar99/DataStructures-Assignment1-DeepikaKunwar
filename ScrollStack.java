package com.cestar.datastructure;

import java.util.LinkedList;

public class ScrollStack {
    private LinkedList<String> stack;

    public ScrollStack() {
        this.stack = new LinkedList<>();
    }

    // Push a new scroll onto the stack
    public void push(String title) {
        stack.addFirst(title);
        System.out.println("Pushed scroll: " + title);
    }

    // Pop the top scroll off the stack
    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return null;
        }
        String title = stack.removeFirst();
        System.out.println("Popped scroll: " + title);
        return title;
    }

    // Peek at the top scroll without removing it
    public String peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek.");
            return null;
        }
        return stack.getFirst();
    }

    // Check if a specific scroll title exists in the stack
    public boolean contains(String title) {
        return stack.contains(title);
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        ScrollStack scrollStack = new ScrollStack();

        // Push some scrolls onto the stack
        scrollStack.push("NightMare");
        scrollStack.push("Demon");
        scrollStack.push("Cindrella and the four Knights");

        // Peek at the top scroll
        System.out.println("Top scroll: " + scrollStack.peek());

        // Check if a specific scroll exists
        String searchTitle = "The Iliad";
        if (scrollStack.contains(searchTitle)) {
            System.out.println("Scroll titled '" + searchTitle + "' exists in the stack.");
        } else {
            System.out.println("Scroll titled '" + searchTitle + "' does not exist in the stack.");
        }

        // Pop a scroll off the stack
        scrollStack.pop();

        // Peek again after popping
        System.out.println("Top scroll after popping: " + scrollStack.peek());
    }
}