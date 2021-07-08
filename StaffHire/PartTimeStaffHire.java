


/**
 * Coursework of programming year 1
 * TO hire staffs
 * @theprajwal007
 * @version 0.1
 */
//creating a sub calss name "FullTimeStaffHire" of super class "StaffHire"
public class PartTimeStaffHire extends StaffHire
{
    //declearing attributes using (private) access modifier to use within this class only
    private int wagesPerHours;
    private int workingHours;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    private boolean joined;
    private boolean terminated;
 
    //creating a constructor with parameters 
    public PartTimeStaffHire(int vacancyNumber,String designation,String jobType,int workingHours,int wagesPerHours,String shifts){
        //for accessing instance variable and methos from super class (super) keyword is used
        super(vacancyNumber,designation,jobType);
        //setting the value for instance variables using "this."
        this.workingHours=workingHours;
        this.wagesPerHours=wagesPerHours;
        this.shifts=shifts;
        this.staffName="";
        this.joiningDate="";
        this.qualification="";
        this.appointedBy="";
        this.joined=false;
        this.terminated=false;
        }   
        
        // creating accessor method named WagesPerHours which return initialized value of instance variable 
        public int getWagesPerHours(){
            return wagesPerHours;
        }

        // creating accessor method named WorkingHours which return initialized value of instance variable
        public int getWorkingHours(){
            return workingHours;
        }
        
        // creating accessor method named Shifts which return initialized value of instance variable
        public String getShifts(){
            return shifts;
        }

        // creating accessor method named StaffName which return initialized value of instance variable
        public String getStaffName(){
            return staffName;
        }
        
        // creating accessor method named joiningDate which return initialized value of instance variable
        public String getJoiningDate(){
            return joiningDate;
        }

        // creating accessor method named Qualification which return initialized value of instance variable
        public String getQualification(){
            return qualification;
        }

        // creating accessor method named AppointedBy which return initialized value of instance variable

        public String getAppointedBy(){
            return appointedBy;
        }
 
        /*Creating a method named hirePartTimeStaff 
         *checking if joined is true, a messege is displayed with staffName and joiningDate
         *else value of staffName,joiningDate,qualification,appointedBy,joined is true and terminated is false is set
         *and hired messege is displayed with staffName
         */
        public void hirePartTimeStaffs(String staffName,String joiningDate,String qualification,String appointedBy){
            if (joined==true){
                System.out.println(getStaffName()+" is already appointed "+" in "+getJoiningDate());
            }
            else{
                this.staffName=staffName;
                this.joiningDate=joiningDate;
                this.qualification=qualification;
                this.appointedBy=appointedBy;
                joined=true;
                terminated=false;
                System.out.println(staffName+" is successfully hired");
            }
        }

        /*a method name staffTermination is created
         *check if terminated is true a proper messsege is display
         *else set empty value to related variable and set joined is false and set is true
         */
        public void staffTermination(){
            if (terminated==true){
                System.out.println("Staff is already terminated");
            }
            else{
                this.staffName="";
                this.joiningDate="";
                this.qualification="";
                this.appointedBy="";
                joined=false;
                System.out.println("Staff terminated sucessfully!");
                terminated=true;
            }
        }

        /*a method name displayInfo is created
         * display method of super class is called using super key word
         * value of staffName,wagesPerHours,workingHours,joiningDate,qualification,appointedBy and incomePerDay is display with proper messege
         */
        public void display(){
            super.display();
            if (joined==true){
                System.out.println("Staff Name: "+getStaffName());
                System.out.println("Wages Per Hours: Rs"+getWagesPerHours());
                System.out.println("Working Hours: "+getWorkingHours());
                System.out.println("Joined dDate: "+getJoiningDate());
                System.out.println("Qualification: "+getQualification());
                System.out.println("Appointed By: "+getAppointedBy());
                System.out.println("Income Per Day: Rs"+getWagesPerHours()*getWorkingHours());
            }
        }
}
                                    


