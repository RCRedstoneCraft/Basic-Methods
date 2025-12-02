package Methods;

public class NewArrayList<T> {
    private T[] data;

    public NewArrayList() {
        data = (T[]) new Object[0]; // interne Speicherung
    }

    public void add(T element) {
        resize();
        data[data.length-1] = element;
    }

    public T get(int index) {
        return data[index];
    }

    private void resize() {
        T[] newData = (T[]) new Object[data.length + 1];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }
}