class Custom{
    static{
        System.out.println("Loading Class bytecode....");
    }
    Custom(){
        System.out.println("Object Creation......");
    }
}
// forname method: only loading class bytecode to memory not creating a object..
public class ForNameMethod {
    public static void main(String[] args) throws Exception {
        Class cls = Class.forName("Custom");
        System.out.println("class Name: "+cls.getName());
        System.out.println("Super class Name: "+cls.getSuperclass().getName());
        Object obj = cls.newInstance();



        
    }
    
}
