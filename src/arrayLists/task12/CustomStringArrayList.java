package arrayLists.task12;

public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    public void grow() {
        capacity *= 1.5;
        String[] tempArr = new String[capacity];
        for (int i = 0; i < elements.length; i++) {
            tempArr[i] = elements[i];
        }
        elements = tempArr;
    }
}
