


/**
 * Coursework of programming year 1
 * TO hire staffs
 * @theprajwal007
 * @version 0.1
 */
//creating a sub or child calss name FullTimeStaffHire of super class StaffHire
public class FullTimeStaffHire extends StaffHire
{
    //declearing attributes using (private) access modifier to use within this class only
    private int salary;
    private int workingHours;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;

    //creating constructor having parameter like vacancyNumber,designation,jobType,salary,workingHours
    public FullTimeStaffHire(int vacancyNumber,String designation,String jobType,int salary,int workingHours){
        //for accessing instance variable and methos from super class (super) keyword is used
        super(vacancyNumber,designation,jobType);
        //to set the value for instance variables "this." is used
        this.salary=salary;
        this.workingHours=workingHours;
        this.staffName="";
        this.joiningDate="";
        this.qualification="";
        this.appointedBy="";
        this.joined=false;
    }

    // creating accessor method name Salary which return initialized value of instance variable
    public int getSalary(){
        return salary;
    }

    // creating accessor method name WorkingHours which return initialized value of instance variable
    public int getWorkingHours(){
        return workingHours;
    }

    // creating accessor method name StaffName which return initialized value of instance variable
    public String getStaffName(){
        return staffName;
    }

    // creating accessor method name Qualification which return initialized value of instance variable
    public String getQualification(){
        return qualification;
    }

    // creating accessor method name joiningDate which return initialized value of instance variable
    public String getJoiningDate(){
        return joiningDate;
    }

    // creating accessor method name AppointedBy which return initialized value of instance variable
    public String getAppointedBy(){
        return appointedBy;
    }

    /*creating mutator method name Salary 
     * check if joined is true a messege is display
     * else value  of is set
     */
    public void setsalary(int salary){
        if (joined==true){
            System.out.println("salary of this staff is "+getSalary());
        }
        else{
            this.salary=salary;
        }
    }

    // creating mutator method name WorkingHours to set value of WorkingHours
    public void setWorkingHours(int workingHours){
        this.workingHours=workingHours;
    }

    /*a method is created name hireFulltimeStaff with parameter like staffName,joiningDate,qualification and appointedBy
    * check if joined is true a messege is display
    * else value of staffName,joiningDate,qualification and appointedBy is set
    */
   public void hireFullTimeStaff(String staffName,String joiningDate,String qualification,String appointedBy){
       if (joined==true){
           System.out.println("Staff is already appointed");
        }
        else{
            this.staffName=staffName;
            this.joiningDate=joiningDate;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            joined=true;
        }
       }

    /*a method name displayInfo is created
     * displayInfo method of super class is called using super key word
     * value of staffName,salary,workingHours,joiningDate,qualification and appointedBy is display with proper messege
     */
    public void display(){
        super.display();
        if (joined==true){
            System.out.println("staff name: "+getStaffName());
            System.out.println("salary: "+getSalary());
            System.out.println("working Hours: "+getWorkingHours());
            System.out.println("joining date: "+getJoiningDate());
            System.out.println("Qualification: "+getQualification());
            System.out.println("Appointed by: "+getAppointedBy());
        }
    }
}

    