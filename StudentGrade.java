package JavaAdvanceTask4;

import java.util.HashMap;

public class StudentGrade{
    HashMap<String ,Integer> hashmap;
    public StudentGrade()
    {
      hashmap  = new HashMap<>();
    }

    public void addStudent(String name,int grade){
        hashmap.put(name,grade);
        System.out.println("Student "+name+" added");

    }
    public void removeStudent(String name){
       if(hashmap.containsKey(name)){
           hashmap.remove(name);
           System.out.println("Student  "+name+" Removed");
        }
       else {
           System.out.println("Name not found");
       }


    }
    public void display(String name)
    {
        if (hashmap.containsKey(name)) {
            int grade = hashmap.get(name);
            System.out.println("Grade of student " + name + ": " + grade);
        } else {
            System.out.println("Student " + name + " not found");
        }
    }

    public static void main(String[] args)
    {
      StudentGrade Sg = new StudentGrade();
      //adding name and grade to the map
        Sg.addStudent("hema",10);
        Sg.addStudent("priya",12);
        Sg.addStudent("dharshini",13);
        //display before removing
        Sg.display("hema");
        Sg.display("priya");
        Sg.display("dharshini");
        //to remove name
        Sg.removeStudent("priya");
        //display after removing
        Sg.display("hema");
        Sg.display("priya");
        Sg.display("dharshini");




    }
}