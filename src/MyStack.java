public class MyStack<T> {
    private MyArrayList<T> list = new MyArrayList<>();

    public void push(T item) {
        list.add(item);
    }

    public T pop() {
        if (list.size() == 0) throw new IllegalStateException("Stack is empty");
        T item = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return item;
    }

    public T peek() {
        if (list.size() == 0) throw new IllegalStateException("Stack is empty");
        return list.get(list.size() - 1);
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }
}
