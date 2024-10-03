Name: Deepika Kunwar
Id: c0909938
1. ArtifactVault Challenge
Description:
The ArtifactVault challenge involved creating a class, ArtifactVault, designed to manage a collection of ancient artifacts using an array. The class includes methods for adding artifacts, removing them by name, and searching through them using both linear and binary search techniques. This challenge aimed to deepen my understanding of array manipulation and search algorithms.

Approach:
I began by defining the ArtifactVault class, incorporating an array to store the artifacts and a variable to track the current count of items. The main methods implemented were:

addArtifact(String artifact): Adds an artifact to the next available slot in the array and sorts the array to maintain order.
removeArtifact(String name): Utilizes linear search to find and remove an artifact by name, adjusting subsequent artifacts to close any gaps.
findArtifactLinear(String name): Implements linear search to locate an artifact.
findArtifactBinary(String name): Uses binary search, assuming the artifacts are sorted.
printArtifacts(): Displays the list of current artifacts.
Assumptions and Design Decisions:
I assumed artifact names correlate with their historical significance, so sorting by name is the primary criterion. The array has a fixed size, meaning no new artifacts can be added without removing an existing one. The sorting function was integrated into addArtifact to ensure order is maintained for binary search efficiency.

Running the Code:
To execute the ArtifactVault code, copy it into a new file named ArtifactVault.java, then compile and run it. The main method contains various test cases demonstrating the functionality of the ArtifactVault class.

2. LabyrinthPath Challenge
Description:
The LabyrinthPath class is a linked list implementation that tracks locations within a labyrinth. The program allows users to add new locations, remove the most recently visited one, check for loops (indicative of traps), and print the current path of locations.

Challenges and Approaches:
Creating a linked list structure presented the primary challenge, as each node represents a location. I utilized a nested Node class for this purpose, containing a location string and a pointer to the next node. The LabyrinthPath class facilitates operations on the linked list, including:

Adding locations to the end of the list.
Removing the last location with careful consideration of edge cases (empty list, single node).
Detecting loops using Floyd's Cycle Detection Algorithm, which employs two pointers for efficient loop detection.
Printing the path to provide a visual representation of locations.
Assumptions and Design Decisions:
I assumed that each location in the list is unique, with no duplicates allowed. A singly linked list was chosen for its simplicity and clarity, adequately addressing the functional requirements. Error handling was incorporated through print statements that indicate the status of the path during operations.

Running the Code:
To run the LabyrinthPath code, paste it into a new file named LabyrinthPath.java, compile, and execute it. The main method includes test cases showcasing the LabyrinthPath class functionality.

3. ScrollStack Challenge
Description:
The ScrollStack challenge required the creation of a ScrollStack class that employs a stack data structure to manage ancient scrolls. This class supports operations like pushing new scrolls, popping the top scroll, peeking at the top scroll without removing it, and checking for a specific scroll title's existence.

Approach:
I implemented the ScrollStack class using Java's LinkedList as the underlying data structure. This choice was based on LinkedList’s efficiency and flexibility for stack operations. The key methods included:

push(String title): Adds a new scroll to the stack and prints a confirmation.
pop(): Removes and returns the top scroll while gracefully handling empty stack scenarios.
peek(): Returns the title of the top scroll without removal, checking for emptiness.
contains(String title): Checks if a specific scroll exists in the stack.
isEmpty(): Determines if the stack is empty.
Assumptions and Design Decisions:
I assumed scroll titles are unique to avoid duplicates. Utilizing LinkedList allows for dynamic resizing and efficient operations, aligning with the Last In First Out (LIFO) principle. Print statements confirm actions performed on the stack, aiding in debugging and demonstrating functionality.

Running the Code:
To execute the ScrollStack code, copy it into a new file named ScrollStack.java, compile and run the program. The main method contains test cases that illustrate the functionality of the ScrollStack class.

4. ExplorerQueue Challenge
Description:
The ExplorerQueue challenge involved implementing a queue data structure to manage explorers awaiting exploration tasks. The ExplorerQueue class supports operations such as adding new explorers, removing them, peeking at the next explorer, and checking the queue's status (full or empty).

Approach:
I implemented the ExplorerQueue class using a circular array to optimize queue operations. Key methods included:

enqueue(String explorer): Adds a new explorer to the back of the queue, handling full queue scenarios.
dequeue(): Removes and returns the front explorer, ensuring checks for an empty queue.
peek(): Returns the next explorer without removal, checking for emptiness.
isFull(): Determines if the queue is at capacity.
isEmpty(): Checks if the queue is empty.
Assumptions and Design Decisions:
I assumed the queue has a fixed capacity, set during creation, with unique explorer names. The circular array structure allows efficient space utilization, enabling wrap-around for enqueue and dequeue operations. Print statements confirm actions performed on the queue for debugging and functionality demonstration.

Running the Code:
To run the ExplorerQueue code, copy it into a new file named ExplorerQueue.java, compile and execute it. The main method contains test cases that illustrate the ExplorerQueue class functionality.

5. ClueTree Challenge
Description:
The ClueTree challenge required implementing a binary search tree (BST) to manage clues for a treasure hunt. The ClueTree class supports various operations such as inserting clues, traversing the tree (in-order, pre-order, post-order), finding specific clues, and counting the total number of clues.

Approach:
I developed the ClueTree class with a nested Node class to represent each clue in the tree. Key features include:

insert(String clue): Adds a clue while maintaining BST properties.
inOrder(), preOrder(), postOrder(): Implements the three traversal methods for different viewing orders.
find(String clue): Searches for a specific clue.
count(): Returns the total number of clues in the tree.
Assumptions and Design Decisions:
I assumed clues are unique and compared based on string values. The BST structure enables efficient insertion, searching, and traversal of clues, with left children containing lexicographically smaller clues and right children containing larger clues. Print statements confirm actions taken on the tree, aiding in debugging and demonstrating functionality.

Running the Code:
To run the ClueTree code, paste it into a new file named ClueTree.java, compile and execute it. The main method includes test cases showcasing the functionality of the ClueTree class.
