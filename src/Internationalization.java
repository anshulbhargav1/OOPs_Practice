import java.text.NumberFormat;
import java.util.*;

public class Internationalization {
    public static void main(String[] args) {
        Locale l = Locale.of("it", "IT","win");
        NumberFormat nf = NumberFormat.getInstance(l);
        System.out.println(nf.format(1234567.3456));
       
        
        
    }
    
}
