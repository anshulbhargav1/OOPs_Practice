class Account{
    private int accNo;
    private String accName;
    private double balance;
    public Account(int accNo, String accName, double balance) {
        this.accNo = accNo;
        this.accName = accName;
        this.balance = balance;
    }
    public void getDetails() {
        System.out.println("Account details");
        System.out.println("Account no: " + accNo);
        System.out.println("Account name: " + accName);
        System.out.println("Account balance: " + balance);

    }

}


class Employee{
    private int eid;
    private String ename;
    private Long esal;
    private Account account;
    public Employee(int eid, String ename, Long esal, Account account) {
        this.eid = eid;
        this.ename = ename;
        this.esal = esal;
        this.account = account;
    }
    public void getDetails() {
        System.out.println("Employee details");
        System.out.println("Employee no: " + eid);
        System.out.println("Employee name: " + ename);
        System.out.println("Employee balance: " + esal);
        System.out.println();
        account.getDetails();
    }

}




public class ConstructorDependency {
    public static void main(String[] args) {
        Account account = new Account(1, "John Doe", 20000.00);
        Employee emp = new Employee(111,"John",400000L,account);
        emp.getDetails();

    }
}
