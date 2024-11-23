class A{
    int i = m1();
    int l = 13;
    int m = 15; 
    A(int i ){
        this();
        System.out.println(this.i);
        System.out.println(i);  
        System.out.println("A-con");  
    }
    A(){
        this(12,2);
        System.out.println("int-par-con");
        m1();
    }
    A(int i, int j){
        System.out.println("int two para con");
        m1();
        
    }
    int m1(){
        System.out.println();
        System.out.println("m1-method");
        System.out.println(l+m);
        return 10;

    }

}

public class ThisKeyword {
    public static void main(String[] args) {
        A a = new A(101);
        a.l = 189;
        a.m = 299;
        a.m1();

        System.out.println();
        A a1 = new A(14,56);
        a1.l = 400000;
        a1.m = 122112;
        a.m1();
        
    }
    
}
