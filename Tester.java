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
        System.out.println(tester.toStringReversed());
        System.out.println(new MyLinkedList());
        System.out.println(new MyLinkedList().toStringReversed());
        MyLinkedList oneelement = new MyLinkedList();
        oneelement.add("1");
        System.out.println(oneelement);
        System.out.println(oneelement.toStringReversed());

        System.out.println(tester.remove(2));
        System.out.println(tester);
        System.out.println(tester.remove(2));
        System.out.println(tester);
        System.out.println(tester.remove(0));
        System.out.println(tester);
        System.out.println(tester.remove(tester.size()-1));
        System.out.println(tester);
        System.out.println(tester.remove(0));
        System.out.println(tester);
        System.out.println(tester.remove(0));
        System.out.println(tester);

        MyLinkedList list1 = new MyLinkedList();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        list1.add("5");
        list1.add("6");
        list1.set(2,"-");
        list1.set(3,"+");
        System.out.println(list1);
        MyLinkedList list2 = new MyLinkedList();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        list2.add("5");
        list2.add("6");
        list2.set(2,"-");
        list2.set(3,"+");
        System.out.println(list2);
        list1.extend(list2);
        System.out.print(list1);
        System.out.println(list1.size());
        System.out.print(list2);
        System.out.println(list2.size());
        list1.extend(list2);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list1.size());
        System.out.println(list2.size());
        list2.extend(list1);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list1.size());
        System.out.println(list2.size());
        for (int i = 0; i < 12; i++) {
            list2.remove(0);
        }
        System.out.println(list1);
        System.out.println(list2);
        list1.extend(list2);
        System.out.print(list1);
        System.out.println(list1.size());
        System.out.print(list2);
        System.out.println(list2.size());
        list1.add("Hi");
        list1.extend(list2);
        System.out.println(list1);
        System.out.println(list2);
        list2.extend(list1);
        System.out.println(list1);
        System.out.println(list2);
        list1.add("Hi");
        list1.extend(list2);
        System.out.println(list1);
        System.out.println(list2);
    }
}