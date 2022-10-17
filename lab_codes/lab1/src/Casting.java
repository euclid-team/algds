class Casting {
    public static void main(String[] args)
    { 

        double a = 2;  // a = 2.0 (Implicit)
        // int b = 18.7;      // ERROR
        int c = (int)18.7;      // a = 18
        double d = 2/3; // a = 0.0
        double e = (double)2/3; // a = 0.6666..

  
        System.out.println(a); 
        //System.out.println(b); 
        System.out.println(c); 
        System.out.println(d); 
        System.out.println(e); 

    } 
} 
