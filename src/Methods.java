import java.util.Arrays;

class C {
     void m5() {
        System.out.println("hello i am class C and m5 method");  // Method in class C
    }
}

class B {
    void m6() {
        System.out.println("hello i am from Class B and m6 method");  // Method in class B
    }
}

class A {
    // return type is primitive type, and parameter is also primitive.
    int m1(int i) {
        int x = i * 2;
        return x;
    }

    // return type is user-defined (String)
    String m2() {
        return "anshul";
    }

    // return type is array, creating an object for array.
    int[] m3() {
        return new int[]{1, 23};  // Returning an array ********
    }

    // In this case, array is passed as a parameter.
    int[] m7(int[] arr) {
        return arr;  // Returning the same array that was passed as a parameter
    }

    // Return type is Class B (user-defined), parameter is Class C (user-defined).
    B m4(C c) {
        B b = new B();  // Creating a new object of class B
        c.m5();  // Calling a method from class C (parameter)
        return b;  // Returning the object of class B
    }
}

public class Methods {
    public static void main(String[] args) {
        A a = new A();
        C c = new C();  // Creating an object of class C to pass as a parameter
        System.out.println(Arrays.toString(a.m3()));  // Printing the array returned by m3()
        System.out.println(a.m1(2));  // Printing the value returned by m1()

        B resultB = a.m4(c);  // Calling m4() with a C object, returning a B object
        resultB.m6();  // Calling method from returned B object (resultB)
        System.out.println("---------");
        System.out.println(a.m4(c)); // give the hascode value of class B beacuse create a object in it.
    }
}
