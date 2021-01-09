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
        this.add(size(),value);
        return true;
    }
    public void add(int index, String value) throws IndexOutOfBoundsException {
        if (index > size() || index < 0) {
            throw new IndexOutOfBoundsException("cannot change indices outside of the list");
        }
        if (size() == 0) {
            Node temp = new Node(value);
            start = temp;
            end = temp;
        } else if (index == 0) {
            Node temp = new Node(value);
            start.setPrev(temp);
            temp.setNext(start);
            start = temp;
        } else if (index == size()) {
            Node temp = new Node(value);
            end.setNext(temp);
            temp.setPrev(end);
            end = temp;
        } else {
            Node current = start;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            Node next = current.getNext();
            Node temp = new Node(value);
            temp.setPrev(current);
            temp.setNext(next);
            current.setNext(temp);
            next.setPrev(temp);
        }
        size++;
    }
    public String get(int index) throws IndexOutOfBoundsException {
        if (index >= size() || index < 0) {
            throw new IndexOutOfBoundsException("cannot get indices outside of the list");
        }
        Node current = start;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }
    public String set(int index, String value) throws IndexOutOfBoundsException {
        if (index >= size() || index < 0) {
            throw new IndexOutOfBoundsException("cannot change indices outside of the list");
        }
        Node current = start;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        String temp = current.getData();
        current.setData(value);
        return temp;
    }
    public String toString() {
        String result = "[";
        Node current = start;
        for (int i = 0; i < size() - 1; i++) {
            result += (current.getData() + ", ");
            current = current.getNext();
        }
        if (size() > 0) {
            result += end.getData();
        }
        return (result + "]");
    }
    public String toStringReversed() {
        String result = "[";
        Node current = end;
        for (int i = 0; i < size() - 1; i++) {
            result += (current.getData() + ", ");
            current = current.getPrev();
        }
        if (size() > 0) {
            result += start.getData();
        }
        return (result + "]");
    }
    public String remove(int index) throws IndexOutOfBoundsException {
        if (index >= size() || index < 0) {
            throw new IndexOutOfBoundsException("cannot change indices outside of the list");
        }
        String result = "";
        if (size() == 1) {
            result = start.getData();
            start = null;
            end = null;
        } else if (index == 0) {
            result = start.getData();
            start = start.getNext();
            start.setPrev(null);
        } else if (index == size() - 1) {
            result = end.getData();
            end = end.getPrev();
            end.setNext(null);
        } else {
            Node current = start;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            Node last = current.getPrev();
            Node next = current.getNext();
            result = current.getData();
            last.setNext(next);
            next.setPrev(last);
            
        }
        size--;
        return result;
    }
}