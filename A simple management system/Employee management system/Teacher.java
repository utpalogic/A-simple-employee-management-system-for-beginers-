
/**
 * Write a description of class Teacher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Teacher //This is the parent class
{
    //private attributes which cannot be accesed by their child classes 
    private int teacher_id;        
    private String teacher_name;
    private String address;
    private String working_type;
    private String employment_status;
    private int working_hours;
    //A constructor is created which accepts parameters
    public Teacher(int teacher_id,String teacher_name, String address, 
    String working_type, String employment_status)
    {
        //constructor is called by using this keyword
        this.teacher_id = teacher_id;
        this.teacher_name = teacher_name;
        this.address = address;
        this.employment_status = employment_status;
        this.working_type = working_type;
    }
    //each attribute gets a getter method to access the value of private
    //attributes
    public int getTeacher_id()
    {
         return this.teacher_id; //return is added because it has a return type
    }
    public String getTeacher_name()
    {
         return this.teacher_name;
    }
    public String getAddress(){
        return this.address;
    }
    
    public String getEmployment_status(){
        return this.employment_status;
    }
    public int getWorking_hours(){
        return this.working_hours;
    }
    public String getWorking_type(){
        return this.working_type;
    }
    public void setWorking_hours(int working_hours){ //setter has a same name parameter
         this.working_hours=working_hours;
        }
    
    public void display(){
        System.out.println("The teacher id is:"+teacher_id); //printing the values
        System.out.println("The name of teacher is "+teacher_name);//pri ting the teacher name
        System.out.println("The address of teacher is "+address); //printing the teacher address
        System.out.println("The working type of teacher is "+working_type); //printing working type of teacher
        System.out.println("The employment status of teacher is "+employment_status); //printing employee status
        if (working_hours != 0){
        System.out.println("The working hour of teacher is "+working_hours);
        }
        else{
        System.out.println("Sorry the working hours have not been assigned yet");
        }
        
    }

}
