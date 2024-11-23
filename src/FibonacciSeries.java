public class FibonacciSeries{
    public static void main(String[] args) {
        // fibonacciSeries upto to 100.....
        int a = 0;
        int b = 1;
        System.out.print(a+ " ");
        System.out.print(b + " ");
        
        // Improvised approach and for loop concept utilisation....

        for(int result = a + b; result <= 100; a = b, b = result, result = a+b){
            System.out.print(result + " ");
        }


        // Approach 1
        //int result = a +b;
        /*for(int i = 3; i <= 20; i++){
            int result = a + b;
            if(result <= 100){
                System.out.print(result+" ");
                a = b;
                b = result;
            }
        } */
       // Approach 2

        /*for(; result <= 100;){
            result = a + b;
            System.out.print(result + " ");
            a = b;
            b = result;
           
        }*/
        
    }
}