
/**
 * Write a description of class TeacherGUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
//importing components and arraylist
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.ButtonGroup;
import java.awt.Font;
import java.awt.Color;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import java.awt.Image;

public class TeacherGUI implements ActionListener
{
    JFrame frame;
    
    JTabbedPane tabbedPane;
    //label component
    JLabel paneln,panelna, teacherid,teachername,address,working,employment,working_hours,department,yearsofexperience,graded_score,
    salary,specialization,academic,performance_index,
    //label for panel2
     t_id,t_name,t_add,t_work,t_employ,t_working,t_salary,t_specialization,t_academic,t_performance;
    //textfield component panel1
    JTextField teacherid1,teachername1,address1,working_hours1,department1,yearsofexperience1,
    graded_score1,salary1,specialization1,academic1,performance_index1,
    //textfield for panel2
    t_id1,t_name1,t_add1,t_work1,t_employ1,t_working1,t_salary1,t_specialization1,t_academic1,t_performance1;
    //buttons
    JButton Lec,Grade,Dis,Clear,Tut,Display,Clear1,Salary,Remove;
    //radio buttons
    JRadioButton temporary,permanent,contract,employed,unemployed,temporary1,permanent1,employed1,unemployed1;
    //combobox
    JComboBox box,dep1;
    JPanel panel1,panel2;
    public ArrayList<Teacher> TeachersList;
    public TeacherGUI()
    {
        //creating objects for panel 1
        frame=new JFrame("Employee management system of xyz college");
        panel1=new JPanel();
        paneln=new JLabel("LECTURER");
        teacherid=new JLabel("TeacherID:");
        teachername=new JLabel("Teacher Name:");
        address=new JLabel("Address:");
        working=new JLabel("Working Type:");
        employment=new JLabel("Employment Status:");
        working_hours=new JLabel("Working Hours:");
        department=new JLabel("Department:");
        yearsofexperience=new JLabel("Years of Experience:");
        graded_score=new JLabel("Graded Score:");
        salary=new JLabel("Salary:");
        specialization=new JLabel("Specialization:");
        academic=new JLabel("Academic:");
        performance_index=new JLabel("Performance Index:");
        tabbedPane = new JTabbedPane();
        TeachersList = new ArrayList<Teacher>();
        
        //creating objects for panel2
        panel2=new JPanel();
        panelna=new JLabel("TUTOR");
        t_id=new JLabel("TeacherID:");
        t_name=new JLabel("Teacher Name:");
        t_add=new JLabel("Address:");
        t_work=new JLabel("Working Hour:");
        t_employ=new JLabel("Employment Status:");
        t_working=new JLabel("Working Type:");
        t_salary=new JLabel("Salary:");
        t_specialization=new JLabel("Specialization:");
        t_academic=new JLabel("Academic Qualification:");
        t_performance=new JLabel("Performance Index:");
        
        //creating textfield objects for panel 1
        teacherid1=new JTextField();
        teachername1=new JTextField();
        address1=new JTextField();
        working_hours1=new JTextField();
        yearsofexperience1=new JTextField();
        graded_score1=new JTextField();
        salary1=new JTextField();
        specialization1=new JTextField();
        academic1=new JTextField();
        performance_index1=new JTextField();
        
        // creating textfields for panel 2
        t_id1=new JTextField();
        t_name1=new JTextField();
        t_add1=new JTextField();
        t_working1=new JTextField();
        t_salary1=new JTextField();
        t_specialization1=new JTextField();
        t_academic1=new JTextField();
        t_performance1=new JTextField();
        
        //creating radio button for panel 1
        temporary=new JRadioButton("Temporary");
        permanent=new JRadioButton("Permanent");
        ButtonGroup work=new ButtonGroup();
        work.add(temporary);
        work.add(permanent);
        
        //creating radio button panel 2
        temporary1=new JRadioButton("Temporary");
        permanent1=new JRadioButton("Permanent");
        ButtonGroup work1=new ButtonGroup();
        work1.add(temporary1);
        work.add(permanent1);
        
        //creating radio button panel 1
        employed=new JRadioButton("Employed");
        unemployed=new JRadioButton("Unemployed");
        ButtonGroup status=new ButtonGroup();
        status.add(employed);
        status.add(unemployed);
        
        //creating radio  button for panel 2
        employed1=new JRadioButton("Employed");
        unemployed1=new JRadioButton("Unemployed");
        ButtonGroup status1=new ButtonGroup();
        status1.add(employed1);
        status1.add(unemployed1);
        
        //creating combobox
        box=new JComboBox();
        String[]Department={"Computer","Science","Art","Mathematics","History","Business","Physics","Chemistry","English"};
        dep1=new JComboBox<String>(Department);
        
        //creating button objects
        Lec=new JButton("Add lecturer");
        Tut=new JButton("Add Tutor");
        Grade=new JButton("Grade Assignment");
        Salary=new JButton("Set salary of tutor");
        Remove=new JButton("Remove tutor");
        Dis=new JButton("Display");
        Clear=new JButton("Clear");
        Display=new JButton("Display");
        Clear1=new JButton("Clear");
        //adding action listener
        Lec.addActionListener(this);
        Tut.addActionListener(this);
        Grade.addActionListener(this);
        Salary.addActionListener(this);
        Remove.addActionListener(this);
        Dis.addActionListener(this);
        Clear.addActionListener(this);
        Clear1.addActionListener(this);
        Display.addActionListener(this);
        
        // Create panels for each tab
       panel1 = new JPanel() 
       {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon imageIcon = new ImageIcon("C:\\Programming\\2nd sem programming\\panel2.jpg");
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
       };
        panel1.setOpaque(false); // Make the panel transparent to show the background image
        
       panel2 = new JPanel() 
       {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon imageIcon = new ImageIcon("C:\\Programming\\2nd sem programming\\panel1.jpg");
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
       };
        panel2.setOpaque(false);
       //setting the width height and placement of the components
       panel1.setBounds(40,15,1200,300);
       panel1.add(teacherid);
       panel1.add(teachername);
       panel1.add(address);
       panel1.add(working);
       panel1.add(working_hours);
       panel1.add(employment);
       panel1.add(graded_score);
       panel1.add(department);
       panel1.add(yearsofexperience);
       panel1.add(paneln);
       //buttons
       panel1.add(Lec);
       panel1.add(Dis);
       panel1.add(Clear);
       panel1.add(Grade);
       //textfield
       panel1.add(teacherid1);
       panel1.add(teachername1);
       panel1.add(address1);
       panel1.add(temporary);
       panel1.add(permanent);
       panel1.add(employed);
       panel1.add(working_hours1);
       panel1.add(unemployed);
       panel1.add(graded_score1);
       panel1.add(dep1);
       panel1.add(yearsofexperience1);
       //setBounds of 1st panel
       teacherid.setBounds(20,60,100,25);
       teacherid.setFont(new Font("Ariel",Font.BOLD,18));
       
       teachername.setBounds(20,130,150,25);
       teachername.setFont(new Font("Ariel",Font.BOLD,18));
       
       address.setBounds(20,200,90,25);
       address.setFont(new Font("Ariel",Font.BOLD,18));
       
       working.setBounds(490,60,190,25);
       working.setFont(new Font("Ariel",Font.BOLD,18));
       
       employment.setBounds(20,265,200,25);
       employment.setFont(new Font("Ariel",Font.BOLD,18));
       
       working_hours.setBounds(20,325,170,25);
       working_hours.setFont(new Font("Ariel",Font.BOLD,18));
       
       graded_score.setBounds(490,130,170,25);
       graded_score.setFont(new Font("Ariel",Font.BOLD,18));
       
       department.setBounds(490,265,200,25);
       department.setFont(new Font("Ariel",Font.BOLD,18));
       
       yearsofexperience.setBounds(490,200,190,25);
       yearsofexperience.setFont(new Font("Ariel",Font.BOLD,18));
       
       paneln.setBounds(350,0,130,50);
       paneln.setFont(new Font("Ariel",Font.BOLD,18));
       //adding textfield for panel 1
       teacherid1.setBounds(120,60,120,25);
       teachername1.setBounds(160,130,120,25);
       address1.setBounds(120,200,120,25);
       employed.setBounds(210,265,100,30);
       unemployed.setBounds(330,265,100,30);
       temporary.setBounds(630,60,100,30);
       permanent.setBounds(740,60,100,30);
       working_hours1.setBounds(170,325,120,25);
       graded_score1.setBounds(630,130,120,25);
       dep1.setBounds(620,265,120,25);
       yearsofexperience1.setBounds(680,200,120,30);
       //adding buttons for panel 1
       Lec.setBounds(20,370,180,40);
       Lec.setFont(new Font("Ariel",Font.BOLD,15));
       Grade.setBounds(230,370,180,40);
       Grade.setFont(new Font("Ariel",Font.BOLD,15));
       Dis.setBounds(440,370,180,40);
       Dis.setFont(new Font("Ariel",Font.BOLD,15));
       Clear.setBounds(650,370,180,40);
       Clear.setFont(new Font("Ariel",Font.BOLD,15));
       
       /*styels
       panel1.setBackground(Color.white);
       details of panel 2*/
       tabbedPane.setBounds(0,0,870,800);
       panel2.setBounds(40,340,1200,330);
       panel2.add(panelna);
       panel2.add(t_id);
       panel2.add(t_name);
       panel2.add(t_add);
       panel2.add(t_work);
       panel2.add(t_employ);
       panel2.add(t_working);
       panel2.add(t_salary);
       panel2.add(t_specialization);
       panel2.add(t_academic);
       panel2.add(t_performance);
       //adding text field
       panel2.add(t_id1);
       panel2.add(t_name1);
       panel2.add(t_add1);
       panel2.add(temporary1);
       panel2.add(permanent1);
       panel2.add(employed1);
       panel2.add(unemployed1);
       panel2.add(t_working1);
       panel2.add(t_salary1);
       panel2.add(t_specialization1);
       panel2.add(t_academic1);
       panel2.add(t_performance1);
       //adding buttons
       panel2.add(Tut);
       panel2.add(Display);
       panel2.add(Salary);
       panel2.add(Clear1);
       panel2.add(Remove);
       //giving the setbounds value to all components of panel 2
       // Labels
        panelna.setBounds(350, 0, 130, 50);
        panelna.setFont(new Font("Arial", Font.BOLD, 18));

        // Labels on the left side
        t_id.setBounds(20,60,100,25);
        t_id.setFont(new Font("Arial", Font.BOLD, 18));
        t_name.setBounds(20,110,150,25);
        t_name.setFont(new Font("Arial", Font.BOLD, 18));
        t_add.setBounds(20,165,90,25);
        t_add.setFont(new Font("Arial", Font.BOLD, 18));
        t_work.setBounds(20,225,150,25);
        t_work.setFont(new Font("Arial", Font.BOLD, 18));
        t_working.setBounds(20,290,190,25);
        t_working.setFont(new Font("Arial", Font.BOLD, 18));
        t_employ.setBounds(390,60,190,25);
        t_employ.setFont(new Font("Arial", Font.BOLD, 18));
        t_salary.setBounds(390, 110, 100, 25);
        t_salary.setFont(new Font("Arial", Font.BOLD, 18));
        t_specialization.setBounds(390, 165, 150, 25);
        t_specialization.setFont(new Font("Arial", Font.BOLD, 18));
        t_academic.setBounds(390, 225, 300, 25);
        t_academic.setFont(new Font("Arial", Font.BOLD, 18));
        t_performance.setBounds(390, 290, 200, 25);
        t_performance.setFont(new Font("Arial", Font.BOLD, 18));

        // Text Fields on the right side
        t_id1.setBounds(120,60,120,25);
        t_name1.setBounds(160,110,120,25);
        t_add1.setBounds(120,165,120,25);
        t_working1.setBounds(160,225,120,25);
        t_salary1.setBounds(460, 110, 120, 25);
        t_specialization1.setBounds(520, 165, 120, 25);
        t_academic1.setBounds(600, 225, 120, 25);
        t_performance1.setBounds(570, 290, 120, 25);

        // Radio Buttons on the right side
        temporary1.setBounds(160,290,100,30);
        permanent1.setBounds(260,290,100,30);
        employed1.setBounds(590,55,100,30);
        unemployed1.setBounds(690,55,100,30);

        // Buttons
        Tut.setBounds(20,350,180,40);
        Salary.setBounds(230,350,180,40);
        Display.setBounds(440,350,180,40);
        Remove.setBounds(650, 350, 180, 40);
        Clear1.setBounds(20,430,180,40);
        
        tabbedPane.addTab("Lecturer", panel1);
        tabbedPane.addTab("Tutor", panel2);
        frame.getContentPane().add(tabbedPane);
        //panel1.setBackground(Color.decode("#87CEFA"));

        panel1.setLayout(null);
        panel2.setLayout(null);
        frame.setLayout(null);
        frame.setSize(870,600);
        frame.setVisible(true);
        frame.setResizable(false);
        tabbedPane.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
   }
   //radio button selection for panel 1
    public String getSelectedwork()
   {
       if (temporary.isSelected()){
           return temporary.getText();
        }
        else if(permanent.isSelected()){
            return permanent.getText();
       }
       else{
           return null;
       }
   }

    public String getSelectedstatus()
   {
        if(employed.isSelected()){
            return employed.getText();
        }
        else if(unemployed.isSelected()){
            return unemployed.getText();
        }else{
            return null;
        }
   }
    //radio button selection for panel 2
    public String getSelectedwork1()
   {
       if (temporary1.isSelected()){
           return temporary1.getText();
        }
        else if(permanent1.isSelected()){
            return permanent1.getText();
       }
       else{
           return null;
       }
   }
    public String getSelectedstatus1()
   {
        if(employed1.isSelected()){
            return employed1.getText();
        }
        else if(unemployed1.isSelected()){
            return unemployed1.getText();
        }else{
            return null;
        }
   }
       //this method adds lecturer with unique id
    public void addLecturer() {
    try {
        if (teacherid1.getText().isEmpty() || teachername1.getText().isEmpty() || address1.getText().isEmpty() || getSelectedwork() == null
                || getSelectedstatus() == null || graded_score1.getText().isEmpty() || yearsofexperience1.getText().isEmpty() || dep1.getSelectedItem() == null
                || working_hours1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Empty TextField Found,Please fill them", "Info", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int teacher_id = Integer.parseInt(teacherid1.getText());
            String teacher_name = teachername1.getText();
            String address = address1.getText();
            String working_type = getSelectedwork();
            int working_hours = Integer.parseInt(working_hours1.getText());
            String employment_status = getSelectedstatus();
            int gradedScore = Integer.parseInt(graded_score1.getText());
            int yearsofExperience = Integer.parseInt(yearsofexperience1.getText());
            String department = (String) dep1.getSelectedItem();
            Lecturer obj1 = new Lecturer(teacher_id, teacher_name, address, working_type, employment_status, department, yearsofExperience, working_hours);
            if (TeachersList.isEmpty()) {
                TeachersList.add(obj1);
                JOptionPane.showMessageDialog(frame, "Lecturer is added successfully", "Info", JOptionPane.INFORMATION_MESSAGE);
                clearContent();
            } else {
                boolean flag = true;
                for (Teacher i : TeachersList) {
                    if (i instanceof Lecturer) {
                        if (teacher_id == i.getTeacher_id()) {
                            flag = false;
                            break;
                        }
                    }
                }
                if (flag == true) {
                    TeachersList.add(obj1);
                    JOptionPane.showMessageDialog(frame, "Lecturer is added successfully", "Info", JOptionPane.INFORMATION_MESSAGE);
                    clearContent();
                } else {
                    JOptionPane.showMessageDialog(frame, "Teacher ID already exists", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    } catch (NumberFormatException b) {
        JOptionPane.showMessageDialog(frame, "Please enter valid numeric and string values according to requirement", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }
       //this method adds tutor
   public void addTutor(){
    try {
        if (t_id1.getText().isEmpty() || t_name1.getText().isEmpty() || t_add1.getText().isEmpty() ||
            getSelectedwork1() == null || getSelectedstatus1() == null || t_working1.getText().isEmpty() ||
            t_salary1.getText().isEmpty() || t_specialization1.getText().isEmpty() || t_academic1.getText().isEmpty() ||
            t_performance1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Empty TextField Found, Please fill them", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            int teacher_id = Integer.parseInt(t_id1.getText());
            String teacher_name = t_name1.getText();
            String address = t_add1.getText();
            String working_type = getSelectedwork1();
            String employment_status = getSelectedstatus1();
            int working_hours = Integer.parseInt(t_working1.getText());
            double salary = Double.parseDouble(t_salary1.getText());
            String specialization = t_specialization1.getText();
            String academic_qualifications = t_academic1.getText();
            int performance_index = Integer.parseInt(t_performance1.getText());
            Tutor obj2 = new Tutor(teacher_id, teacher_name, address, working_type, employment_status,
            working_hours, salary, specialization, academic_qualifications, performance_index);
        if(TeachersList.isEmpty()){
            TeachersList.add(obj2);
        }
        else{
        // Check if teacher_id already exists
            boolean teacherExists = false;
            for (Teacher i : TeachersList) {
                if(i instanceof Tutor){
                if (i.getTeacher_id() == teacher_id) {
                    teacherExists = true;
                    break;
                }
            }
        }
        if (teacherExists) {
                JOptionPane.showMessageDialog(frame, "Teacher ID already exists", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                // Create new Tutor object and add it to TeachersList
                TeachersList.add(obj2);
                JOptionPane.showMessageDialog(frame, "Tutor is added successfully", "Info", JOptionPane.INFORMATION_MESSAGE);
                clearContent();
            }
        }
    }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(frame, "Please enter valid numeric values for ID, working hours, salary, and performance index", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }
    //this method grades the assignment 
    public void gradeAssignment() 
    {
    try {
        if (teacherid1.getText().isEmpty() || dep1.getSelectedItem() == null || graded_score.getText().isEmpty() || yearsofexperience1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Empty TextField Found,Please fill them", "Info", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int teacher_id = Integer.parseInt(teacherid1.getText());
            String department = (String) dep1.getSelectedItem();
            int gradedScore = Integer.parseInt(graded_score1.getText());
            int yearsofExperience = Integer.parseInt(yearsofexperience1.getText());
            boolean flag = false;
            for (Teacher i : TeachersList) {
                if (i instanceof Lecturer) {
                    Lecturer lecturer = (Lecturer) i;
                    if (lecturer.getTeacher_id() == teacher_id) {
                        lecturer.gradeAssignment(gradedScore, department, yearsofExperience);
                        JOptionPane.showMessageDialog(frame, "Assignment graded successfully!");
                        clearContent();
                        flag = true;
                        break;
                    }
                }
            }
            if (!flag) {
                JOptionPane.showMessageDialog(frame, "The object does not exist", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (NumberFormatException b) {
        JOptionPane.showMessageDialog(frame, "Please enter valid numeric and string values according to requirement", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }
    //sets the salary of tutor after appraisal
    public void setSalary()
    {
            try{
            if(t_id1.getText().isEmpty()||t_salary1.getText().isEmpty()||t_performance1.getText().isEmpty()){
               JOptionPane.showMessageDialog(frame,"Empty TextField Found,Please fill them","Info",JOptionPane.INFORMATION_MESSAGE);
        }
            else{
              int teacher_id= Integer.parseInt(t_id1.getText());
              double salary=Double.parseDouble(t_salary1.getText());
              int performance_index=Integer.parseInt(t_performance1.getText());
              boolean flag=false;
              for (Teacher i:TeachersList){
                if (i instanceof Tutor){
                    Tutor tutor=(Tutor) i;
                    if(tutor.getTeacher_id()==teacher_id){
                        tutor.setSalary(salary,performance_index);
                        JOptionPane.showMessageDialog(frame, "Salary Set Sucessfully!");
                        clearContent();
                        flag=true;
                        break;
                    }
                    else{
                        JOptionPane.showMessageDialog(frame, "The object doesnot exist", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
        }
        catch (NumberFormatException b) {
            JOptionPane.showMessageDialog(frame, "Please enter valid numeric and string values according to requirement", "Error", JOptionPane.ERROR_MESSAGE);
        }
   }
    //this method removes tutor
    public void removeTutorButton()
    {
            try{
            if(t_id1.getText().isEmpty()){
                JOptionPane.showMessageDialog(frame,"Empty TextField Found,Please fill them","Info",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                int teacher_id= Integer.parseInt(t_id1.getText());
                boolean flag=false;
                for(Teacher i:TeachersList){
                    if(i instanceof Tutor)
                        if(i.getTeacher_id()==teacher_id){
                        Tutor tutor =(Tutor) i;
                        tutor.removeTutor();
                        JOptionPane.showMessageDialog(frame, "Remove tutor button was clicked!");
                        clearContent();
                        flag=true;
                        break;
                    }
                    else{
                      JOptionPane.showMessageDialog(frame, "The object doesnot exist", "Error", JOptionPane.ERROR_MESSAGE);  
                    }
                }
            }
        }
        catch (NumberFormatException b) {
            JOptionPane.showMessageDialog(frame, "Please enter valid numeric and string values according to requirement", "Error", JOptionPane.ERROR_MESSAGE);
        }
   }
    //this method displays the contents of the Lecturer
   public void display() 
    {
          if (TeachersList.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "No Teachers to display!", "Info", JOptionPane.INFORMATION_MESSAGE);
        } 
        else {
            for (Teacher i : TeachersList) {
                if (i instanceof Lecturer) {
                    Lecturer lecturer = (Lecturer) i;
                    lecturer.display(); 
            }
            JOptionPane.showMessageDialog(frame, "The contents are displayed!");
            clearContent();
        }
        }
    }
    // this method displays the content of the tutor 
   public void displayTutor()
    {
        if(TeachersList.isEmpty()){
            JOptionPane.showMessageDialog(frame, "No Teachers to display!", "Info", JOptionPane.INFORMATION_MESSAGE); 
        }
        else{
            for(Teacher i :TeachersList){
                if(i instanceof Tutor){
                    Tutor tutor=(Tutor) i;
                    tutor.display();
                }
                JOptionPane.showMessageDialog(frame, "The contents are displayed!");
                clearContent();
            }
        }
    }

   public void clearButton()
    {
        // Clear text fields for panel 1
        JOptionPane.showMessageDialog(frame, "The contents are cleared");
        teacherid1.setText("");
        teachername1.setText("");
        address1.setText("");
        working_hours1.setText("");
        temporary.setSelected(false);
        permanent.setSelected(false);
        employed.setSelected(false);
        unemployed.setSelected(false);
        graded_score1.setText("");
        dep1.setSelectedIndex(0);
        yearsofexperience1.setText("");
    
        // Clear text fields for panel 2 only
        t_id1.setText("");
        t_name1.setText("");
        t_add1.setText("");
        temporary1.setSelected(false);
        permanent1.setSelected(false);
        employed1.setSelected(false);
        unemployed1.setSelected(false);
        t_working1.setText("");
        t_salary1.setText("");
        t_specialization1.setText("");
        t_academic1.setText("");
        t_performance1.setText("");
    }
    public void clearContent(){
       teacherid1.setText("");
        teachername1.setText("");
        address1.setText("");
        working_hours1.setText("");
        temporary.setSelected(false);
        permanent.setSelected(false);
        employed.setSelected(false);
        unemployed.setSelected(false);
        graded_score1.setText("");
        dep1.setSelectedIndex(0);
        yearsofexperience1.setText("");
    
        // Clear text fields for panel 2 only
        t_id1.setText("");
        t_name1.setText("");
        t_add1.setText("");
        temporary1.setSelected(false);
        permanent1.setSelected(false);
        employed1.setSelected(false);
        unemployed1.setSelected(false);
        t_working1.setText("");
        t_salary1.setText("");
        t_specialization1.setText("");
        t_academic1.setText("");
        t_performance1.setText(""); 
    }
    
    //using action performed to invoke buttons
   public void actionPerformed(ActionEvent a)
        {
            if(a.getSource()==Lec){
                addLecturer();
            }
            else if(a.getSource()==Tut){
                addTutor();
            }
            else if(a.getSource()==Grade){
                gradeAssignment();
            }
            else if(a.getSource()==Salary){
                setSalary();
            }
            else if(a.getSource()==Remove){
                removeTutorButton();
        }
            else if(a.getSource()==Dis){
                display();
            }
            else if(a.getSource()==Display){
                displayTutor();
            }
            else if(a.getSource()==Clear){
                clearButton();  
            }
            else if(a.getSource()==Clear1){
                clearButton();
        }
    }
    //main method
   public static void main(String[] args){
        new TeacherGUI();  
    }
}




   




        
        
        


    

