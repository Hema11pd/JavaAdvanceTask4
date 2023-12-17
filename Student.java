package JavaAdvanceTask4;

class AgeNotWithinRangeException extends Exception {

    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception{
    public NameNotValidException(String message){
        super(message);
    }
}
public class Student {
    private int rollno;
    private String name;
    private int age;
    private String course;


    public Student(int rollno,String name,int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if(age <15 || age >21)
        {
            throw new  AgeNotWithinRangeException("Age should be between 15 and 21");
        }
        if(!isValidName(name)){
            throw new NameNotValidException("age is not valid");
        }
         this.rollno = rollno;
         this.name   = name;
         this.age    = age;
         this.course = course;


}
private boolean isValidName(String name)
{
    return name.matches("[a-zA-Z ]+");
}

public void display()
{
    System.out.println("Roll: "+rollno);
    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
    System.out.println("Course: "+course);
}

    public static  void main(String[] args) {
   try{
       Student student = new Student(10,"hema",19,"ece");
       student.display();
       Student student1 = new Student(10,"hema",22,"ece");
       student1.display();
   }
   catch(AgeNotWithinRangeException|NameNotValidException e)
   {
       System.out.println("Exception: " + e.getMessage());
   }

    }
}
