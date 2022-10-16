class print
{ 
   public static void main(String args[]) 
   { 
       int i = 2;
       double r = Math.sqrt(i);
      
       System.out.print("Hello!"); 
       System.out.print("Java"); 

       System.out.println("Hello!"); 
       System.out.println("Java"); 
      
       System.out.println("The square root of " + i + " is " + r + ".");
       System.out.format("The square root of %d is %f.%n", i, r);
   } 
} 
