abstract class A{
    int x = 10;
    abstract void m1();
    abstract void m2();  
    void m0(){
        System.out.println("hello i am from m0 - method");
    }
}
//you have to abstract keyword because one abstract method is available
abstract class B extends A{
    int y = 20;

    // this variable is access by className because static ...
    static int z = 30;
    void m1(){
        System.out.println("hello i am from m1 - method");
    }
    void m2(){
        System.out.println("hello i am from m2- method");
    }
    void m3(){
        System.out.println("hello i am from m3- method");
    }
    abstract void m4();


}
class C extends B{
    static int q = 12;
    String name = "anshul"; 
    void m4(){
        System.out.println("hello i am from m4 -method ");
    }
}


public class AbstractClass {
    public static void main(String[] args) {
        // abstract class allow only refrence variable not allowing creating objects..
        A a = new C();
        B b = new C();
        C c = new C();
        // Access only concrete method
        a.m0();
        System.out.println("----");
        b.m0();
        b.m1();
        b.m2();
        b.m3();
        System.out.println("=====");
        c.m0();
        c.m1();
        c.m2();
        c.m3();
        c.m4();
        System.out.println("+++++");
        System.out.println(a.x);// non static varible access by refrence varible..
        System.out.println(b.x);// subclass is able to access all memeber of superclass..
        System.out.println(c.x);
        System.out.println("_____");
        System.out.println(B.z);// static varible access by class name
        
    }
    
}
