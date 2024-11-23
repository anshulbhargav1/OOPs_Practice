import java.io.BufferedReader;
import java.io.InputStreamReader;


public class IoStream {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the data : ");
        String data  = br.readLine();
        System.out.print("enter the next data : ");
        int num = br.read();
        System.out.println(data + " " + num);
    }
}
