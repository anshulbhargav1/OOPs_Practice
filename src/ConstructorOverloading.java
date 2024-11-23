class A{
    int x,y,z;
    A(){

    }
    A(int i){
        x = i;
        
    }
    A(int i, int j){
        x = i;
        y = j;
       
    }
    A(int i, int j, int k){
        x = i;
        y = j;
        z = k;
        
    }
    void add(){
        System.out.println(x+y+z);

    }
}

public class ConstructorOverloading{
    public static void main(String[] args) {
        A a = new A(2, 444);
        a.add();
        

        
    }
}