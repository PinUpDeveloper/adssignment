public class MyQueue<T> {
    private MyLinkedList<T> list = new MyLinkedList<>();

    public void enqueue(T item) {
        list.add(item);
    }

    public T dequeue() {
        if (list.size() == 0) throw new IllegalStateException("Queue is empty");
        T item = list.get(0);
        list.remove(0);
        return item;
    }

    public T peek() {
        if (list.size() == 0) throw new IllegalStateException("Queue is empty");
        return list.get(0);
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }
}
