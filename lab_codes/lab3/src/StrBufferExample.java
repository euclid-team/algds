public class StrBufferExample {
    public static void main(String[] args)
    {
        StringBuffer s = new StringBuffer("Hello");
        s.insert(2, "!!!");
        System.out.println(s); // returns
        s.append("Hello");
        System.out.println(s); // returns
        s.insert(0, 5);
        System.out.println(s); // returns
        s.delete(0, 5);
        System.out.println(s); // returns
        s.deleteCharAt(7);
        System.out.println(s); // returns
    }
}
