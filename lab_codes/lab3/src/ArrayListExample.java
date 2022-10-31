import java.util.*;

public class ArrayListExample {
    public static void main(String[] args)
    {
        ArrayList<Integer> arrli = new ArrayList<Integer>();


        for (int i = 1; i <= 5; i++) arrli.add(i);
        System.out.println(arrli.size());

        arrli.add(5);
        System.out.println(arrli.size());

        System.out.println(arrli);
        arrli.remove(3);
        System.out.println(arrli);
    }
}
