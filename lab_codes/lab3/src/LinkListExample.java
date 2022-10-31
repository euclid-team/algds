import java.util.*;

public class LinkListExample {
    public static void main(String args[])
    {
        LinkedList<String> object= new LinkedList<String>();

        object.add("A");
        object.add("B");
        object.addFirst("C");
        System.out.println(object);
        object.remove("B");
        object.removeFirst();

        System.out.println("Linked list after " + "deletion: " + object);
    }
}
