class Customer1{
    private String cName;
    private int cId;
    private String cEmail;

    public void setCname(String customerName){
        cName = customerName;

    }
    public void setCid(int CustomerId){
        cId = CustomerId;
    }
    public void setCemail(String CustomerEmail){
        cEmail = CustomerEmail;
    }
    // take care of return type in get methods
    public String getCname(){
        return cName;
    }
    public int getCid(){
        return cId;
    }
    public String getCemail(){
        return cEmail;
    }

 
 }

public class SetterANDGetter {
    public static void main(String[] args) {
        Customer1 cust = new Customer1();
        cust.setCname("anshul");
        cust.setCid(1001);
        cust.setCemail("anshul@gmail.com");
        System.out.println("customer details");
        System.out.println("----------------");
        System.out.println(cust.getCname());
        System.out.println(cust.getCid());
        System.out.println(cust.getCemail());
        
    }
    
}
