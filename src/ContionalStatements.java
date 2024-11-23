public class ContionalStatements {
    public static void main(String[] args) {
        // there is no else block, so the compiler cannot guarantee that j will always be initialized.
        // int k = 10;
        // int l;  // Initialize with a default value
        // if (k == 10) {
        //     l = 20;
        // } 
        // System.out.println(l);


        int i = 10;
        int j;
        if(i == 10){
            j = 20;
        }else{
            j = 30;
        }
        System.out.println(j);
 
 
        
    }
    
}
