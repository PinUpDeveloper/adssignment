# Custom Data Structures in Java

This project implements basic data structures **from scratch** in Java,
without using `java.util.*` (except `Iterator`).

---

## 📦 Implemented Classes

### ✅ Core Interface
- MyList<T>  
  Basic list interface with essential methods.

### ✅ Physical Data Structures
- MyArrayList<T>  
  Dynamic array implementation.
  
- MyLinkedList<T>  
  Doubly linked list implementation.

### ✅ Logical Data Structures
- MyStack<T>  
  Stack (LIFO) using MyArrayList or MyLinkedList.

- MyQueue<T>  
  Queue (FIFO) based on MyLinkedList.

- MyMinHeap<T extends Comparable<T>>  
  Min-heap using MyArrayList.

---

## 🚀 Usage Example

```java
MyList<String> arrayList = new MyArrayList<>();
arrayList.add("A");
System.out.println(arrayList.get(0)); // A

MyStack<Integer> stack = new MyStack<>();
stack.push(10);
System.out.println(stack.pop()); // 10

MyQueue<String> queue = new MyQueue<>();
queue.enqueue("hello");
System.out.println(queue.dequeue()); // hello

MyMinHeap<Integer> heap = new MyMinHeap<>();
heap.add(5);
heap.add(2);
System.out.println(heap.peek()); // 2
```

🧪 Testing

Run Main.java to test:
```
    MyArrayList

    MyLinkedList

    MyStack

    MyQueue

    MyMinHeap
```

⚙️ Requirements

    Java 8+

    No external libraries

❌ Restrictions

    No usage of java.util.* (except Iterator)

    All data structures are built from scratch

📁 Structure
```
src/
├── Main.java
├── MyList.java
├── MyArrayList.java
├── MyLinkedList.java
├── MyStack.java
├── MyQueue.java
└── MyMinHeap.java
```



## 👨‍💻 Author

👤 Tazhibayev Marsel

📌 Astana IT University

📅 Year: 2025
