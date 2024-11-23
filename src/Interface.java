interface I{
    int x = 10; // by deauflt public, static and final...
    static int y =  20;// not required explicitly..
    abstract void m1();// not required explicitly..(public and abstract)
    abstract void m2();
    class B{// inside interface all the inner class is static by deauflt..
        static String m9(){
            return "anshul ..snfw";
        }
    }
    
}
interface I2{
    void m3();// by deafult public and abstract...
    void m4();
}
class C implements I,I2{
    public void m1(){//Giving public beacuse in interface method are public and astract deauft 
                     //when to Reuse for convert into concrete methode use As public.. 
        System.out.println("m1");
    }
    public void m2(){
        System.out.println("m2");
    }

    public void m3(){
        System.out.println("hello from m3---");
    }
    public void m4(){
        System.out.println("m4");
    }
}


public class Interface{
    public static void main(String[] args){
        C c = new C();
        c.m1();
        c.m2();
        c.m3();
        c.m4();
        System.out.println(I.B.m9());
        System.out.println(I.x);// possible by calling its class name 
                                //because public static final default in interface....                     

    }
}