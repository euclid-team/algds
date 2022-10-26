public class ThisExample {
    int x;
    // Constructor with a parameter
    public ThisExample(int x) {
        this.x = x;
    }
    // Call the constructor
    public static void main(String[] args) {
        ThisExample myObj = new ThisExample(5);
        System.out.println("Value of x = " + myObj.x);
    }
}
