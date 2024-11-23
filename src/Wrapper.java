public class Wrapper {
    public static void main(String[] args) {
        // convert Primitive data type to Object..
        // Method 1: Parameterized Constructor

        // int i = 10;
        // Integer in = new Integer(i);
        // System.out.println(i + " "+ in);

        // Method 2: Valueof method
        int j =12;
        Integer ji = Integer.valueOf(j);
        System.out.println(j+" "+ji);

        // Method3: Autoboxing
        int k = 13;
        Integer ki = k;
        System.out.println(k+" "+ki);

        // Convert object to PD
        // method1: xxxValue() method 
        // method 2: auto Unboxing
        Integer intg = Integer.valueOf(15);
        int z = intg.intValue();
        int h = intg;
        System.out.println(intg+" "+z+" "+h);

        String str = "10";
        double hi = Long.parseLong(str);
        System.out.println(hi);


        
    }
    
}
