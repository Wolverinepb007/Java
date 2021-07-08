
/**
 * Coursework of programming year 1
 * TO hire staffs
 * @theprajwal007
 * @version 0.1
 */
public class StaffHire
{
    private int vacancyNum;
    private String designation;
    private String jobType;
    
    public StaffHire(int vacancyNum, String designation, String jobType){
        this.vacancyNum=vacancyNum;
        this.designation=designation;
        this.jobType=jobType;
    }
    public int getvacancyNum(){
        return vacancyNum;
    }
    public void setvacancyNum(){
        this.vacancyNum=vacancyNum;
    }
    public String getdesignation(){
        return designation;
    }
    public void setdesigntion(){
        this.designation=designation;
    }
    public String getjobType(){
        return jobType;
    }
    public void setjobType(){
        this.jobType=jobType;
    }
    public void display(){
        System.out.println("Number Of Vacancy:"+vacancyNum);
        System.out.println("Designation:"+designation);
        System.out.println("Job Type:"+jobType);
        System.out.println("--------------------------");
    }
}
