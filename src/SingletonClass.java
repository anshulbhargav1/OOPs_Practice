class A{
    static A a = null;
    private A(){
        System.out.println("hello anshul");
    }
    public static A getAcess(){
        if(a == null){
            a = new A();
            return a;
        }
        else{
            return a;
        }
    }
}
public class SingletonClass {
    public static void main(String[] args) {
        A.getAcess();
        A.getAcess();
        
        
    }
    
}
