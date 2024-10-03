package com.cestar.datastructure;

public class ClueTree {

    // Inner class representing each node in the binary tree
    static class TreeNode {
        String clue;
        TreeNode left, right;

        TreeNode(String clue) {
            this.clue = clue;
            left = null;
            right = null;
        }
    }

    private TreeNode root;

    public ClueTree() {
        root = null;
    }

    // Method to insert a new clue into the binary tree
    public void addClue(String clue) {
        root = addClueRecursively(root, clue);
        System.out.println("Clue added: " + clue);
    }

    private TreeNode addClueRecursively(TreeNode current, String clue) {
        if (current == null) {
            return new TreeNode(clue);
        }
        if (clue.compareTo(current.clue) < 0) {
            current.left = addClueRecursively(current.left, clue);
        } else if (clue.compareTo(current.clue) > 0) {
            current.right = addClueRecursively(current.right, clue);
        }
        return current;
    }

    // Method for in-order traversal
    public void displayInOrder() {
        System.out.print("In-order traversal: ");
        inOrderTraversal(root);
        System.out.println();
    }

    private void inOrderTraversal(TreeNode current) {
        if (current != null) {
            inOrderTraversal(current.left);
            System.out.print(current.clue + " ");
            inOrderTraversal(current.right);
        }
    }

    // Method for pre-order traversal
    public void displayPreOrder() {
        System.out.print("Pre-order traversal: ");
        preOrderTraversal(root);
        System.out.println();
    }

    private void preOrderTraversal(TreeNode current) {
        if (current != null) {
            System.out.print(current.clue + " ");
            preOrderTraversal(current.left);
            preOrderTraversal(current.right);
        }
    }

    // Method for post-order traversal
    public void displayPostOrder() {
        System.out.print("Post-order traversal: ");
        postOrderTraversal(root);
        System.out.println();
    }

    private void postOrderTraversal(TreeNode current) {
        if (current != null) {
            postOrderTraversal(current.left);
            postOrderTraversal(current.right);
            System.out.print(current.clue + " ");
        }
    }

    // Method to find a specific clue in the tree
    public boolean containsClue(String clue) {
        return containsClueRecursively(root, clue);
    }

    private boolean containsClueRecursively(TreeNode current, String clue) {
        if (current == null) {
            return false;
        }
        if (current.clue.equals(clue)) {
            return true;
        }
        return clue.compareTo(current.clue) < 0 
            ? containsClueRecursively(current.left, clue) 
            : containsClueRecursively(current.right, clue);
    }

    // Method to count total clues in the tree
    public int totalClues() {
        return countCluesRecursively(root);
    }

    private int countCluesRecursively(TreeNode current) {
        if (current == null) {
            return 0;
        }
        return 1 + countCluesRecursively(current.left) + countCluesRecursively(current.right);
    }

    // Main method for demonstration
    public static void main(String[] args) {
        ClueTree clueTree = new ClueTree();

        // Add clues
        clueTree.addClue("The hidden treasure is beneath the old oak tree.");
        clueTree.addClue("Look for the key under the welcome mat.");
        clueTree.addClue("The map leads to the riverbank.");
        clueTree.addClue("Search near the ancient ruins.");
        clueTree.addClue("Follow the trail of footprints.");

        // Display traversals
        clueTree.displayInOrder();
        clueTree.displayPreOrder();
        clueTree.displayPostOrder();

        // Search for a specific clue
        String clueToFind = "Look for the key under the welcome mat.";
        if (clueTree.containsClue(clueToFind)) {
            System.out.println("Clue found: " + clueToFind);
        } else {
            System.out.println("Clue not found: " + clueToFind);
        }

        // Count total clues
        System.out.println("Total clues in the tree: " + clueTree.totalClues());
    }
}
