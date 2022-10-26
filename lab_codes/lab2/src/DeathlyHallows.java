abstract class Book {
    public abstract void page();
}
public class DeathlyHallows extends Book {
    public void page()
    {
        System.out.println("It is the unknown we fear when we look upon death and darkness, nothing more.");
    }
    public static void main(String[] args)
    {
        Book obj = new DeathlyHallows();
        obj.page();
    }
}
