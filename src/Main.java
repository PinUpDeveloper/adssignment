public class Main {
    public static void main(String[] args) {
        System.out.println("===== MyArrayList Test =====");
        MyList<String> arrayList = new MyArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println("ArrayList[1]: " + arrayList.get(1));
        arrayList.remove(1);
        System.out.println("ArrayList after remove index 1: " + arrayList.get(1));

        System.out.println("\n===== MyLinkedList Test =====");
        MyList<String> linkedList = new MyLinkedList<>();
        linkedList.add("X");
        linkedList.add("Y");
        linkedList.add("Z");
        System.out.println("LinkedList size: " + linkedList.size());
        System.out.println("LinkedList[2]: " + linkedList.get(2));
        linkedList.remove(1);
        System.out.println("LinkedList after remove index 1: " + linkedList.get(1));

        System.out.println("\n===== MyStack Test =====");
        MyStack<Integer> stack = new MyStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack pop: " + stack.pop());
        System.out.println("Stack peek: " + stack.peek());
        System.out.println("Stack size: " + stack.size());

        System.out.println("\n===== MyQueue Test =====");
        MyQueue<String> queue = new MyQueue<>();
        queue.enqueue("first");
        queue.enqueue("second");
        queue.enqueue("third");
        System.out.println("Queue dequeue: " + queue.dequeue());
        System.out.println("Queue peek: " + queue.peek());
        System.out.println("Queue size: " + queue.size());

        System.out.println("\n===== MyMinHeap Test =====");
        MyMinHeap<Integer> heap = new MyMinHeap<>();
        heap.add(5);
        heap.add(3);
        heap.add(8);
        heap.add(1);
        System.out.println("Min in heap: " + heap.peek());
        System.out.println("Removed min: " + heap.poll());
        System.out.println("New min: " + heap.peek());
        System.out.println("Heap size: " + heap.size());
    }
}
