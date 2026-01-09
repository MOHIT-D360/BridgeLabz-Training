# Data Structures 


### Week 3
### 📅 Day 16 – Data Structures Overview & Linked Lists  
**(Date: 03-Jan-2026)**

### 📘 Topics Covered

- Understood the **fundamentals of Data Structures**:
  - Learned how data structures organize and store data efficiently.
  - Explored their role in optimizing operations like searching, sorting, and updating.
  - Studied common examples such as Arrays, Stacks, Queues, Linked Lists, Trees, and Graphs.
  - Identified **Linked Lists** as a key structure for dynamic memory management.

- Explored **Key Features of Data Structures in Java**:
  - **Predefined and Custom Implementations**:
    - Used Java Collections Framework (Lists, Maps, Sets).
    - Designed custom data structures using classes and objects.
  - **Dynamic Memory Allocation**:
    - Learned how structures like Lists and Maps grow and shrink dynamically.
  - **Generics Support**:
    - Ensured type safety and reduced runtime errors.
  - **Thread-Safe Options**:
    - Studied concurrent collections such as `ConcurrentHashMap` and `CopyOnWriteArrayList`.

- Studied **Types of Data Structures in Java**:
  - **Linear Data Structures**:
    - Array (fixed-size, contiguous memory).
    - Linked List (dynamic node-based structure).
    - Stack (LIFO).
    - Queue (FIFO).
  - **Hierarchical Data Structures**:
    - Tree, Binary Tree, Binary Search Tree (BST).
    - Heap for priority-based operations.
  - **Graph Data Structures**:
    - Directed and undirected graphs representing relationships.
  - **Hash-Based Data Structures**:
    - HashMap for

