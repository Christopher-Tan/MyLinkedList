public class Tester {
    public static void main(String[] args) {
        /*MyLinkedList tester = new MyLinkedList();
        tester.add("Hi");
        System.out.println(tester.start);
        System.out.println(tester.start.getNext());
        System.out.println(tester.end);
        System.out.println(tester.end.getPrev());
        System.out.println(tester.size);
        tester.add("Hi");
        System.out.println(tester.start);
        System.out.println(tester.start.getNext());
        System.out.println(tester.end);
        System.out.println(tester.end.getPrev());
        System.out.println(tester.size);
        tester.add(1,"Hi");
        System.out.println(tester.start);
        System.out.println(tester.start.getNext());
        System.out.println(tester.end);
        System.out.println(tester.end.getPrev());
        System.out.println(tester.size);*/
        MyLinkedList tester = new MyLinkedList();
        tester.add("1");
        tester.add("2");
        tester.add("3");
        tester.add("4");
        tester.add("5");
        tester.add("6");
        for (int i = 0; i < tester.size(); i++) {
            System.out.println(tester.get(i));
        }
        tester.set(2,"-");
        tester.set(3,"+");
        for (int i = 0; i < tester.size(); i++) {
            System.out.print(tester.get(i));
        }
        System.out.println("");
        System.out.println(tester);
    }
}