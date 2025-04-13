public interface MyList<T> {
    void add(T element);
    void add(int T);
    void add(int index, T item);
    void remove(int index);
    T get(int index);
    int size();
}