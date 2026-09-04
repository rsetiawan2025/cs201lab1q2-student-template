public class SinglyLinkedListTest {

    public static void main(String[] args) {

        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        System.out.println("Add First - 1");
        list.addFirst(1);
        System.out.println("Linked List : " + list);
        System.out.println("First Element : " + list.first());
        System.out.println("Last Element : " + list.last());

        System.out.println("\nRemove Last");
        list.removeLast();
        System.out.println("Linked List : " + list);
        System.out.println("First Element : " + list.first());
        System.out.println("Last Element : " + list.last());

        System.out.println("\nAdd First - 1");
        list.addFirst(1);
        System.out.println("Linked List : " + list);
        System.out.println("First Element : " + list.first());
        System.out.println("Last Element : " + list.last());

        System.out.println("\nAdd First - 2");
        list.addFirst(2);
        System.out.println("Linked List : " + list);
        System.out.println("First Element : " + list.first());
        System.out.println("Last Element : " + list.last());

        System.out.println("\nAdd Last - 3");
        list.addLast(3);
        System.out.println("Linked List : " + list);
        System.out.println("First Element : " + list.first());
        System.out.println("Last Element : " + list.last());

        System.out.println("\nAdd Last - 4");
        list.addLast(4);
        System.out.println("Linked List : " + list);
        System.out.println("First Element : " + list.first());
        System.out.println("Last Element : " + list.last());

        System.out.println("\nRemove Last");
        list.removeLast();
        System.out.println("Linked List : " + list);
        System.out.println("First Element : " + list.first());
        System.out.println("Last Element : " + list.last());

        System.out.println("\nReverse Linked List");
        list.reverse();
        System.out.println("Linked List : " + list);
        System.out.println("First Element : " + list.first());
        System.out.println("Last Element : " + list.last());
    }
}