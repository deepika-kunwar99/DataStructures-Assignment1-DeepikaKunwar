package com.cestar.artifactvault;
import java.util.Arrays;

public class ArtifactVault {
    private String[] inventory;  // Array to store artifacts
    private int currentCount;     // Current number of artifacts in storage

    // Constructor to initialize the storage with a specified capacity
    public ArtifactVault(int capacity) {
        inventory = new String[capacity];  // Create an array with the defined capacity
        currentCount = 0;  // Start with no artifacts
    }

    // Method to add an artifact to the next available slot
    public void addArtifact(String artifact) {
        if (currentCount < inventory.length) {  // Check if there is space available
            inventory[currentCount] = artifact;  // Place the artifact in the next slot
            currentCount++;  // Increment the count of artifacts
            Arrays.sort(inventory, 0, currentCount);  // Sort the array by artifact names
            System.out.println(artifact + " successfully added to storage.");  // Confirm addition
        } else {
            System.out.println("Storage is full. Cannot add " + artifact);  // Notify if storage is full
        }
    }

    // Method to remove an artifact by its name
    public void removeArtifact(String artifactName) {
        int index = findArtifactByLinearSearch(artifactName);  // Search for the artifact using linear search
        if (index >= 0) {  // If the artifact is found
            for (int i = index; i < currentCount - 1; i++) {
                inventory[i] = inventory[i + 1];  // Shift artifacts to fill the gap
            }
            inventory[currentCount - 1] = null;  // Clear the last artifact
            currentCount--;  // Decrease the count of artifacts
            System.out.println(artifactName + " removed from storage.");  // Confirm removal
        } else {
            System.out.println(artifactName + " not found in storage.");  // Notify if the artifact is not found
        }
    }

    // Method to find an artifact using linear search
    public int findArtifactByLinearSearch(String artifactName) {
        for (int i = 0; i < currentCount; i++) {  // Iterate through the inventory
            if (inventory[i].equals(artifactName)) {  // Check for a match
                System.out.println(artifactName + " found at index " + i + " via Linear Search.");  // Confirm finding
                return i;  // Return the index of the found artifact
            }
        }
        System.out.println(artifactName + " not found via Linear Search.");  // Notify if not found
        return -1;  // Return -1 to indicate not found
    }

    // Method to find an artifact using binary search
    public int findArtifactByBinarySearch(String artifactName) {
        int left = 0, right = currentCount - 1;  // Set left and right pointers for the search range
        while (left <= right) {  // Continue while the search range is valid
            int mid = left + (right - left) / 2;  // Find the middle index
            int comparison = inventory[mid].compareTo(artifactName);  // Compare the middle artifact

            if (comparison == 0) {  // If found
                System.out.println(artifactName + " found at index " + mid + " via Binary Search.");  // Confirm finding
                return mid;  // Return the index of the found artifact
            } else if (comparison < 0) {  // If the middle artifact is less than the target
                left = mid + 1;  // Move the left pointer to the right
            } else {  // If the middle artifact is greater than the target
                right = mid - 1;  // Move the right pointer to the left
            }
        }
        System.out.println(artifactName + " not found via Binary Search.");  // Notify if not found
        return -1;  // Return -1 to indicate not found
    }

    // Method to display all artifacts in storage
    public void displayArtifacts() {
        System.out.println("Current Inventory:");
        for (int i = 0; i < currentCount; i++) {  // Iterate through the inventory
            System.out.println(inventory[i]);  // Print each artifact
        }
    }

    // Main method for testing the ArtifactStorage functionality
    public static void main(String[] args) {
        // Create an ArtifactStorage with a capacity of 5
        ArtifactVault storage = new ArtifactVault(5);

        // Add artifacts to storage
        storage.addArtifact("Golden Idol");
        storage.addArtifact("Ancient Vase");
        storage.addArtifact("Silver Coin");
        storage.addArtifact("Bronze Statue");

        // Display the current inventory
        storage.displayArtifacts();

        // Search for an artifact using linear search
        storage.findArtifactByLinearSearch("Silver Coin");

        // Search for an artifact using binary search
        storage.findArtifactByBinarySearch("Ancient Vase");

        // Remove an artifact from storage
        storage.removeArtifact("Ancient Vase");

        // Display inventory after removal
        storage.displayArtifacts();

        // Add another artifact
        storage.addArtifact("Emerald Gem");

        // Display final state of storage
        storage.displayArtifacts();
    }
}
