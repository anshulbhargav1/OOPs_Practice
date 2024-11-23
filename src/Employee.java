public class Employee {
    private String eName;
    private String esal;
    private DrivingLicence drivingLicence;

    public void setEmployeeName(String eName){
        this.eName = eName;
    }
    public String getEmployeeName(){
        return eName;
    }
    public void setEmployeeSal(String esal){
        this.esal = esal;
    }
    public String getEmployeeSal(){
        return esal;
    }
    public DrivingLicence getDrivingLicence(){
        return drivingLicence;
    }
    public void setDrivingLicence(DrivingLicence drivingLicence){
        this.drivingLicence = drivingLicence;
    }
 
 
 
    public void getEmployeeDetails(){
        System.out.println("Empoylee Details ");
        System.out.println("---------------------");
        System.out.println("Emp Name : "+ eName);
        System.out.println("Emp Sal : "+ esal);
        System.out.println();
        System.out.println("Licence Details");
        System.out.println("-------------------");
        System.out.println("Emp Name "+drivingLicence.getLicenceName());
        System.out.println("Emp Num "+drivingLicence.getLicenceNum());
        System.out.println("Emp Type "+drivingLicence.getLicenceType());
        System.out.println("Emp Date "+drivingLicence.getLicenceDate());
        System.out.println("Emp ExpDate "+drivingLicence.getLicenceExpDate());
    }
    
}
