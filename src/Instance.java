class A{
    // private variable is access by respective class only 
    private int i = 14;
    Integer I;
    String str = "anshul";
    static int j = 15;

    A(){
        System.out.println("A constructor---");
    }
    
    void m1(){
        // this method is for display private variable ...
        // Instance Methods are able to operate on both instance variables and static variables.
        System.out.println("instance vaaible:"+i);
        System.out.println("static variable: "+j);
    }
}

public class Instance {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        a2.str = "bhargav";
    
        // a separate copy of the instance variables are maintained 
        //for each and every object of the same class.
        a1.m1();
        System.out.println(a1.str);
        // get different value because a separate copy of the instance variables are maintained
        System.out.println(a2.str);
        // we can j by class name because it is static method
        System.out.println(A.j);

       /*  A a3 = null;
        System.out.println(a3.str);  */ // NullpointerException....
        
        

    
}
}
