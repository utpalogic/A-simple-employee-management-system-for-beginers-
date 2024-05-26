
/**
 * Write a description of class Tutor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
//Tutor is the child class of the teacher
public class Tutor extends Teacher
{
    //private access modifier is created for getter method
    private double salary;
    private String specialization;
    private String academic_qualifications;
    private int performanceIndex;
    private boolean isCertified;
    //A constructor is created which accepts parameters
    public Tutor (int teacher_id,String teacher_name,String address,String working_type,String employment_status,
    int working_hours,double salary,String specialization,String academic_qualifications,int performanceIndex)
    {
        super( teacher_id,teacher_name,address,working_type,employment_status);
        setWorking_hours(working_hours);
        this.salary = salary;
        this.specialization = specialization;
        this.academic_qualifications = academic_qualifications;
        this.performanceIndex = performanceIndex;
        this.isCertified = false;
    }
    //each attribute gets a getter method to access the value of private
    //attributes
    public double getSalary()
    {
        return this.salary; //returns salary
    }
    public String getSpecialization()
    {
        return this.specialization; //returns specialization
    }
    public String getAcademic_qualifications()
    {
        return this.academic_qualifications; //returns academic qualification
    }
    public int getPerformanceIndex()
    {
        return this.performanceIndex;   //returns performance index
    }
    public boolean getIscertified()
    {
        return this.isCertified;    // returns iscertified
    }
    //setsalary method is created to display the salary after appraisal
    public void setSalary(double salary,int performanceIndex )
    {
        if(performanceIndex > 5 && getWorking_hours() > 20){
        double appraisal=0;
            if(performanceIndex >= 5 && performanceIndex <= 7){
            appraisal=0.05;
            }
            else if(performanceIndex >= 8 && performanceIndex <=9 ){
             appraisal=0.10;
            }
           else if(performanceIndex == 10){
             appraisal=0.20;
            }
            else{
            System.out.println("This isn't a valid appraisal");
            }
        this.salary += appraisal * this.salary; //formula to calculate total salary after appraisal
        this.isCertified=true;
        }
        else 
        {
        System.out.println("Tutor has not been certified yet so the salary cannot be approved");
        }
    }
    //A method remove tutor is created to remove tutor if the tutor is not cetified
    public void removeTutor()
    {
       if(!isCertified) {
           double salary = 0;
           String specialization = null;
           String academic_qualifications = null;
           int performanceIndex = 0;
           isCertified = false;
           System.out.println("Tutor is removed sucessfully");
       }
       else{
           System.out.println("Tutor is certified so tutor cannot be removed");
       }
    }
    //display method is created to print the output
    public void display()
    {
        if(!isCertified){
            //display method of teacher class is called using super keyword
        super.display();       
        }
        else{
        super.display();
        System.out.println("The salary of tutor is "+salary);
        System.out.println("The specialization is of tutor is "+specialization);
        System.out.println("The academic qualification of tutor is "+academic_qualifications);
        System.out.println("The performanceIndex is of tutor is "+performanceIndex);
        }
         }
}




