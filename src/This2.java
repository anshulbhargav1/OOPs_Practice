class A{
    int i = 10;
    int j = 20;
}
class B extends A{
    int i = 30;
    int j  = 40;
    void m1(int i, int j){
        System.out.println(i+this.i+super.i);
        System.out.println(j+this.j+super.j);
    }
}

public class This2 {
    public static void main(String[] args) {
        B b = new B();
        b.m1(50, 60);
    }
    
}
