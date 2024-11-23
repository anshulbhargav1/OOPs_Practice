class Accounts{
    String accNo;
    String accHolderName;
    String accType;
    Long accBalance;


    Accounts(String acc_num, String acc_Holder_name, String acc_Type, Long acc_Balance){
        accNo = acc_num;
        accHolderName = acc_Holder_name;
        accType = acc_Type;
        accBalance = acc_Balance;
    }

//    public void setAccountDetails(){
//        accNo = "a111";
//        accHolderName = "anshul";
//        accType = "Saving";
//        accBalance = 5000000L;
//    }
    public void getAccountDetails(){
        System.out.println(accNo);
        System.out.println(accHolderName);
        System.out.println(accType);
        System.out.println(accBalance);
    }

}


public class Constructor {
    public static void main(String[] args) {
        Accounts accounts1 = new Accounts("a-111","Anshul","Saving",6000000L);
        //accounts.setAccountDetails();
        accounts1.getAccountDetails();
        System.out.println();
        Accounts accounts2 = new Accounts("a-222", "Gopal","current",100000000L);
        accounts2.getAccountDetails();
        System.out.println();
        Accounts accounts3 = new Accounts("a-333", "pradhumn","saving", 10987654L);
        accounts3.getAccountDetails();
        

    }
}
