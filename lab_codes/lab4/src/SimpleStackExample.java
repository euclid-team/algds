import java.util.*;

public class SimpleStackExample {
    // Main Method
    public static void main(String[] args)
    {

        // Default initialization of Stack
        Stack stack1 = new Stack();

        // Initialization of Stack
        // using Generics
        Stack<String> stack2 = new Stack<String>();

        // pushing the elements
        stack1.push("4");
        stack1.push("Stack");
        stack1.push("Java");

        stack2.push("4");
        stack2.push("Stack");
        stack2.push("Java");

        System.out.println(stack1);
        System.out.println(stack2);
        System.out.println(stack2==stack1);
        System.out.println(stack2.equals(stack1));

        boolean result = stack1.empty();
        System.out.println("Is the stack empty? " + result);


        System.out.println("The element at the top of the" + " stack is: " + stack1.peek());
        System.out.println("Stack after peek operation " + stack1);
        System.out.println("Popped element: " + stack1.pop());
        System.out.println("Stack after pop operation " + stack1);

        int position = stack2.search("cfd");
        System.out.println("Position of Stack: " + position);

    }
}

