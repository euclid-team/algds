public class LoopFor {
  public static void main(String[] args) {
    //int i = 0; i < 10; i++
    int i=4;
    for (; ; ) {
      i++;
      if (i==6){
        break;
      }
      System.out.println(i);
    }  
    System.out.println(i);
  }
}
