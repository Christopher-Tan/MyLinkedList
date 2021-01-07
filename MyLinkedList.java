public class MyLinkedList {
    private Node start, end;
    private int size;
    
    public MyLinkedList() {
        size = 0;
    }
    
    public int size() {
        return size;
    }
    public boolean add(String value) {
        return true;
    }
    public void add(int index, String value) {
        if (size == 0) {
            Node temp = new Node(value);
            start = temp;
            end = temp;
        } else if (index == 0) {
            Node temp = new Node(value);
            start.setPrev(temp);
            temp.setNext(start);
            start = temp;
        } else if (index == size) {
            Node temp = new Node(value);
            end.setNext(temp);
            temp.setPrev(end);
            end = temp;
        } else {
            Node current = start;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            Node temp = new Node(value);
            temp.setPrev(current);
            temp.setNext(current.getNext());
            current.setNext(temp);
            current.getNext().setPrev(temp);
        }
        size++;
    }
    public String get(int index) {
        return "";
    }
    public String set(int index, String value) {
        return "";
    }
    public String toString() {
        return "";
    }
}