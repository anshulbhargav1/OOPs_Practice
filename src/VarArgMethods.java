class A{
    void m1(int ... arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
            count++;  
        }
        System.out.println();
        System.out.println("no of parameters: "+ count);

    }
}

public class VarArgMethods{
    public static void main(String[] args) {
        A a = new A();
        a.m1(10,20,30);
        
    }
}