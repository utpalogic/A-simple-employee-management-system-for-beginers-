
/**
 * Write a description of class Lecturer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lecturer extends Teacher //Teacher is the parent class of the lecturer
{
    //private access modifier is created for getter method
    private String department; 
    private int yearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;
    //A constructor is created which accepts parameters
    public Lecturer(int teacher_id,String teacher_name,String address,String working_type,String employment_status,String department,
    int yearsOfExperience,int working_hours)
    {
        //The parameters of parent class is called using super keyword
        super( teacher_id,teacher_name,address,working_type,employment_status);
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
        this.gradedScore = 0;
        this.hasGraded = false;
        setWorking_hours(working_hours);
    
    }
    //creating getter method
    public String getDepartment()
    { //accesses the private instance variable
        return this.department; //returns department
    }
    public int getYearsOfExperience()
    {
        return this.yearsOfExperience;//returns years of experience
    }
    public boolean getHasGraded()
    {
        return this.hasGraded; //returns has graded
    }
    public int getGradedScore()
    {
        return this.gradedScore;//returns gradedScore
    }
    //creating setter method
    public void setGradedScore(int gradedScore)
    {
        this.gradedScore=gradedScore;
    }
    //A grade assignment method is created to grade assignment
    public void gradeAssignment(int gradedScore,String department,int yearsOfExperience)
    {
        this.gradedScore = gradedScore;
       if(yearsOfExperience >= 5 && this.department == department){
               if(gradedScore >= 70){
                System.out.println("The graded score is A");
                this.hasGraded=true;
                }
               else if(gradedScore >= 60 && gradedScore < 70){
               System.out.println("The graded score is B");
               this.hasGraded=true;
               }
               else if(gradedScore >= 50 && gradedScore < 60){
               System.out.println("The graded score is C");
               this.hasGraded=true;
               }
               else if(gradedScore >= 40 && gradedScore < 50){
               System.out.println("The graded score is D");
               this.hasGraded=true;
               }
               else {
               System.out.println("The graded score is E");
               this.hasGraded=true;
                }
                }
        else{
               System.out.println("The assignment has not been graded yet");
           
            }
    }
        //display method is created to display output
    public void display()
    {
        super.display();// calling the method of the teacher class
        if (hasGraded == true){
               System.out.println("The graded score is "+ gradedScore);
               System.out.println("The department is "+ department);
               System.out.println("The total years of experience is "+ yearsOfExperience);
        }else{
               System.out.println("The scores has not been graded");
               
           }
           
     }
    
}

