package Activity02;
import java.util.Scanner;
public class Person{
    private String name;
    private int Id;

    public Person(String name, int Id){
        this.name = name;
        this.Id = Id;
    }

    public String getName(){
        return name;
    }
    public int getId(){
        return Id;
    }

    public void displayInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Id: " + getId());
    }

    public static class Students extends Person{
        private String gradeLevel;

        public Students(String name, int Id, String gradeLevel){
            super(name, Id);
            this.gradeLevel = gradeLevel;
        }
        @Override
        public void displayInfo(){
            super.displayInfo();
            System.out.println("Grade Level: " + gradeLevel);
        }
    }
    public static class Teacher extends Person{
        private String subject;

        public Teacher(String name, int id, String subject){
            super(name, id);
            this.subject = subject;
        }
        @Override
        public void displayInfo(){
            super.displayInfo();
            System.out.println("Subject:" +subject);
        }
    }
        public static class Staff extends Person{
            private String Department;

            public Staff(String name, int id, String Department){
                super(name, id);
                this.Department = Department;
            }

            @Override
            public void displayInfo(){
                super.displayInfo();
                System.out.println("Department: " + Department);
            }
        }

        public static class SchoolTest {
            public static void main(String [] args){
                Students student = new Students("Benedict Bautista", 1081433, "College Student");
                Teacher teacher = new Teacher("Archie Menisis", 1081434, "Computer Science");
                Staff staff = new Staff("Rafael Requizo", 1081435, "IT Department");

                student.displayInfo();
                System.out.println();
                teacher.displayInfo();
                System.out.println();
                staff.displayInfo();
                System.out.println();
            }
        }
}
    
    
