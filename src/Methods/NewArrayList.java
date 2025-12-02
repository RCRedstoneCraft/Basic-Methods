package Methods;

public class NewArrayList<T> {
    private T[] data;
    private int size;

    @SuppressWarnings("unchecked")
    public NewArrayList() {
        data = (T[]) new Object[10]; // interne Speicherung
        size = 0;
    }

    /**
     *
     * @param element adds the element to the array list
     */
    public void add(T element) {
        if (size == data.length) {
            resize();
        }
        data[size++] = element;
    }

    /**
     *
     * @param index index
     * @return the item at the index
     */
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return data[index];
    }

    /**
     *
     * @return size of the array list
     */
    public int size() {
        return size;
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        T[] newData = (T[]) new Object[data.length * 2];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }
}