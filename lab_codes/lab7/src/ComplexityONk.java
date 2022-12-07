public class ComplexityONk {
    static void comp_Onk(int arr[][]){
        //O(n^2) complexity
        int max=-1;
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                System.out.println("Position: " + i + " and " + j);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                if (arr[i][j]>max) max=arr[i][j];
            }
        }
        System.out.println("Max:"+ max);
    }

    public static void main(String args[])
    {
        int arr[][] = {{64, 34, 25, 12}, {22, 32, 11, 90}};
        comp_Onk(arr);
    }
}
