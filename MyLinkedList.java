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
        this.add(size,value);
        return true;
    }
    public void add(int index, String value) throws IndexOutOfBoundsException {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("cannot set indices outside of the list");
        }
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
            Node currentleft = start;
            for (int i = 0; i < index - 1; i++) {
                currentleft = currentleft.getNext();
            }
            Node currentright = currentleft.getNext();
            Node temp = new Node(value);
            temp.setPrev(currentleft);
            temp.setNext(currentright);
            currentleft.setNext(temp);
            currentright.setPrev(temp);
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