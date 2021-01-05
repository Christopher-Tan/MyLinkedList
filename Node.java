public class Node {
    public Node(String value) {
        data = value;
    }
    private String data;
    private Node next, prev;
    
    //SET METHODS
    public void setData(String value) {
        data = value;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public void setPrev(Node prev) {
        this.prev = prev;
    }

    //GET METHODS
    public String getData() {
        return data;
    }
    public Node getNext() {
        return next;
    }
    public Node getPrev() {
        return prev;
    }
}