🔗 **Code Link:**  
👉 [*Day 16 – Data Structures Overview & Linked Lists*](https://github.com/MOHIT-D360/BridgeLabz-Training/tree/java-dsa-practice/dsa-practice/gcr-codebase/JavaDsaProject/src/com/linkedlist)

---

### 📅 Day 17 – Stack, Queue & Hashing Fundamentals  
**(Date: 04-Jan-2026)**

### 📘 Topics Covered

- Studied **Stack Data Structure (LIFO)**:
  - Understood core operations: `push`, `pop`, `peek`, `isEmpty`.
  - Explored real-world use cases:
    - Function call stack in recursion.
    - Undo/Redo operations.
    - Expression evaluation and parenthesis matching.
  - Implemented **Balanced Parentheses Checker** using Stack:
    - Validated proper nesting of `()`, `{}`, and `[]`.
    - Applied stack-based traversal and matching logic.
  - Analyzed:
    - Time Complexity: **O(n)**
    - Space Complexity: **O(n)**

- Learned **Queue Data Structure (FIFO)**:
  - Understood key operations: `offer`, `poll`, `peek`, `isEmpty`.
  - Explored Java Queue implementations:
    - `LinkedList`
    - `PriorityQueue`
    - `ArrayDeque`
  - Implemented **Ticket Counter Management System**:
    - Enqueued customers as they arrived.
    - Dequeued customers in order of service.
  - Studied queue usage in:
    - Task scheduling.
    - BFS traversal.
    - Request handling systems.

- Explored **HashMap & Hashing Concepts**:
  - Understood key-value pair storage using `HashMap`.
  - Learned core methods: `put`, `get`, `remove`, `containsKey`.
  - Implemented word frequency counting using HashMap.
  - Studied internal working of HashMap:
    - Hashing and bucket indexing.
    - Collision handling using separate chaining.
    - Load factor (default: 0.75) and resizing.
  - Compared:
    - `HashMap` vs `LinkedHashMap`
    - `HashMap` vs `ConcurrentHashMap`

- Learned **Hashing Functions in Java**:
  - Understood `hashCode()` and its role in hash-based collections.
  - Studied rules for overriding `hashCode()` and `equals()`.
  - Implemented custom `hashCode()` for user-defined classes.
  - Learned best practices to minimize collisions and ensure consistency.

- Focused on:
  - Choosing the right data structure based on problem requirements.
  - Understanding internal mechanics for interview readiness.
  - Writing clean, efficient, and safe data-structure-based code.

🔗 **Code Link:**  
👉 [*Day 17 – Stack, Queue & HashMap Implementations*](https://github.com/MOHIT-D360/BridgeLabz-Training/tree/java-dsa-practice/dsa-practice/gcr-codebase/JavaDsaProject/src/com/stackandqueue)
👉 [*Day 17 –  HashMap & Hashset Implementations*](https://github.com/MOHIT-D360/BridgeLabz-Training/tree/java-dsa-practice/dsa-practice/gcr-codebase/JavaDsaProject/src/com/hashmapandhashset)

## 📅 Day 18 – Sorting Algorithms (Complete Overview)  
**📆 Date:** 05-Jan-2026  

---

## 📘 Topics Covered  

On this day, I explored **7 fundamental sorting algorithms in Java**, with a strong focus on their **core concepts, time & space complexities, and real-world use cases**.

---

## 🔹 1. Bubble Sort  
**Concept:**  
Repeatedly compares adjacent elements and swaps them if they are in the wrong order. The largest element gradually “bubbles” to the end of the array.  

**Use Case:**  
Best suited for **small datasets** or **nearly sorted arrays**.

---

## 🔹 2. Insertion Sort  
**Concept:**  
Builds the sorted array one element at a time by inserting each element into its correct position in the already sorted portion.  

**Use Case:**  
Ideal for **adaptive sorting** and **small-sized arrays**.

---

## 🔹 3. Selection Sort  
**Concept:**  
Continuously selects the minimum element from the unsorted part and places it at the beginning.  

**Use Case:**  
Useful for **simple implementations** and **small datasets**, though not very efficient.

---

## 🔹 4. Counting Sort  
**Concept:**  
Counts the frequency of each element and uses this information to place elements at their correct positions.  

**Use Case:**  
Efficient when dealing with **integer keys within a small range**.

---

## 🔹 5. Merge Sort (Divide & Conquer)  
**Concept:**  
Recursively divides the array into halves, sorts each half, and then merges them back together.  

**Use Case:**  
Preferred for **large datasets** where **stability** is required.

---

## 🔹 6. Quick Sort (Divide & Conquer)  
**Concept:**  
Selects a pivot element, partitions the array around it, and recursively sorts the partitions.  

**Use Case:**  
Highly efficient and commonly used for **large datasets** requiring **high performance**.

---

## 🔹 7. Heap Sort  
**Concept:**  
Transforms the array into a **max heap** and repeatedly extracts the largest element to sort the array.  

**Use Case:**  
Suitable for **priority-based sorting** and **in-place sorting of large datasets**.

---

## 📊 Comparison Table  

| Algorithm        | Best Case     | Average Case | Worst Case   | Space  | Stable |
|------------------|--------------|--------------|--------------|--------|--------|
| Bubble Sort      | O(n)         | O(n²)        | O(n²)        | O(1)   | Yes    |
| Insertion Sort   | O(n)         | O(n²)        | O(n²)        | O(1)   | Yes    |
| Selection Sort   | O(n²)        | O(n²)        | O(n²)        | O(1)   | No     |
| Counting Sort    | O(n + k)     | O(n + k)     | O(n + k)     | O(k)   | Yes    |
| Merge Sort       | O(n log n)   | O(n log n)   | O(n log n)   | O(n)   | Yes    |
| Quick Sort       | O(n log n)   | O(n log n)   | O(n²)        | O(log n)| No    |
| Heap Sort        | O(n log n)   | O(n log n)   | O(n log n)   | O(1)   | No     |

---

## 🔗 Code Reference  

👉 [**Day 18 – Implementation of 7 Sorting Algorithms**](https://github.com/MOHIT-D360/BridgeLabz-Training/tree/java-dsa-practice/dsa-practice/gcr-codebase/JavaDsaProject/src/com/sortingalgorithm)

---
## 📅 Day 19 – Searching Algorithms (Complete Overview)  
**📆 Date:** 06-Jan-2026  

---

## 📘 Topics Covered  

Focused on **Java best practices** for **string handling**, **file I/O**, and **searching algorithms**, reinforced through **practical and challenge-based problems**.

---

### 🔹 1. StringBuilder  
**Use When:**  
- Frequent string modifications  
- Loops or performance-critical code  

---

### 🔹 2. StringBuffer  
**Use When:**  
- Thread-safe string manipulation is required  

---

### 🔹 3. FileReader  
**Use When:**  
- Reading character-based text files  

---

### 🔹 4. InputStreamReader  
**Use When:**  
- Converting byte streams into character streams  

---

### 🔹 5. Linear Search  
**Use When:**  
- Data is **unsorted**  
- Dataset size is **small**  

---

### 🔹 6. Binary Search  
**Use When:**  
- Data is **sorted**  
- Fast lookup performance is required  

---

🔗 **Code Link:**  
👉[ Day 19 – Searching Algorithms Implementation ](https://github.com/MOHIT-D360/BridgeLabz-Training/tree/java-dsa-practice/dsa-practice/gcr-codebase/JavaDsaProject/src/com/searchingalgorithm)

---

## 📅 Day 20 – Runtime Analysis & Big O Notation  
**📆 Date:** 07-Jan-2026  

---

## 📘 Topics Covered  

Studied **Big O Notation** to analyze **time and space complexity** and evaluate **algorithm performance** as input size grows.

---

### 📊 Scenario-Based Analysis  

#### 🔍 Searching in Large Datasets  
- Linear Search → **O(N)**  
- Binary Search → **O(log N)** ✅  
  *Binary Search performs significantly better for large, sorted datasets.*

---

#### 🔁 Sorting Algorithms Comparison  
- Bubble Sort → **O(N²)**  
- Merge Sort → **O(N log N)**  
- Quick Sort → **O(N log N)** ✅  
  *Bubble Sort is impractical for large inputs.*

---

#### 🧵 String Concatenation Performance  
- String → **O(N²)**  
- StringBuilder / StringBuffer → **O(N)** ✅  
  *Mutable strings provide better performance.*

---

#### 📂 Large File Reading  
- FileReader → Character-based (slower)  
- InputStreamReader → Byte-based (faster) ✅  
  *Choosing the right stream improves performance.*

---

#### 🔢 Fibonacci Computation  
- Recursive → **O(2ⁿ)**  
- Iterative → **O(N)** ✅  
  *Iterative approach is faster and more memory-efficient.*

---

#### 🧮 Searching Using Data Structures  
- Array → **O(N)**  
- HashSet → **O(1)** ✅  
- TreeSet → **O(log N)**  
  *HashSet offers fastest lookup, while TreeSet maintains order.*

---

🔗 **Code Link:**  
👉 [Day 20 – Searching Algorithms Implementation]()

---



